package com.example.demo.Repo;

import com.example.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface UserRepo extends JpaRepository<User, Long> {
}
