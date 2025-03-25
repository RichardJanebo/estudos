package com.devdojo.user_service.dto.users;

public record UserPutRequest(Long id,String firstName, String lastName, String email) { }
