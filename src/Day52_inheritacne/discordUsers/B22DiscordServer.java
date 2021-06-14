package Day52_inheritacne.discordUsers;

import Day12_conditional_statement.AmazonFreeShipping;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Suleyman");
        user1.setId(123);
        user1.setRole("Student");

        Admin admin1 = new Admin();
        admin1.setId(43123);
        admin1.setName("Klevis");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Aiden", 1234);
        System.out.println(admin2);


    }
}
