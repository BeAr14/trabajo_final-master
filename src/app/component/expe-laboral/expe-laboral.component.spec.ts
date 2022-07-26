import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExpeLaboralComponent } from './expe-laboral.component';

describe('ExpeLaboralComponent', () => {
  let component: ExpeLaboralComponent;
  let fixture: ComponentFixture<ExpeLaboralComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExpeLaboralComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExpeLaboralComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
