package com.example.user.entity

import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@ToString
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long userId;
    String firstName;
    String lastName;
    String email;
    Long departmentId;
}
