import { Component, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Hospital } from 'src/app/models/hospital';

@Component({
  selector: 'app-add-hospital',
  templateUrl: './add-hospital.component.html',
  styleUrls: ['./add-hospital.component.scss']
})
export class AddHospitalComponent {

  hospital: Hospital;

  constructor(
    public dialogRef: MatDialogRef<AddHospitalComponent>,
    @Inject(MAT_DIALOG_DATA) public data: Hospital) {

      this.hospital = data;
  }

  saveHospital(): void {
    console.log('save logic!');
  }  

  cancelClick(): void {
    this.dialogRef.close();
  }
}
