package com.lybl.loan.management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {
    String name;
    @NotNull(message = "pendingAmount in creditCard is required")
    long pendingAmount;
}
