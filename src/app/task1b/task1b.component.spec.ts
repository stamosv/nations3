import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Task1bComponent } from './task1b.component';

describe('Task1bComponent', () => {
  let component: Task1bComponent;
  let fixture: ComponentFixture<Task1bComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Task1bComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Task1bComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
