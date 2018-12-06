package edu.csumb.cst438.userdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.cst438.userdb.entities.Users;

@CrossOrigin(origins = "*")
@RestController
public class UsersController {
    @Autowired
    IUserRepository usersRepo;

    @GetMapping("/users")
    public List<Users> getAll(){
        List<Users> result = usersRepo.findAll();
        return result;
    }

    @GetMapping("/user/{id}")
    public Users getUserById(@PathVariable String id)
    {
        Users result = usersRepo.findByRepoId(id);
        return result;
    }

    @GetMapping("/users/{name}")
    public List<Users> getUserByName(@PathVariable String name)
    {
        List<Users> result = usersRepo.findByUserName(name);
        return result;
    }
}