package com.yemeng.dao;

import com.yemeng.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: ssm_test1
 * @Package: com.yemeng.dao
 * @ClassName: AccountMapper
 * @Author: Lenovo
 * @Description: dao层
 * @Date: 2019/5/25 16:26
 * @Version: 1.0
 */
@Repository("accountDao")
public interface AccountMapper {
    public List<Account> findAccount();
}
