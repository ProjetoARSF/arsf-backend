package com.arsf.arsf.config.repositories;

import com.arsf.arsf.config.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String> {
    // You can add custom query methods here if needed

    @Query("SELECT COUNT(u) FROM User u WHERE u.idUser = :idUser AND u.userPassword = :userPassword and u.userPassword is not null")
    Long countByUserIdAndPassword(@Param("idUser") String idUser, @Param("userPassword") String userPassword);

}

