package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "inbox")
public class Inbox {

	@Id
	@Column(name = "inbox_id")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"		
	)   
	private String id;

    @Column(name = "last_message")
    private String lastMessage;

    @Column(name = "last_sent_by_sender")
    private Timestamp lastSentBySender;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")    
    private Timestamp updatedAt;

}
