import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductsServiceService {

  constructor(private http: HttpClient) { }

  addProduct(addproduct): Observable<any> {
    return this.http.post('http://localhost:8080/stockmanagement/add' , addproduct);
  }

  modifyProduct(modifyproduct): Observable<any> {
    return this.http.put('http://localhost:8080/stockmanagement/modify' , modifyproduct);
  }

  searchProduct(searchproduct): Observable<any> {
    return this.http.get('http://localhost:8080/stockmanagement/search' , searchproduct);
  }

}
