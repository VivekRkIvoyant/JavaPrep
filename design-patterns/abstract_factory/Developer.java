package Week4.abstract_factory;

public class Developer implements Employee{

    private static final String DEV_TEAM= "Developer's Team";

    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public void domain() {
        System.out.println(DEV_TEAM);
    }
}
