import { Component } from '@angular/core';
import { Router, RouterLink, RouterLinkActive } from '@angular/router';
import { BasketService } from '../service/basket.service';
import { Product } from '../models/product';


@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterLink, RouterLinkActive],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css',
})
export class HeaderComponent {

  constructor(private basketService: BasketService, private router: Router) {}

  getProduct(): void {
    this.basketService.getBasket();
  }
}
