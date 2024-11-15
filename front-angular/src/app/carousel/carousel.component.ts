import { NgFor } from '@angular/common';
import { Component, Input, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import {
  CarouselComponent,
  CarouselControlComponent,
  CarouselInnerComponent,
  CarouselItemComponent,
  ThemeDirective,
} from '@coreui/angular';

@Component({
  selector: 'docs-carousel02',
  templateUrl: './carousel02.component.html',
  standalone: true,
  imports: [
    ThemeDirective,
    CarouselComponent,
    CarouselInnerComponent,
    NgFor,
    CarouselItemComponent,
    CarouselControlComponent,
    RouterLink,
  ],
})
export class Carousel02Component implements OnInit {
  @Input() slides: {
    id?: number;
    src: string;
    title?: string;
    subtitle?: string;
  }[] = [];

  ngOnInit(): void {
    // Suppression des slides statiques pour s'assurer que seules les images passées via @Input() sont utilisées.
  }
}
