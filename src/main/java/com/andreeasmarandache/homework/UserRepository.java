package com.andreeasmarandache.homework;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) throws InvalidUserDataException {
        if (user == null) {
            throw new InvalidUserDataException("User is null.");
        }
        if (user.getUsername() == null || user.getUsername().length() < 3) {
            throw new InvalidUserDataException("Invalid username.");
        }
        if (user.getAge() < 0) {
            throw new InvalidUserDataException("Age can not be negative.");
        }
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

}
