import { Component } from '@angular/core';
import { UserService } from './services/user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pro';

  constructor(private user:UserService)
  {
    user.getCountries().subscribe(res=>console.log(res))
  }
}
