package com.n26.statistics.repository;

import com.n26.statistics.model.Transaction;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * @author FortunatusE
 * @date 12/7/2018
 */
public interface TransactionRepository {

    void save(Transaction transaction);

    List<Transaction> getTransactions();

    AtomicReferenceArray<Transaction> getTransactionStore();

    void deleteAllTransactions();
}