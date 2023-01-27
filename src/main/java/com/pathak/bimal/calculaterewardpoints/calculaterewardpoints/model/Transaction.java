package com.pathak.bimal.calculaterewardpoints.calculaterewardpoints.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private double amount;
    private int customerId;
}
