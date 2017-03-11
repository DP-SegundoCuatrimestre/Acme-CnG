
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Application extends DomainEntity {

	//Constructor
	public Attachment() {
		super();
	}

	//Attributes
	private String	state
	
	//Getters and setters
	@NotBlank
	@URL
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	//Relationships
	private Message	message;


	//Relationships getters and setters
	@ManyToOne(optional = false)
	public Message getMessage() {
		return this.message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}

}
