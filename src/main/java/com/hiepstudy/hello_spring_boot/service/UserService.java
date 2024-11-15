package com.hiepstudy.hello_spring_boot.service;

import com.hiepstudy.hello_spring_boot.dto.request.UserCreationRequest;
import com.hiepstudy.hello_spring_boot.entity.User;
import com.hiepstudy.hello_spring_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createRequest (UserCreationRequest request){
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }
}
