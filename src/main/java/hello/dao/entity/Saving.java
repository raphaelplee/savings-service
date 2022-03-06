package hello.dao.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Saving {
    String account;
    BigDecimal amount;
}
