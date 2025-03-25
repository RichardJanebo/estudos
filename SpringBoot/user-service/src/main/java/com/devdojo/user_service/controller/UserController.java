package com.devdojo.user_service.controller;

import com.devdojo.user_service.domain.User;
import com.devdojo.user_service.dto.users.UserGetResponse;
import com.devdojo.user_service.dto.users.UserPostRequest;
import com.devdojo.user_service.dto.users.UserPutRequest;
import com.devdojo.user_service.mappers.UserMapper;
import com.devdojo.user_service.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/users")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }


    @GetMapping
    public ResponseEntity<List<UserGetResponse>> findAll() {
        List<User> all = userService.findAll();

        List<UserGetResponse> userGetResponses = userMapper.listUserToListUserGetResponse(all);

        return ResponseEntity.ok(userGetResponses);
    }


    @GetMapping("{id}")
    public ResponseEntity<UserGetResponse> findById(@PathVariable Long id) {
        User byId = userService.findById(id);

        UserGetResponse userGetResponse = userMapper.userToUserGetResponse(byId);

        return ResponseEntity.ok(userGetResponse);
    }

    @GetMapping("firstName")
    public ResponseEntity<List<UserGetResponse>> findByFirstName(@RequestParam String name) {
        List<User> byFirstName = userService.findByFirstName(name);

        List<UserGetResponse> userGetResponses = userMapper.listUserToListUserGetResponse(byFirstName);

        return ResponseEntity.ok(userGetResponses);
    }


    @GetMapping("lastName")
    public ResponseEntity<List<UserGetResponse>> findByLastName(@RequestParam String lastName) {
        List<User> byLastName = userService.findByLastName(lastName);

        List<UserGetResponse> userGetResponses = userMapper.listUserToListUserGetResponse(byLastName);

        return ResponseEntity.ok(userGetResponses);
    }

    @GetMapping("email")
    public ResponseEntity<UserGetResponse> findByEmail(@RequestParam String email) {
        User byEmail = userService.findByEmail(email);

        UserGetResponse userGetResponse = userMapper.userToUserGetResponse(byEmail);

        return ResponseEntity.ok(userGetResponse);
    }

    @PostMapping
    public ResponseEntity<UserGetResponse> save(@RequestBody UserPostRequest userPostRequest) {
        User user = userMapper.userPostRequestToUser(userPostRequest);

        User save = userService.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(userMapper.userToUserGetResponse(save));
    }

    @PutMapping
    public ResponseEntity<Void> upadte(@RequestBody UserPutRequest userPutRequest) {
        User user = userMapper.userPutRequestToUser(userPutRequest);

        userService.update(user);

        return  ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        userService.delete(id);

        return  ResponseEntity.noContent().build();

    }


}
