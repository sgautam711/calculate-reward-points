package com.pathak.bimal.calculaterewardpoints.calculaterewardpoints.controller;

import com.pathak.bimal.calculaterewardpoints.calculaterewardpoints.model.RewardPoint;
import com.pathak.bimal.calculaterewardpoints.calculaterewardpoints.model.Transaction;
import com.pathak.bimal.calculaterewardpoints.calculaterewardpoints.service.RewardsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/rewards")
public class RewardPointsController {

    private final RewardsService rewardsService;

    public RewardPointsController(RewardsService rewardsService) {
        this.rewardsService = rewardsService;
    }

    @PostMapping("/points")
    public ResponseEntity<RewardPoint> getRewardPoints(@RequestBody List<Transaction> transactions) {
        double result = rewardsService.calculatePoints(transactions);
        return new ResponseEntity<>(new RewardPoint(result), HttpStatus.OK);
    }
}
