package com.sesni.user.vaccinecentresystem.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sesni.user.vaccinecentresystem.model.User;
//import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {
    //List<User> findByEmail(String email);
}
