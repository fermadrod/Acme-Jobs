
package acme.features.employer.application;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.application.Application;
import acme.entities.roles.Employer;
import acme.framework.components.Model;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class EmployerApplicationListMineService implements AbstractListService<Employer, Application> {

	//Internal State -----------------------------
	@Autowired
	EmployerApplicationRepository repository;


	@Override
	public boolean authorise(final acme.framework.components.Request<Application> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final acme.framework.components.Request<Application> request, final Application entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "reference", "creationMoment", "status", "statement");

	}

	@Override
	public Collection<Application> findMany(final acme.framework.components.Request<Application> request) {
		assert request != null;

		Collection<Application> result;
		Principal principal;

		principal = request.getPrincipal();
		result = this.repository.findManyByEmployerId(principal.getActiveRoleId());
		return result;
	}

}
