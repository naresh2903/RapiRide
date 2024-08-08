package com.narendra.pal.rapiride.dto;

import lombok.Data;

import java.util.List;

@Data
public class WalletDto {

    private Long id;

    private UserDto user;

    private Double balance;

    private List<WalletTransactionDto> transactions;

}
