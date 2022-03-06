package hello.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public interface SavingsService {
    String hello();

    BigDecimal getAmount();

    BigDecimal updateAmount(BigDecimal amountDelta);
}
