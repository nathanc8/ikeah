import { Injectable } from '@angular/core';
import { Product } from '../models/product';

@Injectable({
  providedIn: 'root',
})
export class BasketService {
  basket: Product[] = [];

  getBasket() {
    console.log(this.basket);
    return [...this.basket];
  }

  addToBasket(product: Product) {
    this.basket.push(product);
  }

  removeFromBasket(product: Product) {
    // Trouve l'index du premier produit correspondant au type_id donné
    const index = this.basket.findIndex((p) => p.category === product.category);
    // Vérifie que l'élément existe et le supprime uniquement si un index valide est trouvé
    if (index !== -1) {
      this.basket.splice(index, 1);
    }
  }
}
