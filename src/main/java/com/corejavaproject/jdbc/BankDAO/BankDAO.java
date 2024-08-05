package com.corejavaproject.jdbc.BankDAO;

import com.corejavaproject.jdbc.BankModel.Bank;
import com.corejavaproject.jdbc.DBConnection.DBConnection;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Log4j2
public class BankDAO {
    public int save(Bank bank) {
        log.info("Inside the BankDAO.save, bank:{}", bank);
        int response = 0;
        try (Connection connection = DBConnection.getConnection()) {
            String sql = "insert into t_bank(BANK_CODE, BANK_NAME,BANK_ADDRESS) values(BANK_CODE_SEQUENCE.nextval,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, bank.getBankName());
            statement.setString(2, bank.getBankAddress());

            response = statement.executeUpdate();
            log.info("Save Response:{}", response);
        } catch (Exception ex) {
            log.error("Exception while saving bank details");
        }
        log.info("End of BankDAO.save");
        return response;
    }

    /**
     * Update Query
     *
     * @param bank
     * @return
     */
    public int update(Bank bank) {
        log.info("Inside the BankDAO.update, bank:{}", bank);
        int response = 0;
        try (Connection connection = DBConnection.getConnection()) {
            String sql = "update t_Bank set BANK_ADDRESS=? where BANK_CODE=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, bank.getBankAddress());
            statement.setInt(2, bank.getBankCode());

            response = statement.executeUpdate();
            log.info("Update Response:{}", response);
        } catch (Exception ex) {
            log.error("Exception while updating bank details");
        }
        log.info("End of BankDAO.update");
        return response;
    }

    /**
     * Delete Query
     *
     * @param bank
     * @return
     */
    public int delete(Bank bank) {
        log.info("Inside the BankDAO.delete, bank:{}", bank);
        int response = 0;
        try (Connection connection = DBConnection.getConnection()) {
            String sql = "delete from t_Bank where BANK_CODE=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, bank.getBankCode());
            response = statement.executeUpdate();
            log.info("Delete Response:{}", response);
        } catch (Exception ex) {
            log.error("Exception while Delete bank details");
        }
        log.info("End of BankDAO.delete");
        return response;
    }


}

    /**
     * Delete Query
     *
     * @param bank
     * @return
     */
    public int delete(Bank bank) {
        log.info("Inside the BankDAO.delete, bank:{}", bank);
        int response = 0;
        try (Connection connection = DBConnection.getConnection()) {
            String sql = "delete from t_Bank where BANK_CODE=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, bank.getBankCode());
            response = statement.executeUpdate();
            log.info("Delete Response:{}", response);
        } catch (Exception ex) {
            log.error("Exception while Delete bank details");
        }
        log.info("End of BankDAO.delete");
        return response;
    }

}