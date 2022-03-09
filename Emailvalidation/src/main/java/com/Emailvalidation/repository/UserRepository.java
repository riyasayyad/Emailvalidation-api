package com.Emailvalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Emailvalidation.model.User;


public interface UserRepository extends JpaRepository<User, Long> {


}
