
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Message extends DomainEntity {

	//Attributes!!
	private Date		date;
	private String		title;
	private String		text;

	//Relationships
	private Actor		sender;
	private Actor		recipient;
	private Attachment	attachment;


	//Constructor
	public Message() {
		super();
	}
	//Getters and setters

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@NotBlank
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	//RELATIONSHIPS GETTERS AND SETTERS
	@ManyToOne(optional = false)
	@Valid
	public Actor getSender() {
		return this.sender;
	}

	public void setSender(Actor sender) {
		this.sender = sender;
	}
	@Valid
	@ManyToOne(optional = false)
	public Actor getRecipient() {
		return this.recipient;
	}

	public void setRecipient(Actor recipient) {
		this.recipient = recipient;
	}
	@OneToMany
	public Attachment getAttachment() {
		return this.attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

}
