package com.mytech.shopmgmt.wrappers;

import java.util.Locale;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class AppResonseWrapper extends HttpServletResponseWrapper {

	public AppResonseWrapper(HttpServletResponse response) {
		super(response);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Locale getLocale() {
		System.out.println("Wrapper class called by Filter");

		Locale locale = super.getLocale();
		String country = locale.getCountry();
		String language = locale.getLanguage();

		if (!country.equals("US")) {
			locale = Locale.US;
		}

		System.out.println(country);
		System.out.println(language);

		return locale;
	}

}
