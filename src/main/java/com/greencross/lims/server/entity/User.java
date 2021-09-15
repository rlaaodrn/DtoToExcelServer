package com.greencross.lims.server.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(schema="public", name = "users")
@Data
@Accessors(fluent = true)
public class User implements Serializable {
	@Id
	@Column(name="id")
	private String id;
	@Column
	private String email;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String institution;
	@Column
	private String authority;
	@Column
	private String department;
	@Column
	private Boolean state;
	@Column(name="create_at")
	private LocalDateTime createAt;
	@Column(name="last_login_at")
	private LocalDateTime lastLoginAt;
	@Column
	private String ip;
}
