package com.example.restoptionaldemo.domain;

import java.util.Optional;

import lombok.Value;

@Value
public class User {

    String name;
    String secondName;

    public Optional<String> getSecondName() {
        return Optional.ofNullable(secondName);
    }
}
