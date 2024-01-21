import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {CountryDTO} from "../dto/country-dto.model";
import {CountryStatDTO} from "../dto/country-stat-dto.model";
import {CountryDetails} from "../dto/country-details-dto.model";

@Injectable({
  providedIn: 'root'
})
export class DataService {
  private countriesAllApiUrl = 'http://localhost:8080/api/countries/all';
  private findLanguagesByCountryIdApiUrl = 'http://localhost:8080/api/countries/languages/';
  private findCountryStatsWithMaxGdpPerPopulationRatioApiUrl = 'http://localhost:8080/api/countries/country-stats';
  private retrieveCountryDetailsApiUrl = 'http://localhost:8080/api/countries/country-details';


  constructor(private http: HttpClient) { }

  getCountriesAll(): Observable<CountryDTO[]> {
    return this.http.get<CountryDTO[]>(this.countriesAllApiUrl);
  }

  findLanguagesByCountryId(countryId: number): Observable<any> {
    return this.http.get<any>(`${this.findLanguagesByCountryIdApiUrl}/${countryId}`);
  }

  findCountryStatsWithMaxGdpPerPopulationRatio(): Observable<CountryStatDTO[]> {
    return this.http.get<CountryStatDTO[]>(this.findCountryStatsWithMaxGdpPerPopulationRatioApiUrl);
  }

  retrieveCountryDetails(): Observable<CountryDetails[]> {
    return this.http.get<CountryDetails[]>(this.retrieveCountryDetailsApiUrl);
  }
}
