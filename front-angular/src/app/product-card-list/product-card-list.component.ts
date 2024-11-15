import { Component, Input, OnInit } from '@angular/core';
import { Product } from '../models/product';
import { ProductCardComponent } from '../product-card/product-card.component';
import { ProductService } from '../service/product.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-product-card-list',
  standalone: true,
  imports: [ProductCardComponent, CommonModule, FormsModule],
  templateUrl: './product-card-list.component.html',
})
export class ProductCardListComponent implements OnInit {
  products!: Product[];
  filteredProducts!: Product[];
  minPrice: number = 0;
  maxPrice: number = 0;
  materialFilter: string = '';

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.productService.getProducts().subscribe((data: Product[]) => {
      console.log(data);
      this.products = data;
      this.filteredProducts = data;
      console.log('Products received:', this.products);
    });
  }

  filterProducts(): void {
    this.filteredProducts = this.products.filter((product) => {
      const matchesPrice =
        product.price >= this.minPrice && product.price <= this.maxPrice;
      return matchesPrice;
    });
  }

  trackByProductId(index: number, product: Product): number {
    return product.id;
  }
}
