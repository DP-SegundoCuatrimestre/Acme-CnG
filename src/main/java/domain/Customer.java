package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Customer extends Actor{
	
	// Constructors -----------------------------------------------------------

		public Customer() {
			super();
		}

	// Relationships ----------------------------------------------------------
		
		private Collection<Request> requests;
		private Collection<Offer> offers;
		
		
		@NotNull
		@OneToMany(mappedBy = "customer")
		public Collection<Request> getRequests() {
			return requests;
		}

		public void setRequests(Collection<Request> r) {
			this.requests = r;
		}
		
		@NotNull
		@OneToMany(mappedBy = "customer")
		public Collection<Offer> getOffers() {
			return offers;
		}

		public void setOffers(Collection<Offer> o) {
			this.offers = o;
		}

}
