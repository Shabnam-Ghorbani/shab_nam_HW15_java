package ir.maktab.service;

import ir.maktab.model.BankAccount;
import ir.maktab.repository.BankAccountRepository;

import java.util.List;

public class BankAccountImpService implements BankAccountService {
    private static BankAccountRepository bankAccountRepository = new BankAccountRepository();

    @Override
    public void saveBankAccount(BankAccount bankAccount) {
        bankAccountRepository.save(bankAccount);
    }

    @Override
    public BankAccount showAccountFindByUserName(int id) {
        return bankAccountRepository.showAccountFindById(id);
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountRepository.findAll();
    }

    @Override
    public void updateBankAccount(BankAccount bankAccount) {
        bankAccountRepository.updateBankAccount(bankAccount);

    }

    @Override
    public void removeAccount(BankAccount bankAccount) {
        bankAccountRepository.removeAccount(bankAccount);
    }
}
