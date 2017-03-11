/*
 *
 * Copyright (C) FAC
 * 
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 * 
 */

package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)

public class Request extends Demand {

	// Constructors -----------------------------------------------------------

	public Request() {
		super();
	}

	// Attributes -------------------------------------------------------------


	// Relationships ----------------------------------------------------------
	private Customer customer;


	@NotNull
	@Valid
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
