package service;

import java.math.BigDecimal;

public interface AccountService {
    void deposit(String id, BigDecimal amount);
    void withdraw(String id, BigDecimal amount);
}
