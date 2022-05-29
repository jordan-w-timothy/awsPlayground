import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ErsLandingPageComponent } from './ers-landing-page.component';

describe('ErsLandingPageComponent', () => {
  let component: ErsLandingPageComponent;
  let fixture: ComponentFixture<ErsLandingPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ErsLandingPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ErsLandingPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
