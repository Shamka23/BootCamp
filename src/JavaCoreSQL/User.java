package JavaCoreSQL;

import java.util.*;

public class User {
    private String name;
    private int age;
    private String workplace;
    private String address;

    public User(String name, int age, String workplace, String address) {
        if (name == null) {
            throw new NullPointerException("Нельзя использовать пустое имя");
        } else {
            this.name = name;
        }

        if (age <= 0) {
            throw new IllegalArgumentException("Возраст должен быть больше 0");
        } else {
            this.age = age;
        }

        if (workplace == null) {
            throw new NullPointerException("Нельзя использовать пустое место работы");
        } else {
            this.workplace = workplace;
        }
        if (address == null) {
            throw new NullPointerException("Нельзя использовать пустой адрес");
        } else {
            this.address = address;
        }
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

