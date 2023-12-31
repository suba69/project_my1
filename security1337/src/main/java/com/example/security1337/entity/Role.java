package com.example.security1337.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "roles")
public class Role extends BaseDomain {

       @Column(name = "name_role")
       private String name;

       @OneToMany
       private List<User> users;



}
