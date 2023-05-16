import { TestBed } from '@angular/core/testing';

import { AddclassesService } from './addclasses.service';

describe('AddclassesService', () => {
  let service: AddclassesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddclassesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
