import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowsubjectComponent } from './showsubject.component';

describe('ShowsubjectComponent', () => {
  let component: ShowsubjectComponent;
  let fixture: ComponentFixture<ShowsubjectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowsubjectComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowsubjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
