package com.hdd.dao;

import com.hdd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 格调 on 2019/6/12.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String userName);
}