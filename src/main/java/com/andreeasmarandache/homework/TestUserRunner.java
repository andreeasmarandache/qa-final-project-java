package com.andreeasmarandache.homework;


public class TestUserRunner {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        try {
            userRepository.addUser(new User("testuser", 25));
        } catch (InvalidUserDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            userRepository.addUser(new AdminUser("admin", 30, "full_access"));
        } catch (InvalidUserDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            userRepository.addUser(new User("ab", 22));
        } catch (InvalidUserDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            userRepository.addUser(new User("baduser", -5));
        } catch (InvalidUserDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Validated users added:");
        for (User user : userRepository.getUsers()) {
            System.out.println(user);
        }
    }
}
