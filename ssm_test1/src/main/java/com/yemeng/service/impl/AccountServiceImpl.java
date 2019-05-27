package com.yemeng.service.impl;

import com.yemeng.dao.AccountMapper;
import com.yemeng.pojo.Account;
import com.yemeng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm_test1
 * @Package: com.yemeng.service.impl
 * @ClassName: AccountServiceImpl
 * @Author: Lenovo
 * @Description:
 * @Date: 2019/5/25 16:34
 * @Version: 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountDao;

    public List<Account> findAccount() {
        return accountDao.findAccount();
    }
}
