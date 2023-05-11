package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("account/create")
    public void saveAccount () {
        createAccount();
    }
    @RequestMapping("account/get")
    public List<Account> getAccount () {
        return accountService.getAccount();
    }

    public void createAccount(){
        Account account = new Account();
        account.setAccountType("Saving");
        account.setAccountNumber("40202020220");
        //account.setId(9092L);
        account.setBankName("Muscat");
        account.setBankBranch("Seeb");
        account.setBranchCode(121);
        account.setCreatedDate(new Date());
        account.setIsActive(true);
        account.setSwiftCode("93939");
        account.setAccountHolderName("Mohammed");
        accountService.saveAccount(account);

}}
