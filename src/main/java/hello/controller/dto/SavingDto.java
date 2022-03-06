package hello.controller.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SavingDto {
    String account;
    BigDecimal amount;
}
