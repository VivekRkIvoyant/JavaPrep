package Week4.factory_design;

public class EmployeeFactory {

    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("developer")){
            return new Developer();
        } else if (empType.trim().equalsIgnoreCase("testers")) {
            return new Testers();
        }
        else {
            return null;
        }
    }
}
