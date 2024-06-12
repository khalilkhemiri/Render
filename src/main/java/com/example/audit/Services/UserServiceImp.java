package com.example.audit.Services;

import com.example.audit.models.Userr;

import java.util.List;

public interface UserServiceImp {

    List<Userr> getAllUsers();

    Userr getUserById(Long id);

    Userr saveUser(Userr userr);

    void deleteUser(Long id);
}
