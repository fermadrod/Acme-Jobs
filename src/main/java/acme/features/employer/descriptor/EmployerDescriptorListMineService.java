
package acme.features.employer.descriptor;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.descriptor.Descriptor;
import acme.entities.roles.Employer;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class EmployerDescriptorListMineService implements AbstractListService<Employer, Descriptor> {

	//Internal State -----------------------------
	@Autowired
	EmployerDescriptorRepository repository;


	@Override
	public boolean authorise(final acme.framework.components.Request<Descriptor> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Descriptor> request, final Descriptor entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "description");
	}

	@Override
	public Collection<Descriptor> findMany(final Request<Descriptor> request) {
		assert request != null;

		Collection<Descriptor> result;
		Principal principal;

		principal = request.getPrincipal();
		result = this.repository.findManyByEmployerId(principal.getActiveRoleId());
		return result;
	}

}
