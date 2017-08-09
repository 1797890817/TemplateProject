package com.ddbin.eflow.center.repository;

import com.ddbin.eflow.center.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by deepin on 17-8-9.
 */
//@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstByUsername();

}
