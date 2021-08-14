package com.sesni.user.vaccinecentresystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sesni.user.vaccinecentresystem.Repository.UserRepository;
import com.sesni.user.vaccinecentresystem.model.User;


@EnableDiscoveryClient
@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
//@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class UserRegistrationApplication {

    @Autowired
    private UserRepository repository;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        repository.save(user);
        return "Hi " +  " your Registration process successfully completed";
    }
    
    @GetMapping("/getAllUsers")
    public List<User> findAllUsers() {
        return repository.findAll();
    }
    
//    @GetMapping(value = "/{id}")
//    public User getUserById(@PathVariable("id") ObjectId id) {
//        return userRepository.findBy_id(id);
//    }
//
//    @PutMapping(value = "/{id}")
//    public void modifyUserById(@PathVariable("id") ObjectId id, @Valid @RequestBody User user) {
//        user.set_id(id);
//        userRepository.save(user);
//    }

//    @GetMapping("/findUser/{email}")
//    public List<User> findUser(@PathVariable String email) {
//        return repository.findByEmail(email);
//    }

    @DeleteMapping("/cancel/{id}")
    public List<User> cancelRegistration(@PathVariable int id) {
        repository.deleteById(id);
        return repository.findAll();
    }


	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}

}
