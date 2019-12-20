import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ModifyproductComponent } from './modifyproduct/modifyproduct.component';
import { SearchbynameComponent } from './searchbyname/searchbyname.component';


const routes: Routes = [
  { path:'add' ,component:AddproductComponent},
  { path:'update', component:ModifyproductComponent},
  { path:'search' ,component:SearchbynameComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
