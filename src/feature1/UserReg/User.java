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
        this.name = checkNotBlank(name, "name must be not empty");
        this.age = checkMajority(age, "age must not be < 18");
        this.job = checkValidOption(job, VALID_JOBS,"Invalid job");
        this.address = checkValidOption(address, VALID_ADDRESSES, "Invalid address");
    }

    private String checkNotBlank(String value, String message) {
        if (value == null || value.isBlank()) {
            throw new NullPointerException(message);
        }
        return value;
    }

    private int checkMajority(int value, String message) {
        if (value < 18) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    private String checkValidOption(String value, Set<String> validOptions, String message){
        if (value == null || !validOptions.contains(value)){
            throw new IllegalArgumentException(message + ": " + value);
        }
        return value;
    }
}
