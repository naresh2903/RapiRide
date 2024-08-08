package com.narendra.pal.rapiride.services;

import com.narendra.pal.rapiride.entities.Ride;
import com.narendra.pal.rapiride.entities.User;
import com.narendra.pal.rapiride.entities.Wallet;
import com.narendra.pal.rapiride.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount,
                            String transactionId, Ride ride,
                            TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount,
                                 String transactionId, Ride ride,
                                 TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);

}
