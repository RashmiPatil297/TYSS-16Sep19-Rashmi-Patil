import { Component, OnInit } from '@angular/core';
import { ProductsServiceService } from '../products-service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-searchbyname',
  templateUrl: './searchbyname.component.html',
  styleUrls: ['./searchbyname.component.css']
})
export class SearchbynameComponent implements OnInit {
error:string;
list;
  constructor(private res: ProductsServiceService, private router: Router) { }

  searchProductData(form: NgForm) {
    console.log(form.value);


    this.res.searchProduct(form.value).subscribe(data => {
      console.log('Response from searchProduct', data);
      if (data && data.message === 'success') {
        localStorage.setItem('searchDetails', JSON.stringify(data));
        this.router.navigateByUrl('/');
      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;

    });
  }
 

  ngOnInit() {
  }

}
