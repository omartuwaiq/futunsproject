package com.example.Recruiting_Office.model.Repository;

import com.example.Recruiting_Office.model.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository  extends JpaRepository<User,Integer> {
    @Query("SELECT password FROM User WHERE name = :name" )
    String findPasswordByname(@Param("name") String name);

    @Query("select case when count(name) > 0 then true else false end from User where name = :name")
    Boolean existsByname(@Param("name") String name);

}
