package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_profile")
public class UserProfile {

	@Id
	@Column(name = "user_profile_id")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"		
	)   
	private String id;

    // foreign key
    private String accountId;

    private String username;

    private String firstname;    

    private String lastname;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "status")
    private UserStatus status;

    @Column(name = "created_at")    
    private Timestamp createdAt;

    @Column(name = "updated_at")    
    private Timestamp updatedAt;

}
