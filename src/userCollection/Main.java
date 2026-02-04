package userCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Shamil", 23 , Set.of("Chess", "Programming", "Box"));
        User user2 = new User(2, "Rupert", 20 , Set.of("Walk", "Programming", "Sleep"));
        User user3 = new User(3, "Azamat", 23 , Set.of("Anime", "TV", "Box"));

        List<User> users = List.of(user1, user2, user3);

        Set<String> hobbies = Set.of("Programming", "Box");

        Map<User, String> result = User.findHobbyLovers(users, hobbies);

        System.out.println(result);
    }
}
