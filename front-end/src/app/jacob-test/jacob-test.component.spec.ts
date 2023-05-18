import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JacobTestComponent } from './jacob-test.component';

describe('JacobTestComponent', () => {
  let component: JacobTestComponent;
  let fixture: ComponentFixture<JacobTestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [JacobTestComponent]
    });
    fixture = TestBed.createComponent(JacobTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
