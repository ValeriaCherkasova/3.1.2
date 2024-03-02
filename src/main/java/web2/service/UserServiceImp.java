package web2.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web2.model.User;
import web2.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Transactional
    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User readUser(Long id) {
        return userRepository.readUser(id);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }
}
