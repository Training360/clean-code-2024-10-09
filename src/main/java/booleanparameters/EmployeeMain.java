package booleanparameters;

public class EmployeeMain {

    public static void main(String[] args) {
        new EmployeeFactory().create(EmployeeStatus.PASSIVE);
    }
}
