package com.example.department.entity

import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@ToString
class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long departmentId
    String departmentName
    String departmentAddress
    String departmentCode
}
