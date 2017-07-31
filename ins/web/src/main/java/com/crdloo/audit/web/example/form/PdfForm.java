package com.crdloo.audit.web.example.form;

import java.io.Serializable;

public class PdfForm implements Serializable {

	private String nametd;
	private String date;
	
	public PdfForm(){
		
	}
	
	public PdfForm(String nametd, String date){
		this.nametd = nametd;
		this.date = date;
	}

	public String getNametd() {
		return nametd;
	}

	public void setNametd(String nametd) {
		this.nametd = nametd;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
