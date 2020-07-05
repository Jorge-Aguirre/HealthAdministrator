import { Component, Inject } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Hospital } from 'src/app/models/hospital';
import { HospitalService } from '../../services/hospital.service';

@Component({
  selector: 'app-add-hospital',
  templateUrl: './add-hospital.component.html',
  styleUrls: ['./add-hospital.component.scss']
})
export class AddHospitalComponent {

  hospital: Hospital;

  nameFormControl = new FormControl('', [
    Validators.required
  ]);

  constructor(
    private hospitalService: HospitalService,
    public dialogRef: MatDialogRef<AddHospitalComponent>,
    @Inject(MAT_DIALOG_DATA) public data: Hospital) {
      this.hospital = data;
  }

  saveHospital(): void {
    this.hospitalService.create(this.hospital)
      .subscribe(
        data => {
          this.dialogRef.close(true);
        },
        error => {
          console.error(error);
        }
      )
  }  

  cancelClick(): void {
    this.dialogRef.close();
  }

  getErrorMessage() {
    if (this.nameFormControl.hasError('required')) {
      return 'You  must enter a value';
    }
  }
}
