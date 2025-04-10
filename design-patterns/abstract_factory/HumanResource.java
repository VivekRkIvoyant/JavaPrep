package Week4.abstract_factory;

public class HumanResource implements Employee{

    private static final String HUMAN_RESOURCE = "Human Resource";

    @Override
    public int salary() {
        return 10000;
    }

    @Override
    public void domain() {
        System.out.println(HUMAN_RESOURCE);
    }
}
