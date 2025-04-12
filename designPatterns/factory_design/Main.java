package Week4.factory_design;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Tight Coupling approach
        Employee emp1 = new Developer();
        emp1.department();
        emp1.salary();

        Employee emp2 = new Testers();
        emp2.department();
        emp2.salary();
        System.out.println();

//        Factory Design Pattern
        System.out.println("Factory design");
        Employee emp3 = EmployeeFactory.getEmployee("Developer");
        if (emp3 != null) {
            emp3.department();
            int sal = emp3.salary();
            System.out.print(sal);
        }

        System.out.println();
        Employee emp4 = EmployeeFactory.getEmployee("testers");
        if(emp4!=null){
            emp4.department();
            int sal = emp4.salary();
            System.out.println(sal);
        }

        System.out.println();
        Employee emp5 = EmployeeFactory.getEmployee(sc.nextLine());
        if(emp5!=null){
            emp5.department();
            int sal = emp5.salary();
            System.out.println(sal);
        }
    }
}
