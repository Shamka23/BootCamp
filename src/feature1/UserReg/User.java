package feature1.UserReg;

import java.util.*;

public class User {
    private String name;
    private final int age;
    private String job;
    private String address;
    public static final Set<String> VALID_JOBS = Set.of("Google", "Uber", "Amazon");
    public static final Set<String> VALID_ADDRESSES = Set.of("London", "New York", "Amsterdam");

    public User(String name, int age, String job, String address) {
        if (name.isBlank()) {
            throw new NullPointerException("name must not be empty");
        }

        if (age < 18) {
            throw new IllegalArgumentException("Age must not be < 18");
        }

        if(!VALID_JOBS.contains(job)){
         throw new IllegalArgumentException("Invalid job " + job);
        }

        if(!VALID_ADDRESSES.contains(address)){
            throw new IllegalArgumentException("Invalid address " + address);
        }

        this.name = name;
        this.age = age;
        this.job = job;
        this.address = address;
    }
}
