import { Component, OnInit } from '@angular/core';
import { ProductsServiceService } from '../products-service.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  error: string;
  constructor(private res: ProductsServiceService, private router: Router) { }

  addProductData(forms: NgForm) {
    console.log(forms.value);



    this.res.addProduct(forms.value).subscribe(data => {
      console.log('Response from addProduct', data);
      if (data && data.message === 'success') {
        localStorage.setItem('addDetails', JSON.stringify(data));
        this.router.navigateByUrl('home');
      }
      forms.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;

    });
  }

  ngOnInit() {
  }

}
