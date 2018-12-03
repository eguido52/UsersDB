package edu.csumb.cst438.userdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.cst438.userdb.entities.Users;

@Component
public class UsersDbSeeder implements CommandLineRunner{

    @Autowired
    IUserRepository usersRepo;

    @Override
    public void run(String... args) throws Exception {

        Users usr1 = new Users("mun12",10.50);
        Users usr2 = new Users("osm45",20.00);
        Users usr3 = new Users("len56", 4.00);
        Users usr4 = new Users("john9", 15.25);
        Users usr5 = new Users("meg6", 5.75);

        usersRepo.deleteAll();
        List<Users> users = Arrays.asList(usr1,usr2,usr3,usr4,usr5);
        usersRepo.saveAll(users);
    }

}