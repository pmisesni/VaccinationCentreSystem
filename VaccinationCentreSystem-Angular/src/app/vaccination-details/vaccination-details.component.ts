import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'vaccine-vaccination-details',
  templateUrl: './vaccination-details.component.html',
  styleUrls: ['./vaccination-details.component.scss']
})
export class VaccinationDetailsComponent implements OnInit {

  VaccineDetailForm!:FormGroup;
 
  vaccines = [
    { id: 1, name: "Synopharm" },
    { id: 2, name: "Fizer" }
  ];
 
  constructor(private fb:FormBuilder, private router: Router) {
  }
 
  ngOnInit() {
 
    this.VaccineDetailForm = this.fb.group({
      vaccine: [null]
    });
  }
 
  submit() {
    console.log("Form Submitted");
    console.log(this.VaccineDetailForm.value);
    this.router.navigate(['/getAllUsers']);
  }

}
