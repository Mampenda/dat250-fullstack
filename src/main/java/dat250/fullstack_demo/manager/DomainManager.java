//package dat250.fullstack_demo.manager;
//
//import dat250.fullstack_demo.model.User;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Objects;
//
//@Component
//public class DomainManager {
//    private static final Logger logger = LoggerFactory.getLogger(DomainManager.class);
//    private HashMap<Integer, User> users = new HashMap<>();
//
//    public Collection<User> getUsers(){
//        if (users.isEmpty()) { throw new IllegalStateException("No users available."); }
//        return users.values();
//    }
//
//    public User getUser(Integer userId) throws IllegalArgumentException {
//        if (userId == null || userId <= 0) { throw new IllegalArgumentException("Invalid user ID"); }
//        return users.get(userId);
//    }
//
//    public void addUser(User user) throws IllegalArgumentException {
//        validateUserInput(user);
//
//        for (User existingUser : users.values()) {
//            if (existingUser.getEmail().equals(user.getEmail())) {
//                throw new IllegalArgumentException("Email already in use: " + user.getEmail());
//            }
//        }
//
//        users.put(user.getId(), user);
//        logger.info("User added: {}", user.getEmail());
//    }
//
//    private void validateUserInput(User user) {
//        if (user == null || user.getId() == null || user.getId() <= 0) {
//            throw new IllegalArgumentException("Invalid user object or ID");
//        }
//        if (user.getUsername() == null || user.getUsername().isEmpty()) {
//            throw new IllegalArgumentException("Username cannot be empty");
//        }
//        if (user.getEmail() == null || !user.getEmail().contains("@")) {
//            throw new IllegalArgumentException("Invalid email address");
//        }
//    }
//
//    public void deleteUser(Integer userId) throws IllegalArgumentException {
//        if (userId == null || userId <= 0) { throw new IllegalArgumentException("Invalid user ID"); }
//        users.remove(userId);
//        logger.info("Deleted user: {}", userId);
//    }
//
//    public void updateUser(Integer userId, User user) throws IllegalArgumentException {
//
//        User existingUser = users.get(userId);
//        if (existingUser == null) { throw new IllegalArgumentException("User not found: " + userId); }
//
//        if (userId == null || userId <= 0) { throw new IllegalArgumentException("Invalid user ID"); }
//        if (user == null || user.getId() == null || !Objects.equals(user.getId(), userId)) {
//            throw new IllegalArgumentException("Invalid user object or mismatched ID");
//        }
//
//        // Perform actual update logic here (just updating the username for demonstration)
//        existingUser.setUsername(user.getUsername());
//        logger.info("User updated: {}", userId);
//    }
//}
