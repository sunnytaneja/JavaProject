package com.corejavaproject.jdbc.BankMain;

import com.corejavaproject.jdbc.BankDAO.BankDAO;
import com.corejavaproject.jdbc.BankModel.Bank;
import com.corejavaproject.jdbc.CustomExceptionClass.BankDetailsNotFoundException;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import java.util.List;

@Log4j2
public class BankMain {

    public static void main(String[] args) {
        BankDAO bankDAO = new BankDAO();
        /**
         * for save the data
         */
        /*Bank bank = new Bank();
        bank.setBankName("SBI");
        bank.setBankAddress("Chandigarh");
        int response = bankDAO.save(bank);
        log.info("Save Response is:{}", response);*/

        /**
         * for update the data
         */
//        Bank bank1 = new Bank();
//        bank1.setBankCode(1);
//        bank1.setBankAddress("Mumbai");
//        int response1 = bankDAO.update(bank1);
//        log.info("Update response is:{}", response1);

        /**
         * for delete the data
         */
//        Bank bank2 = new Bank();
//        bank2.setBankCode(1);
//        bank2.setBankAddress("Mumbai");
//        int response2 = bankDAO.update(bank2);
//        log.info("Delete response is:{}", response2);

        /**
         * for delete the data
         */
        try {
            List<Bank> bankList = bankDAO.findAll();
            bankList.forEach(log::info);
//            log.info("Find all Bank Details is:{}", bankList);
        } catch (BankDetailsNotFoundException bankDetailsNotFoundException) {
            bankDetailsNotFoundException.printStackTrace();
        }

        /**
         * getting bank details using id
         */
        try {
            Bank bank3 = bankDAO.getBankDetailsWithFindById(5);
            log.info("Find Bank Details Using Id response is:{}", bank3);
        } catch (BankDetailsNotFoundException bankDetailsNotFoundException) {
            bankDetailsNotFoundException.printStackTrace();
        }
    }
}