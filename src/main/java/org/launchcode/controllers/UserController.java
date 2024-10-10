package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    //TODO: GET handler to display the add user form
    @GetMapping("")
    public String displayAddUserForm(){
        return "/user/add";
    }

    //TODO: POST handler to process the add user form
    //verify is linked to the verify password name. Not actually in the User Class
    @PostMapping("")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if (!user.getPassword().equals(verify)){
            return "/user/add";
        }
        return "/user/index";
    }


}



