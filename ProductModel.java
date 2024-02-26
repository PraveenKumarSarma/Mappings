package com.praveen.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.praveen.entity.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ProductModel {


    private Long productId;
    private String productName;
    private String dept;
    private double price;
    private Set<Customer> customer = new HashSet<>();


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", dept='" + dept + '\'' +
                ", price=" + price +
                '}';
    }

}
