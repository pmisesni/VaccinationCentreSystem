import { Component, OnDestroy, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { User } from '../Model/User';
import { UserRegistrationService } from '../Service/user-registration.service';

@Component({
  selector: 'vaccine-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.scss']
})
export class UserListComponent implements OnInit, OnDestroy {
  title: string = "list of Pet owners";
  subcription!: Subscription;
  usersList!: User[];

  constructor(
    private userService: UserRegistrationService,
    private router: Router) { }

  ngOnInit(): void {
    this.subcription = this.userService.getAllUsers().subscribe({
      next: data => {
        this.usersList = data;
      }
    });
  }

  ngOnDestroy(){
    this.subcription.unsubscribe();
  }

  goBack(){
    this.router.navigate(['/']);
  }

}
