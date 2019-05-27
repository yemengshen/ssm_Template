package com.yemeng.pojo;

/**
 * @ProjectName: ssm_test1
 * @Package: com.yemeng.pojo
 * @ClassName: Account
 * @Author: Lenovo
 * @Description: 账单
 * @Date: 2019/5/25 16:24
 * @Version: 1.0
 */
public class Account {
    private int id;
    private String name;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
