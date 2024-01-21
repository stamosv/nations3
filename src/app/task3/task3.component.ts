import { Component, OnInit } from '@angular/core';
import { DataService } from '../services/data.service';
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-task3.component',
  standalone: false,
  templateUrl: './task3.component.html',
  styleUrl: './task3.component.css'
})
export class Task3Component implements OnInit {
  originalData: any[] = [];
  countryDetailsData: any[] = [];
  filteredData: any[] = [];
  regions: string[] = [];
  filterForm!: FormGroup;

  constructor(private yourDataService: DataService, private fb: FormBuilder) { }

  ngOnInit() {
    console.log('task3-1');

    this.filterForm = <FormGroup>this.fb.group({
      region: [''],
      fromYear: [''],
      toYear: [''],
    });

    this.yourDataService.retrieveCountryDetails().subscribe(data => {
      this.originalData = data;
      this.countryDetailsData = data;
      this.filteredData = [...this.countryDetailsData];
    });

    this.regions = this.getUniqueRegions(this.countryDetailsData);

  }

  public applyFilters() {
    const regionFilter: string = this.filterForm.get('region')!.value;
    const fromYearFilter = this.filterForm.get('fromYear')!.value;
    const toYearFilter = this.filterForm.get('toYear')!.value;

    // Apply filters based on user input
    this.filteredData = this.countryDetailsData.filter((data) => {
      return (
        (!regionFilter || data.regionName === regionFilter) &&
        (!fromYearFilter || data.year >= fromYearFilter) &&
        (!toYearFilter || data.year <= toYearFilter)
      );
    });
    this.countryDetailsData= this.filteredData;
  }

  public cancel() {
    this.countryDetailsData= this.originalData;
  }

  private getUniqueRegions(data: any[]): string[] {
    const uniqueRegions = [...new Set(data.map((item) => item.regionName))];
    return uniqueRegions;
  }
}
