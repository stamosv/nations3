import { Component, OnInit } from '@angular/core';
import {CountryDTO} from "../dto/country-dto.model";
import {DataService} from "../services/data.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-task1.component',
  standalone: false,
  templateUrl: './task1.component.html',
  styleUrls: ['./task1.component.css']
})
export class Task1Component  implements OnInit {
  countryDtoList: CountryDTO[] = [];

  constructor(private yourDataService: DataService, private router: Router) { }

  ngOnInit() {
    this.yourDataService.getCountriesAll().subscribe(data => {
      this.countryDtoList = data;
    });
  }

  redirectToCountryDetails(countryId: number): void {
    this.router.navigate(['/task1b', countryId], { replaceUrl: true });
  }
}
