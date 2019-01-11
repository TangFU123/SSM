package com.t2.bean;

import java.util.Date;

public class Customer {
    @Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + ", rid="
				+ rid + ", interdate=" + interdate + ", number=" + number + "]";
	}

	private Integer id;

    private String name;

    private String account;

    private String password;

	private String rid;

    private String interdate;

    private String number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getinterdate() {
        return interdate;
    }

    public void setinterdate(String interdate) {
        this.interdate = interdate == null ? null : interdate.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }
}