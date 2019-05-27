package com.yemeng.service;

import com.yemeng.pojo.Account;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm_test1
 * @Package: com.yemeng.service
 * @ClassName: AccountService
 * @Author: Lenovo
 * @Description:
 * @Date: 2019/5/25 16:33
 * @Version: 1.0
 */

public interface AccountService {
    public List<Account> findAccount();
}
