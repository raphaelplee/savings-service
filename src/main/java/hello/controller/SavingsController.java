package hello.controller;

import hello.controller.dto.SavingDto;
import hello.service.SavingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@Slf4j
public class SavingsController {

    private SavingsService savingsService;

    public SavingsController(SavingsService savingsService) {
        this.savingsService = savingsService;
    }

    @RequestMapping("/")
    public ResponseEntity<String> home() {
        log.info("this is home!");
        return ResponseEntity.ok().body(savingsService.hello());
    }

    @RequestMapping(value = "/balance", method = RequestMethod.GET)
    public ResponseEntity<BigDecimal> getBalance() {
        return ResponseEntity.ok().body(savingsService.getAmount());
    }

    @RequestMapping(value = "/balance", method = RequestMethod.PUT)
    public ResponseEntity<BigDecimal> putBalance(@RequestBody SavingDto savingDto) {
        return ResponseEntity.ok().body(savingsService.updateAmount(savingDto.getAmount()));
    }
}
