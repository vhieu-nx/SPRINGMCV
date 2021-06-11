package com.codegym.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "newControllerOfAdmin")
public class NewController {
    @RequestMapping(value = "quan-tri/bai-viet/danh-sach",method = RequestMethod.GET)
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("admin/new/list");
        return modelAndView;
    }
    @RequestMapping(value = "quan-tri/bai-viet/chinh-sua",method = RequestMethod.GET)
    public ModelAndView editNew(){
        ModelAndView modelAndView = new ModelAndView("admin/new/edit");
        return modelAndView;
    }

}
