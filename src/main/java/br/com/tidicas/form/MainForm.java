package br.com.tidicas.form;

import org.apache.struts.action.ActionForm;

public class MainForm extends ActionForm{
	
	private static final long serialVersionUID = -5163467761240763467L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}