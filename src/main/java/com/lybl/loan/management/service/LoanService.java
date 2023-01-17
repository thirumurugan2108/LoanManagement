package com.lybl.loan.management.service;

import com.lybl.loan.management.dto.CreditCard;
import com.lybl.loan.management.dto.LoanRequest;
import com.lybl.loan.management.dto.LoanResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public ResponseEntity<LoanResponse> getEligibleAmount(LoanRequest loanRequest) {
        long eligibleAmount = loanRequest.getSalary();
        for(CreditCard card: loanRequest.getCreditCardList()) {
            eligibleAmount -= card.getPendingAmount();
        }

        if(eligibleAmount < 0) {
            eligibleAmount = 0;
        }

        LoanResponse loanResponse = new LoanResponse();
        loanResponse.setAmount(eligibleAmount);
        return ResponseEntity.ok(loanResponse);
    }
}
