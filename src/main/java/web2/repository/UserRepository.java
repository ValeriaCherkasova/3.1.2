package web2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web2.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User readUser(Long id);

    void deleteUser(Long id);
}
