package com.narendra.pal.rapiride.services.impl;

import com.narendra.pal.rapiride.entities.WalletTransaction;
import com.narendra.pal.rapiride.repositories.WalletTransactionRepository;
import com.narendra.pal.rapiride.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }

}
