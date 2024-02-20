package com.empbulletin.bootcampersbulletin.controller;

import com.empbulletin.bootcampersbulletin.model.Employee;
import com.empbulletin.bootcampersbulletin.model.LoginRequest;
import com.empbulletin.bootcampersbulletin.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        Long emp_id = loginRequest.getemp_id();
        String password = loginRequest.getPassword();

        Employee employee = employeeRepository.findByemp_idAndpassword(emp_id, password);
        if(employee != null) {
            return "Login Success";
        } else {
            return "Retry";
        }
    }
}
