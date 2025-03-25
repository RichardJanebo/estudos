package com.devdojo.user_service.mappers;


import com.devdojo.user_service.domain.User;
import com.devdojo.user_service.dto.users.UserGetResponse;
import com.devdojo.user_service.dto.users.UserPostRequest;
import com.devdojo.user_service.dto.users.UserPutRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userPostRequestToUser(UserPostRequest userPostRequest);

    User userPutRequestToUser(UserPutRequest userPutRequest);

    UserGetResponse userToUserGetResponse(User user);

    List<UserGetResponse> listUserToListUserGetResponse(List<User> users);
}
