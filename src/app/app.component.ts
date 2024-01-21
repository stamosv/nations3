import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Router } from '@angular/router';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'my-app';
  constructor(private router: Router) {}
  ngOnInit() {}
  navigateToTask1() {
    this.router.navigate(['/task1'], { replaceUrl: true });
  }
  navigateToTask2() {
    this.router.navigate(['/task2'], { replaceUrl: true });
  }
  navigateToTask3() {
    this.router.navigate(['/task3'], { replaceUrl: true });
  }
}
