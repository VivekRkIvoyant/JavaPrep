package Week4.abstract_factory;

public class HumanResourceFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new HumanResource();
    }
}
