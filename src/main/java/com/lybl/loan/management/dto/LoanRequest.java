package com.lybl.loan.management.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class LoanRequest {
    @NotNull(message = "salary is required.")
    Long salary;
    @Valid
    List<@Valid CreditCard> creditCardList;
}
