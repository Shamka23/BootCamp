package JavaCoreSQL;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Shamil", 23, "Java Development", "Cherkessk"));
        users.add(new User("Rupert", 23, "Car Development", "Krasnodar"));
        users.add(new User("Arslan", 12, "Football Player", "Moscow"));
        users.add(new User("Azamat", 12, "Football Player", "Moscow"));

        Map<Integer, List<User>> grouped = User.groupUsers(users);

        for (Map.Entry<Integer, List<User>> entry : grouped.entrySet()) {
            System.out.println("Age: " + entry.getKey());
            for(User user: entry.getValue()){
                System.out.println(" " + user.getName());
            }
        }
    }
}
