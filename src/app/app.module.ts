// Import your components
import {NgModule} from "@angular/core";
import {HttpClientModule} from '@angular/common/http';
import {BrowserModule} from "@angular/platform-browser";
import {CommonModule} from "@angular/common";
import {AppComponent} from "./app.component";
import {Task1Module} from "./task1/task1.module";
import {Task2Module} from "./task2/task2.module";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Task3Module} from "./task3/task3.module";


@NgModule({
  declarations: [AppComponent],
  imports: [HttpClientModule, BrowserModule, FormsModule, ReactiveFormsModule, Task1Module, Task2Module, Task3Module, CommonModule],
  bootstrap: [AppComponent],
  exports: [FormsModule, ReactiveFormsModule]
})
