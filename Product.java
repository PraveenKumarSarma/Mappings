package com.praveen.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="PRODUCT_TABLE")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String productName;
    private String dept;
    private double price;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "products")
    @JoinTable(name="CUSTOMER_PRODUCT_TABLE",joinColumns = {
            @JoinColumn(name="customer_id",referencedColumnName = "productId")
    },
            inverseJoinColumns = {
                    @JoinColumn(name="product_id",referencedColumnName = "customerId")
            })

    private Set<Customer> customer=new HashSet<>();


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
