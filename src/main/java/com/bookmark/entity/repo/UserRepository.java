package com.bookmark.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmark.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
