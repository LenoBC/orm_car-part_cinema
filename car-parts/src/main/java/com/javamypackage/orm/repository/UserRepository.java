package com.javamypackage.orm.repository;

import com.javamypackage.orm.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmailEquals(String email);
}
