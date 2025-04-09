package com.mytech.shopmgmt.filters;

import java.io.IOException;

import com.mytech.shopmgmt.wrappers.AppRequestWrapper;
import com.mytech.shopmgmt.wrappers.AppResonseWrapper;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AppFilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = -3429969371468294952L;

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		AppRequestWrapper appRequestWrapper = new AppRequestWrapper(request);
		AppResonseWrapper appResonseWrapper = new AppResonseWrapper(response);
		
		chain.doFilter(appRequestWrapper, appResonseWrapper);	
	}
}
