package com.tyss.stockmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.stockmanagement.dto.OrderInfo;
import com.tyss.stockmanagement.dto.ProductInfo;
import com.tyss.stockmanagement.dto.Response;
import com.tyss.stockmanagement.service.ProductService;

@RestController
@RequestMapping("/stockmanagement")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(path = "/add" ,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE )
	public Response addProduct(@RequestBody ProductInfo productInfo) {
		Response response = new Response();
		if(service.addProduct(productInfo)) {
			response.setStatus(201);
			response.setMessage("success");
			response.setDescription("Data added to the DB");
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");

			
		}
		return response;
	}
	
	@PutMapping(path = "/modify",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response  modifyProduct(@RequestBody ProductInfo productInfo) {
		Response response = new Response();
		if(service.modifyProduct(productInfo)) {
			response.setStatus(201);
			response.setMessage("updated");
			response.setDescription("Data modified");
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data failed to modify");
		}
		return response;
	}
	
	@GetMapping(path = "/search",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response  search(@RequestBody String name) {
		Response response = new Response();
		if(service.search(name)) {
			response.setStatus(201);
			response.setMessage("success");
			response.setDescription("Data found");
			response.getProduct();
			
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not found");
		}
		return response;
	}
	
	@PostMapping(path = "/bill",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response  generateBill(@RequestBody OrderInfo order) {
		Response response = new Response();
		if(service.addToCart()) {
			response.setStatus(201);
			response.setMessage("success");
			response.setDescription("Data added and bill is generated");
			response.getProduct();
			
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("bill is not generated");
		}
		return response;
	}
	
	
	
	
	


}
