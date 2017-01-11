package br.com.tidicas.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.tidicas.form.Page1Form;

public class Page1Action extends Action{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		Page1Form page1Form = (Page1Form) form;
		page1Form.setMessage("Página 1");
		
		return mapping.findForward("success");
	}
	
}