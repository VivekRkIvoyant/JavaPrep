package Week4.factory_design;

public class Testers implements Employee{

    @Override
    public int salary() {
        System.out.println("Tester's Salary");
        return 1000;
    }

    @Override
    public void department() {
        System.out.println("Testing Dept");
    }
}
