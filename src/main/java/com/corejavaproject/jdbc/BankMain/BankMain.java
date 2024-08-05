package com.corejavaproject.jdbc.BankMain;

import com.corejavaproject.jdbc.BankDAO.BankDAO;
import com.corejavaproject.jdbc.BankModel.Bank;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BankMain {

    public static void main(String[] args) {
        /*try {
            Connection connection = DBConnection.getConnection();
            log.info(connection);
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
    }*/
        BankDAO bankDAO = new BankDAO();

        // for save the data

        /*Bank bank = new Bank();
        bank.setBankName("HDFC");
        bank.setBankAddress("Chennai");
        int response = bankDAO.save(bank);
        log.info("Response:{}", response);*/

        // for update the data

       /* Bank bank1 = new Bank();
        bank1.setBankCode(1);
        bank1.setBankAddress("Delhi");
        int response1 = bankDAO.update(bank1);
        log.info("Update response:{}", response1);*/

        // for delete the data

        Bank bank2 = new Bank();
        bank2.setBankCode(2);
        int response2 = bankDAO.delete(bank2);
        log.info("Delete Response is:{}", response2);

    }
}
