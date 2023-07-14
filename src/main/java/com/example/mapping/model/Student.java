package com.example.mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private String studentId;
   private String name;
   private String age;
   private String phoneNumber;
   private String branch;
   private String department;

   @OneToOne
    private Address address;
}
