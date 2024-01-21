import {Component, OnInit} from '@angular/core';
import {DataService} from "../services/data.service";
import {CountryStatDTO} from "../dto/country-stat-dto.model";

@Component({
  selector: 'app-task2.component',
  standalone: false,
  // imports: [],
  templateUrl: './task2.component.html',
  styleUrl: './task2.component.css'
})
export class Task2Component implements OnInit {
  countryStatDtoList: CountryStatDTO[] = [];

  constructor(private yourDataService: DataService) { }

  ngOnInit() {
    this.yourDataService.findCountryStatsWithMaxGdpPerPopulationRatio().subscribe(data => {
      this.countryStatDtoList = data;
    });
  }
}
