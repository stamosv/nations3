import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Task3Component} from "./task3.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [Task3Component],
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
})
export class Task3Module {
}
