package domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import security.UserAccount;

public class Actor extends DomainEntity {
	
	// Constructors -----------------------------------------------------------

		public Actor() {
			super();
		}
		
	// Attributes -------------------------------------------------------------
		
		private String name;
		private String surname;
		private String email;
		private String phone;
		
		
		@NotBlank
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@NotBlank
		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		@Email
		@NotBlank
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@NotBlank
		@Pattern(regexp = "^\\+\\d{1,3}[ ]?\\d{6,14}$")
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		// Relationships ----------------------------------------------------------

		private UserAccount			userAccount;
		private Collection<Message>	sendMessages;
		private Collection<Message>	receivedMessages;


		@NotNull
		@Valid
		@OneToOne(cascade = CascadeType.ALL, optional = false)
		public UserAccount getUserAccount() {
			return userAccount;
		}

		public void setUserAccount(UserAccount userAccount) {
			this.userAccount = userAccount;
		}

		@NotNull
		@OneToMany(mappedBy = "actor")
		public Collection<Message> getSendMessages() {
			return sendMessages;
		}

		public void setSendMessages(Collection<Message> m) {
			this.sendMessages = m;
		}
		
		@NotNull
		@OneToMany(mappedBy = "actor")
		public Collection<Message> getReceivedMessages() {
			return receivedMessages;
		}

		public void setReceivedMessages(Collection<Message> m) {
			this.receivedMessages = m;
		}
		
		
		

}
