package Week4.abstract_factory;

public class DevOps implements Employee{

    private static final String DEVOPS = "DevOps Team";

    @Override
    public int salary() {
        return 20000;
    }

    @Override
    public void domain() {
        System.out.println(DEVOPS);
    }
}
