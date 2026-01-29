package JavaCoreSQL;

import java.util.*;

public class User {
    private String name;
    private int age;
    private String workplace;
    private String address;

    public User(String name, int age, String workplace, String address) {
        this.name = checkNotNull(name, "Нельзя ввести пустое имя");
        this.age = checkPositive(age, "Возраст не должен быть меньше нуля");
        this.workplace = checkNotNull(workplace, "Нельзя использовать пустое место работы");
        this.address = checkNotNull(address, "Нельзя использовать пустой адрес");
    }

    private String checkNotNull(String value, String message) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    private int checkPositive(int value, String message) {
        if (value <= 0) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static Map<Integer, List<User>> groupUsers(List<User> users) {
        Map<Integer, List<User>> result = new HashMap<>();

        for (User user : users) {
            int age = user.getAge();

            if (!result.containsKey(age)) {
                result.put(age, new ArrayList<>());
            }

            result.get(age).add(user);
        }
        return result;
    }
}

