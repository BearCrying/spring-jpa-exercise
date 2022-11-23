package com.jpa.exercise.domain;

import javax.persistence.Id;

public class Publisher {
    @Id
    private Long id;
    public String name;
    public String address;
}
