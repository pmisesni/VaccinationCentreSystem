import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../Model/User';
import { UserRegistrationService } from '../Service/user-registration.service';

@Component({
  selector: 'vaccine-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.scss']
})
export class UserRegistrationComponent implements OnInit {

    id!: number;
    fName!: string;
    lName!: string;
    address!: string;
    district!: string
    mobile!: number;
    submitted: boolean = false;

  constructor(private userService: UserRegistrationService, private router: Router) { }

  ngOnInit(): void {
  }

  submit(): void{
    const user: User = {
      id: this.id,
      fName: this.fName,
      lName: this.lName,
      address: this.address,
      district: this.district,
      mobile: this.mobile
    }

    this.userService.registerUser(user).subscribe(
      response=>{
      console.log(response);
      this.submitted = true;
      this.router.navigate(['/vaccineDetails']);
    },
    error=>{
      console.log(console.error());
    }
    )
  };

  cancel(): void {
    this.submitted = false;
    this.id=0,
    this.fName = "",
    this.lName = "",
    this.address = "",
    this.district = "",
    this.mobile = 0;
    };

}
