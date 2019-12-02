
package acme.entities.descriptor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.dutys.Dutys;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Descriptor extends DomainEntity {

	private static final long	serialVersionUID	= 1L;
	@NotBlank
	private String				description;

	//	//Relationships-----------------------------------
	@Valid
	@NotNull
	@ManyToOne(optional = false)
	private Dutys				dutys;
}
