
package acme.features.auditor.auditRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.auditRecord.AuditRecord;
import acme.entities.roles.Auditor;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractShowService;

@Service
public class AuditorAuditRecordShowService implements AbstractShowService<Auditor, AuditRecord> {

	//Internal State -----------------------------
	@Autowired
	AuditorAuditRecordRepository repository;


	@Override
	public boolean authorise(final Request<AuditRecord> request) {
		assert request != null;

		boolean result;
		int auditRecordId;
		AuditRecord auditRecord;
		Auditor auditor;
		Principal principal;

		auditRecordId = request.getModel().getInteger("id");
		auditRecord = this.repository.findOneById(auditRecordId);
		auditor = auditRecord.getAuditor();
		principal = request.getPrincipal();
		result = auditRecord.getStatus() || !auditRecord.getStatus() && auditor.getUserAccount().getId() == principal.getActiveRoleId();
		return result;
	}

	@Override
	public void unbind(final Request<AuditRecord> request, final AuditRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "creationMoment", "body");
		request.unbind(entity, model, "job", "auditor", "status");

	}

	@Override
	public AuditRecord findOne(final Request<AuditRecord> request) {
		assert request != null;

		AuditRecord result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}