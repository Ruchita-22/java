package com.ibm.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ExampleOnCustomTags extends TagSupport {

	String display;

	public void setDisplay(String display) {
		this.display = display;
	}
    
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		
		JspWriter out = pageContext.getOut();
		
		   try {
			
			   out.print(display);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}
	
	
	
	
	
}
