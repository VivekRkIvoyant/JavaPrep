package Week4.abstract_factory;

public class DeveloperFactory extends EmployeeAbstractFactory{


    @Override
    public Employee createEmployee() {
        return new Developer();
    }
}
