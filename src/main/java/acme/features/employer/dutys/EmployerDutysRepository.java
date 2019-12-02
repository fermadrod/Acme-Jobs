
package acme.features.employer.dutys;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.dutys.Dutys;
import acme.framework.repositories.AbstractRepository;

public interface EmployerDutysRepository extends AbstractRepository {

	@Query("select r from Job r where r.id = ?1")
	Dutys findOneById(int id);

	@Query("select r from Job r where r.employer.id = ?1")
	Collection<Dutys> findManyByEmployerId(int id);
}
