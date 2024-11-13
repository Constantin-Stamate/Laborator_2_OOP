package repository;

import entity.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {

    private Map<String, Account> store = new HashMap<String, Account>();

    public void createAccount(Account account) {
        this.store.put(account.getId(), account.clone());
    }

    public Account retrieveAccount(String id) {
        return this.store.get(id).clone();
    }

    public void updateAccount(Account account) {
        this.store.put(account.getId(), account.clone());
    }

    public void deleteAccount(String id) {
        this.store.remove(id);
    }
}