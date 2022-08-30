package com.formateur.exemple;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AfficheHeure extends SimpleTagSupport{
	String format;

	public void setFormat(String format) {
		this.format = format;
	}

	public void doTag() throws JspException, IOException{
		getJspBody().invoke(null);
		getJspContext().getOut().write(new SimpleDateFormat(format).format(new Date()));
		JspWriter out = getJspContext().getOut();
		out.println("C'est bon !");
	}
}
