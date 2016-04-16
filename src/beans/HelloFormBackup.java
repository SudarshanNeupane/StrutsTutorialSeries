package beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class HelloFormBackup extends ActionForm {
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
		ActionErrors ac = new ActionErrors();
		if(name.equals(""))
			ac.add("name",new ActionMessage("msg"));
		return ac;
	}

}
