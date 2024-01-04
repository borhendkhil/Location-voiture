package com.example.locationvoiture.service;

import com.example.locationvoiture.entity.User;
import com.example.locationvoiture.repository.UserRepository;
import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getAllUser() {
        return userRepository.findAll().get(0);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }


}
