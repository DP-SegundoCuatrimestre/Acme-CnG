
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotBlank;

@Embeddable
@Access(AccessType.PROPERTY)
public class Place {

	// Constructors -------------------------------------------------------------
	public Place() {
		super();
	}


	// Attributes -------------------------------------------------------------
	private String	address;
	private Double	latitude;
	private Double	longitude;


	@NotBlank
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Double	getLatitude() {
		return latitude;
	}
	public void setLatitude(Double	latidude) {
		this.latitude = latidude;
	}

	public Double	getLongitude() {
		return longitude;
	}
	public void setLongitude(Double	longitude) {
		this.longitude = longitude;
	}
	// Relationships -------------------------------------------------------------

}
