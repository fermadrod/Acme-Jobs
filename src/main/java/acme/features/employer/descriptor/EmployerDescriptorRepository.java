
package acme.features.employer.descriptor;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.descriptor.Descriptor;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface EmployerDescriptorRepository extends AbstractRepository {

	@Query("select r from Job r where r.id=?1")
	Descriptor findOneById(int id);
	@Query("select r from Job r where r.employer.id=?1")
	Collection<Descriptor> findManyByEmployerId(int id);

}
