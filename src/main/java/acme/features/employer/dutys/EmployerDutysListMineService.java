
package acme.features.employer.dutys;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.dutys.Dutys;
import acme.entities.roles.Employer;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class EmployerDutysListMineService implements AbstractListService<Employer, Dutys> {

	//Internal State -----------------------------
	@Autowired
	EmployerDutysRepository repository;


	@Override
	public boolean authorise(final Request<Dutys> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Dutys> request, final Dutys entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "title", "description", "precentaje");
	}

	@Override
	public Collection<Dutys> findMany(final Request<Dutys> request) {
		assert request != null;

		Collection<Dutys> result;
		Principal principal;

		principal = request.getPrincipal();
		result = this.repository.findManyByEmployerId(principal.getActiveRoleId());
		return result;
	}

}
