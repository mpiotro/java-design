package org.bithus.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 09.06.16.
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "Michal", "Piotrowski", "mpiotrow@gmail.com");

        employees.add(employeeFromDB);

        // Employee employeeFromLdap = new EmployeeLdap("chewie", "solo", "han", "han@solo.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "solo", "han", "han@solo.com");

        employees.add(new EmployeeAdapterFromLdap(employeeFromLdap));

        return employees;
    }
}
