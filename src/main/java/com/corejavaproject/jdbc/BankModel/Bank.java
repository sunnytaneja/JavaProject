package com.corejavaproject.jdbc.BankModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bank {
    private int bankCode;
    private String bankName;
    private String bankAddress;
}
