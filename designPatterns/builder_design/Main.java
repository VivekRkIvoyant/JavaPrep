package Week4.builder_design;

public class Main {

    public static void main(String[] args) {


        User user = new User.UserBuilder()
                .setId("1")
                .setName("vivek")
                .setEmail("vivek@gmail.com")
                .build();

        System.out.println(user.getId()+" "+user.getName()+" "+user.getEmail());

        User user2 = new User.UserBuilder()
                .setId("2")
                .setName("virat")
                .setEmail("virat@gmail.com")
                .build();

        System.out.println(user2.getId()+" "+user2.getName()+" "+user2.getEmail());

        User user3 = new User.UserBuilder()
                .setId("3")
                .setName("dev")
                .setEmail("dev@gmail.com")
                .build();

        System.out.println(user3.getId()+" "+user3.getName()+" "+user3.getEmail());

    }
}
