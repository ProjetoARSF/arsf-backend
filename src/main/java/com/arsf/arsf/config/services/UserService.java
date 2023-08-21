package com.arsf.arsf.config.services;

import com.arsf.arsf.config.models.User;
import com.arsf.arsf.config.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String idUser) {
        return userRepository.findById(idUser);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String idUser) {
        userRepository.deleteById(idUser);
    }

    public Long countByUserIdAndPassword(String idUser, String userPassword) {
        return userRepository.countByUserIdAndPassword(idUser, userPassword);
    }
}
