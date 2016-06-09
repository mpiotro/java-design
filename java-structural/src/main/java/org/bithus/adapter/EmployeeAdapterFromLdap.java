package org.bithus.adapter;

/**
 * Created by michal on 09.06.16.
 */
public class EmployeeAdapterFromLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterFromLdap(EmployeeLdap employeeFromLdap) {
        this.instance = employeeFromLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
