import { Component, OnInit } from '@angular/core';
import { ProductsServiceService } from '../products-service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-modifyproduct',
  templateUrl: './modifyproduct.component.html',
  styleUrls: ['./modifyproduct.component.css']
})
export class ModifyproductComponent implements OnInit {
 error:string;
  constructor(private res: ProductsServiceService, private router: Router) { }

  updateProductData(form: NgForm) {
    console.log(form.value);


    this.res.modifyProduct(form.value).subscribe(data => {
      console.log('Response from modifyProduct', data);
      if (data && data.message === 'updated') {
        localStorage.setItem('modifyDetails', JSON.stringify(data));
        this.router.navigateByUrl('/home');
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
