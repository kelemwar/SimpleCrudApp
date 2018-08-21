package userCrud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import userCrud.service.UserService;

@Controller
public class RootController{

    @Autowired
    protected UserService service;

    @GetMapping("/")
    public String root() {
        return "users";
    }


}
