import { Product } from './product';

// Création de l'objet Basket & déclaration + assignation des types de chacun des attributs lors de son appel.

export class Basket {
  constructor(public product: Product[]) {}
}
