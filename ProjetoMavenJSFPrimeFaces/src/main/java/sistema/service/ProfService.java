package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Prof;

public class ProfService {

	private ArrayList <Prof> profs = new ArrayList<Prof>();
	
	public ProfService()
	{

	}
	
	public void salvar(Prof prof)
	{
	    profs.add(prof);
	}
	

	public List <Prof> getProfs()
	{
		
		return profs;
		
	}
	
	
}
