package demeter;

public class EmployeeService {

    public void addAddress(Employee employee, Address address) {
//        employee.getAddresses().add(address);
        employee.addAddress(address);
    }
}
