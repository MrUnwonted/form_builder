package com.camerinfolks.form.controller;

import com.camerinfolks.form.model.Form;
import com.camerinfolks.form.service.FormService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/form")
public class FormController {

    public FormService formService;

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @PostMapping( value = "/save")
    public String saveForm(@ModelAttribute("Form")Form form){
          formService.saveForm(form);
        return ("redirect:/index");
    }

}
