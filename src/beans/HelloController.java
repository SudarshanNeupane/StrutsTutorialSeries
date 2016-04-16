package beans;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloController extends Action {
 @Override
 public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res)
//public ActionForward execute(ActionMapping mapping, ActionForm action, ServletRequest request, ServletResponse response)
		throws Exception {
	 String name = req.getParameter("name");
	 System.out.println(name);
	 req.setAttribute("result", "Hello ....."+name);
	 return mapping.findForward("success");
}
}
