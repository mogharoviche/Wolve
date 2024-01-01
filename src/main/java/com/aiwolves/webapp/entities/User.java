package com.aiwolves.webapp.entities;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "username", nullable = false, unique = true)
	 private String username;
	 
	 @Column(nullable = false ,unique = true)
	 private String password;
	 
	 @CreationTimestamp
	 @Column(updatable = false, name = "created_at")
	 private Date createdAt;

	 @UpdateTimestamp
	 @Column(name = "Last_updated")
	  private Date lastupdate;
	 //I d'ont cover role access control. so the list is empty *********************
	 @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        return List.of();
	    }

	    public String getPassword() {
	        return password;
	    }

	    @Override
	    public String getUsername() {
	        return username;
	    }

	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;
	    }

		public User setUsername(String username) {
			this.username = username;
			return this;
		}

		public User setPassword(String password) {
			this.password = password;
			return this;
		}


	}


