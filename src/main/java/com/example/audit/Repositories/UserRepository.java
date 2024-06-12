package com.example.audit.Repositories;

import com.example.audit.models.Userr;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface UserRepository extends JpaRepository<Userr, Long> {
  Userr findByEmail(String email);
    }


