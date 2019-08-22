package com.kuliza.task.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.kuliza.task.model.User;
import com.kuliza.task.repository.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public List<User> getUser() {
        return (List<User>) userRepository.findAll();
    }

    public User findById(String id) {
        return userRepository.findOne(id);
    }

    public User update(User user, String l) {
        return userRepository.save(user);
    }

    public void deleteUserById(String id) {
        userRepository.delete(id);
    }

    public User updatePartially(User user, String id) {
        User usr = findById(id);
        usr.setCountry(user.getCountry());
        return userRepository.save(usr);
    }
}

