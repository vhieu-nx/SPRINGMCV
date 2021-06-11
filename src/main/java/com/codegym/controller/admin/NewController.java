package com.codegym.controller.admin;

import com.codegym.model.NewModel;
import com.codegym.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "newControllerOfAdmin")
public class NewController {

    @Autowired
    private INewService newService;

    @RequestMapping(value = "quan-tri/bai-viet/danh-sach",method = RequestMethod.GET)
    public ModelAndView showList(@ModelAttribute("model") NewModel model){
        ModelAndView modelAndView = new ModelAndView("admin/new/list");
        model.setListResult(newService.findAll());
        modelAndView.addObject("model",model);
        return modelAndView;
    }

    @RequestMapping(value = "quan-tri/bai-viet/chinh-sua",method = RequestMethod.GET)
    public ModelAndView editNew(){
        ModelAndView modelAndView = new ModelAndView("admin/new/edit");
        return modelAndView;
    }

}
