
package acme.features.auditor.auditorRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.auditorRecord.AuditorRecord;
import acme.entities.roles.Auditor;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.services.AbstractShowService;

@Service
public class AuditorAuditorRecordShowService implements AbstractShowService<Auditor, AuditorRecord> {

	//Internal State -----------------------------
	@Autowired
	AuditorAuditorRecordRepository repository;


	@Override
	public boolean authorise(final Request<AuditorRecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<AuditorRecord> request, final AuditorRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "moment", "title", "auditor", "job", "status", "body");

	}

	@Override
	public AuditorRecord findOne(final Request<AuditorRecord> request) {
		assert request != null;

		AuditorRecord result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
