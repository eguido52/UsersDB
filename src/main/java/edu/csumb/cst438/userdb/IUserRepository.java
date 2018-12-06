package edu.csumb.cst438.userdb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.userdb.entities.Users;

@Repository
public interface IUserRepository extends MongoRepository<Users, String>{

    @Query(value = "{'id':?0}")
    Users findByRepoId(String id);
    
    @Query(value = "{'userName':?0}")
    List<Users> findByUserName(String userName);
}

