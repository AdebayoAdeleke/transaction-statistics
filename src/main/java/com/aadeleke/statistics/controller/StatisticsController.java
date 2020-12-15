package com.aadeleke.statistics.controller;

import com.aadeleke.statistics.dto.Response;
import com.aadeleke.statistics.service.StatisticsService;
import com.aadeleke.statistics.dto.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class StatisticsController {


    private final StatisticsService statisticsService;

    @Autowired
    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @PostMapping("/transactions")
    public ResponseEntity addTransaction(@RequestBody TransactionDTO transaction){

        Response response = statisticsService.addTransaction(transaction);
        System.out.println("Response: "+response);
        return ResponseEntity.status(response.getStatus()).build();
    }


    @GetMapping("/statistics")
    public ResponseEntity getTransactionStatistics(){

        Response response = statisticsService.getStatistics();
        return ResponseEntity.status(response.getStatus()).body(response.getBody());
    }

    @DeleteMapping("/transactions")
    public ResponseEntity deleteTransactions(){

        Response response = statisticsService.deleteTransactions();
        return ResponseEntity.status(response.getStatus()).build();
    }
}
