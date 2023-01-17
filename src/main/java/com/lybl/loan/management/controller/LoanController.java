package com.lybl.loan.management.controller;

import com.lybl.loan.management.dto.LoanResponse;
import com.lybl.loan.management.dto.LoanRequest;
import com.lybl.loan.management.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created on Ağustos, 2020
 *
 * @author Thirumurugan
 */
@RestController
@Validated
public class LoanController {

	@Autowired
	LoanService loanService;

	@PostMapping("/getLoanAmount")
	public ResponseEntity<LoanResponse> getLoanAmount(@Valid @RequestBody LoanRequest loanRequest) {
		return loanService.getEligibleAmount(loanRequest);
	}
}
