import {Component, OnInit} from '@angular/core';
import {DataService} from "../services/data.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-task1b',
  standalone: false,
  templateUrl: './task1b.component.html',
  styleUrl: './task1b.component.css'
})
export class Task1bComponent implements OnInit {
  countryId: number = 0;
  languages: string[] = [];

  constructor(
    private activatedRoute: ActivatedRoute,
    private yourDataService: DataService
  ) {}

  ngOnInit() {
    // Subscribe to route parameters to get the countryId
    this.activatedRoute.params.subscribe((params) => {
      this.countryId = +params['countryId'];
      // Fetch data based on the countryId
      this.yourDataService.findLanguagesByCountryId(this.countryId).subscribe((data) => {
        this.languages = data;
      });
    });
  }
}
