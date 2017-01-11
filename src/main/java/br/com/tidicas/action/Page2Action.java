package br.com.tidicas.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.tidicas.form.Page2Form;

public class Page2Action extends Action{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		Page2Form page2Form = (Page2Form) form;
		page2Form.setMessage("Página 2");
		
		return mapping.findForward("success");
	}
	
}