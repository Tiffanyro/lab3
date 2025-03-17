package org.example;

// Main.java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // Add a new user
        User newUser = new User();
        newUser.setName("John Doe");
        newUser.setEmail("john@example.com");
        userRepository.addUser(newUser);

        // Modify an existing user
        User existingUser = new User();
        existingUser.setId(1); // Assuming the user with ID 1 exists
        existingUser.setName("Jane Doe");
        existingUser.setEmail("jane@example.com");
        userRepository.updateUser(existingUser);

        // Print all users that meet a criteria
        // Print all users that meet a criteria
        List<User> users = userRepository.getUsersByCriteria("Doe");
        for (User user : users) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail());
        }
    }
}
