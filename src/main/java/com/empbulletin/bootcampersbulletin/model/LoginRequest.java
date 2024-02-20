package com.empbulletin.bootcampersbulletin.model;

import jakarta.persistence.Id;

public class LoginRequest {

    @Id
    private Long emp_id;
    private String password;

    public Long getemp_id() {
        return emp_id;
    }

    public void setemp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
