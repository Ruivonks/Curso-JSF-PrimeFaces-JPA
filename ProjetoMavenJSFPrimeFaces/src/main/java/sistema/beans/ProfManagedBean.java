package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Prof;
import sistema.service.ProfService;

@ManagedBean
@SessionScoped
public class ProfManagedBean {
	
	private Prof prof = new Prof();
	private ProfService service = new ProfService();
	
	
	public void salvar()
	{
		service.salvar(prof);
		prof = new Prof();
		
	}

	public Prof getProf() {
		return prof;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}

	public List<Prof> getProfs() {
		return service.getProfs();
	}

	
	
	

}
