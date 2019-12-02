
package acme.entities.descriptor;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.dutys.Duty;
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
	@OneToMany(fetch = FetchType.LAZY)
	private Collection<Duty>	dutys;
}
