package org.russow.controller;

import org.russow.model.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MyEntityController {

    @Autowired
    private MyEntity myEntity;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/myEntity", method = RequestMethod.GET)
    public String myEntity() {
        return "entity";
    }

    @RequestMapping(value = "/addMyEntity/{paramInURL}", method = RequestMethod.POST)
    public String addParam(@RequestParam("paramInBody") String paramInBody, @PathVariable("paramInURL") int paramInURL,
                           Model model) {
        model.addAttribute("paramInBody", paramInBody);
        model.addAttribute("paramInURL", paramInURL);

        return "result";
    }
}
