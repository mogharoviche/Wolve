package com.aiwolves.webapp.dtos;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	    private String username;
	    private Date lastupdate;
	    private Date createdAt;
		private Collection<? extends GrantedAuthority> Authorities;
		private boolean AccountNonExpired;
		private boolean AccountNonLocke;
		private boolean CredentialsNonExpired;
		private boolean Enabled;
		
		
		public boolean isAccountNonExpired() {
			return AccountNonExpired;
		}
		public void setAccountNonExpired(boolean accountNonExpired) {
			AccountNonExpired = accountNonExpired;
		}
		public boolean isAccountNonLocke() {
			return AccountNonLocke;
		}
		public void setAccountNonLocke(boolean accountNonLocke) {
			AccountNonLocke = accountNonLocke;
		}
		public boolean isCredentialsNonExpired() {
			return CredentialsNonExpired;
		}
		public void setCredentialsNonExpired(boolean credentialsNonExpired) {
			CredentialsNonExpired = credentialsNonExpired;
		}
		public boolean isEnabled() {
			return Enabled;
		}
		public void setEnabled(boolean enabled) {
			Enabled = enabled;
		}
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return Authorities;
		}
		public void setAuthorities(Collection<? extends GrantedAuthority> collection) {
			Authorities = collection;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public Date getLastupdate() {
			return lastupdate;
		}
		public void setLastupdate(Date lastupdate) {
			this.lastupdate = lastupdate;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		
}
