
package acme.features.worker.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.application.Application;
import acme.entities.roles.Worker;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.services.AbstractShowService;

@Service
public class WorkerApplicationShowService implements AbstractShowService<Worker, Application> {

	//Internal State -----------------------------
	@Autowired
	WorkerApplicationRepository repository;


	@Override
	public boolean authorise(final Request<Application> request) {
		assert request != null;

		//		boolean result;
		//		int applicationId;
		//		Application application;
		//		Worker worker;
		//		Principal principal;
		//
		//		applicationId = request.getModel().getInteger("id");
		//		application = this.repository.findOneById(applicationId);
		//		worker = application.getWorker();
		//		principal = request.getPrincipal();
		//		result = application.getStatus() || !application.getStatus() && worker.getUserAccount().getId() == principal.getActiveRoleId();
		//		return result;

		return true;
	}

	@Override
	public void unbind(final Request<Application> request, final Application entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "reference", "creationMoment", "status", "statement", "skills", "qualifications");

	}

	@Override
	public Application findOne(final Request<Application> request) {
		assert request != null;

		Application result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
