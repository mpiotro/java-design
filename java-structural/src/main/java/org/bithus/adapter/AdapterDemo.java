package org.bithus.adapter;

import java.util.List;

/**
 * Created by michal on 09.06.16.
 */
public class AdapterDemo {

    public static void main(String[] args) {

        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);

    }

}
