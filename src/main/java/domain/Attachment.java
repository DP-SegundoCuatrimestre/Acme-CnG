
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Attachment extends DomainEntity {

	//Attributes
	private String	url;

	//Relationships
	private Message	message;


	//Constructor
	public Attachment() {
		super();
	}
	//Getters and setters
	@NotBlank
	@URL
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	//Relationships getters and setters
	@ManyToOne(optional = false)
	public Message getMessage() {
		return this.message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}

}
