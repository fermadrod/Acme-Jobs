
package acme.features.auditor.auditRecord;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.auditRecord.AuditRecord;
import acme.entities.roles.Auditor;
import acme.framework.components.Model;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class AuditorAuditRecordListMineService implements AbstractListService<Auditor, AuditRecord> {

	//Internal State -----------------------------
	@Autowired
	AuditorAuditRecordRepository repository;


	@Override
	public boolean authorise(final acme.framework.components.Request<AuditRecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final acme.framework.components.Request<AuditRecord> request, final AuditRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "creationMoment", "body");

	}

	@Override
	public Collection<AuditRecord> findMany(final acme.framework.components.Request<AuditRecord> request) {
		assert request != null;

		Collection<AuditRecord> result;
		Principal principal;

		principal = request.getPrincipal();
		result = this.repository.findManyByJobId(principal.getActiveRoleId());
		return result;
	}

}
