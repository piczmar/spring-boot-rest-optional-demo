package com.example.restoptionaldemo.domain;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private Queue<User> users = new ConcurrentLinkedQueue<>();

    public void add(User user) {
        users.add(user);
    }

    public List<User> findAll() {
        return users.stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        User user = new User("Jack", "Adam");
        String userName = user.getName();
        String displayedName = user.getSecondName()
            .map(s-> userName + ", " + s)
            .orElse(userName);
        System.out.println(displayedName);
    }
}
