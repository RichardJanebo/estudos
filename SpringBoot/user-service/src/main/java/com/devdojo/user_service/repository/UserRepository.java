package com.devdojo.user_service.repository;

import com.devdojo.user_service.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private UserData userData;

    public UserRepository(UserData userData) {
        this.userData = userData;
    }

    public User save(User user) {
        userData.getUsers().add(user);
       return user;
    }

    public List<User> findAll(){
        return userData.getUsers();
    }

    public Optional<User> findById(Long id){
        return userData.getUsers().stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public List<User> findByFirstName(String firstName){
        return userData.getUsers().stream().filter(user -> user.getFirstName().equals(firstName)).toList();
    }

    public List<User> findByLastName(String lastName){
        return userData.getUsers().stream().filter(user -> user.getLastName().equals(lastName)).toList();
    }

    public Optional<User> findByEmail(String email){
        return userData.getUsers().stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    public void delete(User user){
        userData.getUsers().remove(user);
    }

    public void update(User user){
        userData.getUsers().add(user);
    }
}
