package com.yemeng.controller;

import com.yemeng.pojo.Account;
import com.yemeng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ProjectName: ssm_test1
 * @Package: com.yemeng.controller
 * @ClassName: AccountController
 * @Author: Lenovo
 * @Description:
 * @Date: 2019/5/25 16:49
 * @Version: 1.0
 */

@Controller
@RequestMapping("/account")
public class AccountController  {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/find")
    public String findAccount(){
        System.out.println("hello");
        List<Account> accounts = accountService.findAccount();
        for(Account account:accounts){
            System.out.println(account);
        }
        return "index";
    }
}
