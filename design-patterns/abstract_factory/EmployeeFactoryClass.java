package Week4.abstract_factory;

public class EmployeeFactoryClass {

    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory){
        return employeeAbstractFactory.createEmployee();
    }
}
