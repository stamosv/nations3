import { Routes } from '@angular/router';
import { Task1Component } from './task1/task1.component';
import { Task2Component } from './task2/task2.component';
import { Task3Component } from './task3/task3.component';
import {AppComponent} from "./app.component";
import {Task1bComponent} from "./task1b/task1b.component";

export const routes: Routes = [
  { path: 'home', component: AppComponent },
  { path: 'task1', component: Task1Component, loadChildren: () => import("./task1/task1.module").then(m => m.Task1Module)},
  { path: 'task2', component: Task2Component, loadChildren: () => import("./task2/task2.module").then(m => m.Task2Module)},
  { path: 'task3', component: Task3Component, loadChildren: () => import("./task3/task3.module").then(m => m.Task3Module)},
  { path: 'task1b/:countryId', component: Task1bComponent, loadChildren: () => import("./task1b/task1b.module").then(m => m.Task1bModule)},


];
