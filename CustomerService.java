package com.praveen.service;

import com.praveen.entity.Customer;
import com.praveen.model.CustomerModel;
import com.praveen.model.ProductModel;

import java.util.List;

public interface CustomerService {

    public String saveCustomer(CustomerModel customerModel);

    public List<CustomerModel> fetchAll();

    String saveProducts(ProductModel productModel, Long customerId);
}
