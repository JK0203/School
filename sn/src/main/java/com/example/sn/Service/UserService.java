package com.example.sn.Service;

import com.example.sn.Entity.User;
import com.example.sn.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
