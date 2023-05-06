package com.hms.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patients")
public class Patient {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;
private String dateOfBirth;
private String gender;
}
