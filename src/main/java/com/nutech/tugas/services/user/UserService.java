package com.nutech.tugas.services.user;

import com.nutech.tugas.payloads.requests.UserRequest;
import com.nutech.tugas.payloads.responses.Response;

public interface UserService {

    Response addUser(UserRequest request);

    Response getUser();

    Response getUserById(String uuid);

    Response updateUserById(String uuid, UserRequest request);

    Response deleteUserById(String uuid);


}
