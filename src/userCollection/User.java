package userCollection;

import java.util.*;

public class User {
    private int id;
    private String name;
    private int age;
    private Set<String> activities;

    public User(int id, String name, int age, Set<String> activities) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.activities = new HashSet<>(activities);
    }

    public Set<String> getActivities() {
        return activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User user)) {
            return false;
        }
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static Map<User, String> findHobbyLovers(List<User> users, Set<String> targetActivities) {

        Map<User, String> result = new HashMap<>();

        for (User user : users) {
            for (String activity : user.activities) {
                if (targetActivities.contains(activity)) {
                    result.put(user, activity);
                    break;
                }
            }
        }
        return result;
    }
}
