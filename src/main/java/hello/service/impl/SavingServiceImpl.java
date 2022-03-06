package hello.service.impl;

import hello.dao.SavingsDao;
import hello.service.SavingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class SavingServiceImpl implements SavingsService {


    @Value("${saving.account:a}")
    private String savingAccount;

    private SavingsDao savingsDao;

    public SavingServiceImpl(SavingsDao savingsDao) {
        this.savingsDao = savingsDao;
    }

    @Override
    public String hello() {
        log.info("hello world log {}", savingsDao.getAllSavings());
        return "hello woooooorld";
    }

    @Override
    public BigDecimal getAmount() {
        return savingsDao.getAmount(savingAccount);
    }

    @Override
    public BigDecimal updateAmount(BigDecimal amountDelta) {
        return savingsDao.updateAmount(amountDelta, savingAccount);
    }
}
