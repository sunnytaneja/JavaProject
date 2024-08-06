package com.corejavaproject.jdbc.BankDAO;

import com.corejavaproject.jdbc.BankModel.Bank;
import com.corejavaproject.jdbc.CustomExceptionClass.BankDetailsNotFoundException;
import com.corejavaproject.jdbc.DBConnection.DBConnection;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        return response;
    }

    /**
     * Find all the bank details
     * @return
     * @throws BankDetailsNotFoundException
     */
    public List<Bank> findAll() throws BankDetailsNotFoundException {
        List<Bank> banks = null;

        try(Connection connection = DBConnection.getConnection()){
            String sql = "select * from t_bank";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (Objects.isNull(resultSet)) {
                log.error("Bank details not found");
                throw new BankDetailsNotFoundException("Bank details not found");
            }
            banks = new ArrayList<>();
            while (resultSet.next()){
                Bank bank = new Bank();
                bank.setBankCode(resultSet.getInt("BANK_CODE"));
                bank.setBankName(resultSet.getString("BANK_NAME"));
                bank.setBankAddress(resultSet.getString("BANK_ADDRESS"));
                banks.add(bank);
            }

        }catch (Exception ex){
            log.error("Exception while fetching the banks", ex);
        }

        log.info("End of BankDAO.findAll");
        return  banks;
    }

    /**
     * Find all the bank details
     * @return
     * @throws BankDetailsNotFoundException
     */
    public Bank getBankDetailsWithFindById(int bankCode) throws BankDetailsNotFoundException{
        log.info("BankCode is:{}", bankCode);
        Bank bank = null;

        try(Connection connection = DBConnection.getConnection()){
            String sql = "select * from t_bank where bank_code=?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, bankCode);
            ResultSet resultSet = statement.executeQuery();

            if (Objects.isNull(resultSet)) {
                throw new BankDetailsNotFoundException("Bank details not found");
            }
            while (resultSet.next()){
                bank = new Bank();
                bank.setBankCode(resultSet.getInt("BANK_CODE"));
                bank.setBankName(resultSet.getString("BANK_NAME"));
                bank.setBankAddress(resultSet.getString("BANK_ADDRESS"));
            }

        }catch (Exception ex){
            log.error("Exception while fetching the bank details with Id", ex);
        }

        return  bank;
    }
}
