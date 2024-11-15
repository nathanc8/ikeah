// Création de l'objet Product & déclaration + assignation des types de chacun des attributs lors de son appel.

export class Product {
  constructor(
    public id: number,
    public price: number,
    public reference: string[],
    public color: { id: number; name: string }[],
    public category: { id: number; name: string },
    public images: { url: string; is_main: boolean }[]
  ) {}
}
