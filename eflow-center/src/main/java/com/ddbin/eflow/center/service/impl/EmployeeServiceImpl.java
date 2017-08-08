package com.ddbin.eflow.center.service.impl;

import com.ddbin.eflow.center.repository.EmployeeRepository;
import com.ddbin.eflow.center.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by deepin on 17-8-8.
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

}
