package com.microUsersApp.microUsers.user.infrastructure;

import com.microUsersApp.microUsers.user.domain.api.IUserServicePort;
import com.microUsersApp.microUsers.user.domain.model.Role;
import com.microUsersApp.microUsers.user.domain.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class UserRestController {

    @Autowired
    private final IUserServicePort clientRepository;

    @GetMapping("/user/{id}")
    public Optional<User> getClientById(@PathVariable(name="id") long id){
        return clientRepository.findById(id);
    }
    @PostMapping("/user")
    public User postClient(@RequestBody User user){
        Role role = new Role();
        role.setId(4L);
        role.setRole("client");
        user.setStatus(true);
        return clientRepository.save(user);
    }
    @GetMapping("/users")
    public List<User> getAllClients (){
        return clientRepository.findAll();
    }

    @PatchMapping("/user/{id}")
    public Boolean disableUser(@PathVariable(name = "id") Long id) {
        Optional<User> optUser;
        optUser = clientRepository.findById(id);
        optUser.ifPresent(user -> user.setStatus(false));
        optUser.ifPresent(user->clientRepository.save(user));
        return true;
    }






}
