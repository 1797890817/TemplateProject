package com.ddbin.eflow.center.repository;

import com.ddbin.eflow.center.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by deepin on 17-8-8.
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}
