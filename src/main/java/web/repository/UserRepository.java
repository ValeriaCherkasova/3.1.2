package web.repository;

import web.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User readUser(Long id);

    void deleteUser(Long id);
}
