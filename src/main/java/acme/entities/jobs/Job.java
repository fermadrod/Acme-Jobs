
package acme.entities.jobs;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.descriptor.Descriptor;
import acme.entities.roles.Employer;
import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Job extends DomainEntity {

	/**
	 *
	 */
	private static final long	serialVersionUID	= 1L;

	@Column(unique = true)
	@NotBlank
	@Length(min = 5, max = 10)
	@Pattern(regexp = "^\\D{4}-\\D{4}$")
	//@Pattern(regexp = "^\\D{3}\\d{1}-\\D{3}\\d{1}$")
	private String				reference;

	@NotBlank
	private String				title;

	@NotNull
	private Boolean				status;

	@URL
	private String				moreInfo;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadline;

	@NotNull
	private Money				salary;

	//Relationships-----------------------------------
	@Valid
	@NotNull
	@ManyToOne(optional = false)
	private Employer			employer;
	@Valid
	@NotNull
	@ManyToOne(optional = false)
	private Descriptor			descriptor;
}
