# IKeyAhAngularClient

# TO DO WHEN CLONING

Aller dans le repertoire du projet Angular "IKeyAhAngularClient" à l'aide d'un terminal
Install tailwind & node modules :
npm install
npm install -D tailwindcss postcss autoprefixer

Pour run le server : `ng serve` ou `ng s` (le serveur s'auto update à la sauvegarde)

Pour générer un nouveau composant : `ng generate component component-name` ou `ng g c component-name`

Pour build le projet : `ng build`

Angular se repose sur des composants, un peu comme React, chaque composant a son propre fichier HTML, CSS & TS. Pour afficher un composant il faut l'appeler dans le fichier HTML (aussi appelé template) de la page qui sera chargée.

Fichier app.routes.ts : fichier qui va définir les différents liens disponibles et indiquer au serveur quel composant charger.

Le fichier qui sera appelé par le serveur sera toujours index.html, qui va lui même appeler app.component.html (grâce à la balise <app-root/>), et ce dernier appellera différents composants, dont un qui diffèrera en fonction de l'URL (grâce à la balise <router-outlet/>).

## PARTIES IMPORTANTES DU [TUTO OPEN CLASSROOM](https://openclassrooms.com/fr/courses/7471261-debutez-avec-angular)

- Bloc 2
- Bloc 3
- Bloc 5

## TODO

- Réussir à se connecter à la base de données : [ressource à approfondir](https://chatgpt.com/share/672c8b19-5464-8002-88bc-e9722b2398c9)
- Gérer la page de présentation d'un seul produit
- Avancer sur la fonctionnalité Panier
- Mettre en forme

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.dev/tools/cli) page.
