import { Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { SingleProductPageComponent } from './single-product-page/single-product-page.component';
import { ContactsComponent } from './contacts/contacts.component';

export const routes: Routes = [
  { path: 'home', component: HomepageComponent },
  { path: 'productId/:id', component: SingleProductPageComponent },
  { path: 'contacts', component: ContactsComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' },
];
