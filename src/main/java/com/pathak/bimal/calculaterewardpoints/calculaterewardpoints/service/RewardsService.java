package com.pathak.bimal.calculaterewardpoints.calculaterewardpoints.service;

import com.pathak.bimal.calculaterewardpoints.calculaterewardpoints.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardsService {

    public double calculatePoints(List<Transaction> transaction) {
        double rewardPoint = 0;

        for (Transaction transact : transaction) {

            if (transact.getAmount() > 100) {
                rewardPoint += 2 * (transact.getAmount() - 100);
            }
            if (transact.getAmount() > 50) {
                rewardPoint += 1 * Math.min(transact.getAmount() - 50, 50);
            }
        }
        return rewardPoint;
    }
}
