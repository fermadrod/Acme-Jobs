
package acme.features.auditor.auditRecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.components.CustomCommand;
import acme.entities.auditRecord.AuditRecord;
import acme.entities.roles.Auditor;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/auditor/auditRecord/")
public class AuditorAuditRecordController extends AbstractController<Auditor, AuditRecord> {

	//Internal State
	@Autowired
	AuditorAuditRecordListMineService	listMineService;
	@Autowired
	AuditorAuditRecordShowService		showService;


	//Constructors
	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.SHOW, this.showService);

		super.addCustomCommand(CustomCommand.LIST_MINE, BasicCommand.LIST, this.listMineService);
	}
}
