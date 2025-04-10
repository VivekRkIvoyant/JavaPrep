package Week4.abstract_factory;

public class DevOpsFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new DevOps();
    }
}
