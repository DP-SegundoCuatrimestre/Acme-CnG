
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Banner extends DomainEntity {

	// Constructors -----------------------------------------------------------

	public Banner() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private String	image;


	@NotBlank
	@URL
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
