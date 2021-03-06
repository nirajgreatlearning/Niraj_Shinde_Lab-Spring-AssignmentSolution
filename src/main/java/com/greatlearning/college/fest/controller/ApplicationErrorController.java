package com.greatlearning.college.fest.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationErrorController implements ErrorController{
	@GetMapping("/error")
    public ModelAndView handleError(HttpServletRequest httpRequest) {
        
        ModelAndView errorPage = new ModelAndView("common/errorPage");
        String errorMsg = "";
        int httpErrorCode = getErrorCode(httpRequest);

        switch (httpErrorCode) {
            case 400: {
                errorMsg = "Http Error Code: 400. Bad Request";
                break;
            }
            case 401: {
                errorMsg = "Http Error Code: 401. Unauthorized";
                break;
            }
            case 404: {
                errorMsg = "Http Error Code: 404. Resource not found";
                break;
            }
            case 500: {
                errorMsg = "Http Error Code: 500. Internal Server Error";
                break;
            }
            default:{
            	errorMsg = "Un-Identified Error Occured!";
            }
        }
        errorPage.addObject("errorMsg", errorMsg);
        return errorPage;
    }
    
    private int getErrorCode(HttpServletRequest httpRequest) {
    	System.out.println(httpRequest);
        return (Integer) httpRequest
          .getAttribute("javax.servlet.error.status_code");
    }
    
}
