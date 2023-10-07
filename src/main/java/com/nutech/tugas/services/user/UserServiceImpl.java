package com.nutech.tugas.services.user;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.nutech.tugas.models.User;
import com.nutech.tugas.payloads.requests.UserRequest;
import com.nutech.tugas.payloads.responses.Response;
import com.nutech.tugas.repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Response addUser(UserRequest request) {

        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());

        user = userRepository.save(user);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("User created successfully!");
        response.setData(user);

        return response;
    }

    @Override
    public Response getUser() {

        List<User> user = userRepository.findAll();

        Response response = new Response(HttpStatus.OK.value(), "success", user);
        return response;
    }

    @Override
    public Response getUserById(String uuid) {

        User user = userRepository.findById(uuid).orElseThrow(() -> {
            throw new NoSuchElementException("User is not found!");
        });

        return new Response(HttpStatus.OK.value(), "success", user);
    }

    @Override
    public Response updateUserById(String uuid, UserRequest request) {
        User user = userRepository.findById(uuid).orElseThrow(() -> {
            throw new NoSuchElementException("User is not found!");
        });

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());

        user = userRepository.save(user);

        return new Response(HttpStatus.OK.value(), "success updated", user);
    }

    @Override
    public Response deleteUserById(String uuid) {
        User user = userRepository.findById(uuid).orElseThrow(() -> {
            throw new NoSuchElementException("User is not found!");
        });

        user.setIsDeleted(true);

        user = userRepository.save(user);

        return new Response(HttpStatus.OK.value(), "success deleted", null);
    }

}
