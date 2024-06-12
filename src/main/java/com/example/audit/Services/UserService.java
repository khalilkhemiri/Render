package com.example.audit.Services;

import com.example.audit.Repositories.UserRepository;
import com.example.audit.models.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceImp {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Userr> getAllUsers() {

        return userRepository.findAll();
    }

   @Override
   public Userr getUserById(Long id) {
        Optional<Userr> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }

    @Override
    public Userr saveUser(Userr userr) {

        return userRepository.save(userr);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
