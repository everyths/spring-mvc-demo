//package org.jason.util;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//@Component
//public class ExceptionHander implements HandlerExceptionResolver {
//
//    @Override
//    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
//                                         Object o, Exception e) {
//        ModelAndView view = new ModelAndView();
//        view.setViewName("exception");
//        return view;
//    }
//}