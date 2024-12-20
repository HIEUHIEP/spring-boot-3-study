package com.hiepstudy.hello_spring_boot.repository;

import com.hiepstudy.hello_spring_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
