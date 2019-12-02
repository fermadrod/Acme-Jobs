
package acme.features.employer.dutys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.dutys.Dutys;
import acme.entities.roles.Employer;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.services.AbstractShowService;

@Service
public class EmployerDutysShowService implements AbstractShowService<Employer, Dutys> {

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
	public Dutys findOne(final Request<Dutys> request) {
		assert request != null;

		Dutys result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;

	}
}
