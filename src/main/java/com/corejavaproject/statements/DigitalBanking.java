package com.corejavaproject.statements;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DigitalBanking {

    public String transferMoney(int balance, int amount){
        if( balance >= amount){
            return "Money has been transferred";
        } else{
            return "Payment failed";
        }
    }

    public String getLoan(String loanType){
        if("Home Loan".equals(loanType)){
            return "Process Home Loan";
        } else if("Personal Loan".equals(loanType)){
            return  "Process personal Loan";
        } else {
            return "Not eligible for loan";
        }
    }

    public String getLoanWithSwitchCase(String loanType){
        String response;

        switch (loanType){
            case "Home Loan":
                response = "Eligible for Home Loan";
                break;
            case "Personal Loan":
            case "Education Loan":
                response = "Eligible for Personal/Education";
                break;
            default:
                response = "Not Eligible for any Loan";
        }

        return response;
    }

    public String getLoanWithSwitchCase1(String loanType){


        String response=  switch (loanType){  // java 12
            case "Home Loan" ->
                    "Eligible for Home Loan";
            case "Personal Loan"->
                    "Eligible for Personal Loan";
            case "Education Loan"->
                    "Eligible for Education";
            default->
                    "Not Eligible for any Loan";
        };

        return response;
    }

    public String getLoanWithSwitchCase2(String loanType){
        String response = switch (loanType){ // java 13
            case "Home Loan":
                yield "Eligible for Home Loan";
            case "Personal Loan":
            case "Education Loan":
                yield "Eligible for Personal/Education";
            default:
                yield "Not Eligible for any Loan";
        };

        return response;
    }
}

