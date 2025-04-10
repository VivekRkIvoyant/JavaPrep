package Week4.abstract_factory;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = EmployeeFactoryClass.getEmployee(new DeveloperFactory());
        if(emp1!=null){
            emp1.domain();
            int salary = emp1.salary();
            System.out.println(salary);
        }

        Employee emp2 = EmployeeFactoryClass.getEmployee(new DevOpsFactory());
        if(emp2!=null){
            emp2.domain();
            int salary = emp2.salary();
            System.out.println(salary);
        }

        Employee emp3 = EmployeeFactoryClass.getEmployee(new EmployeeAbstractFactory() {
            @Override
            public Employee createEmployee() {
                return new Developer();
            }
        });
        if(emp3!=null){
            emp3.domain();
            int salary = emp3.salary();
            System.out.println(salary);
        }

        Employee emp4 = EmployeeFactoryClass.getEmployee(new HumanResourceFactory());
        if(emp4!=null){
            emp4.domain();
            int salary = emp4.salary();
            System.out.println(salary);
        }
    }
}

