package com.praveen.model;



import com.praveen.entity.Product;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerModel {

    private Long customerId;
    private String customerName;
    private String email;
    private  Set<Product> products = new HashSet<>();

    @Override
    public String toString() {
        return "CustomerModel{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
