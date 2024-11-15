import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common'; // Import de CommonModule pour *ngFor
import { Product } from '../models/product';
import { BasketService } from '../service/basket.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-card',
  standalone: true,
  imports: [CommonModule ], // Ajout de CommonModule ici
  templateUrl: './product-card.component.html',
  styleUrls: ['./product-card.component.css'],
})
export class ProductCardComponent {
  constructor(private basketService: BasketService, private router: Router) {}

  @Input() product!: Product;

  addProduct(product: Product): void {
    this.basketService.addToBasket(product);
  }

  getProduct(): void {
    this.basketService.getBasket();
  }

  onViewProduct(): void {
    this.router.navigateByUrl(`/productId/${this.product.id}`);
  }
}
