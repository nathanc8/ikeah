import { Component, OnInit } from '@angular/core';
import { ProductCardComponent } from '../product-card/product-card.component';
import { ProductService } from '../service/product.service';
import { Product } from '../models/product';
import { Router } from '@angular/router';



@Component({
  selector: 'app-single-product-page',
  standalone: true,
  imports: [ProductCardComponent],
  templateUrl: './single-product-page.component.html',
  styleUrl: './single-product-page.component.css',
})
export class SingleProductPageComponent implements OnInit {
  product!: Product;
  href: string = "";

  constructor(private productService: ProductService, private router: Router) {}

  ngOnInit(): void {
    this.productService.getProductById(this.router.url).subscribe((data: Product) => {
      this.product = data;
      console.log('Products received:', this.product);
    });
    
  }

}
