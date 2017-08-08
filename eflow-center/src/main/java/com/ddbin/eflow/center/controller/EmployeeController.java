package com.ddbin.eflow.center.controller;

import com.ddbin.eflow.center.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by deepin on 17-8-8.
 */
@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;


}
