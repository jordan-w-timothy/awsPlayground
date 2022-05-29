import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ErsLoginPageComponent } from './ers-login-page.component';

describe('ErsLoginPageComponent', () => {
  let component: ErsLoginPageComponent;
  let fixture: ComponentFixture<ErsLoginPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ErsLoginPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ErsLoginPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
