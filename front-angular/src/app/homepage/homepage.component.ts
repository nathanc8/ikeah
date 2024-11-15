import { Component, OnInit } from '@angular/core';
import { ProductService } from '../service/product.service';
import { ProductCardListComponent } from '../product-card-list/product-card-list.component';

@Component({
  selector: 'app-homepage',
  standalone: true,
  imports: [ProductCardListComponent],
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css',
})
export class HomepageComponent implements OnInit {
  constructor(private productService: ProductService) {}

  ngOnInit(): void {}
}
