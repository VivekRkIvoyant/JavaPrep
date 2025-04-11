package Week4.factory_design;

public class Developer implements Employee{


    @Override
    public int salary() {
        System.out.println("Salary of dev's");
        return 50000;
    }

    @Override
    public void department() {
        System.out.println("Dev Department");
    }
}
