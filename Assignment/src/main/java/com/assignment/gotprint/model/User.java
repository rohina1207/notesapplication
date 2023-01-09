package com.assignment.gotprint.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

@Entity
@Table(name="user")
public class User {
	
		@Id
		@NonNull
		@Column(unique=true)
		private String email;
		//@Size(min=8)
		private String password;
		@CreationTimestamp
		@Column(name="createTime", nullable = false, updatable = false)
		private Date createTime;
		@UpdateTimestamp
		@Column(name="lastUpdateTime")
		private Date lastUpdateTime;
		
		@OneToMany(mappedBy="user",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
		private List<Notes> notes = new ArrayList<Notes>();
		
		
		

		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Date getCreateTime() {
			return createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public Date getLastUpdateTime() {
			return lastUpdateTime;
		}
		public void setLastUpdateTime(Date lastUpdateTime) {
			this.lastUpdateTime = lastUpdateTime;
		}
}
