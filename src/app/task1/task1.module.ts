import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Task1Component} from "./task1.component";
import {Task1bModule} from "../task1b/task1b.module";

@NgModule({
  declarations: [Task1Component],
  imports: [CommonModule, Task1bModule],
})
export class Task1Module {
}
