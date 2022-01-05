package ac.upm.pharmacy.controller;

import ac.upm.pharmacy.model.UsersModel;
import ac.upm.pharmacy.service.impl.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {

@Autowired
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }
    @GetMapping("/login")
    public String getLoginPage(Model model ){
        model.addAttribute("loginRequest", new UsersModel());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel, Model model){

        System.out.println("login request: " + usersModel);
        UsersModel authenticated= usersService.authenticate(usersModel.getLogin(), usersModel.getPassword());
        if(authenticated != null){
            model.addAttribute("userLogin", authenticated.getLogin());
            return "redirect:/product/";

        }else{
            return "error";
        }
    }

//    @GetMapping("/register")
//     String getRegisterPage(Model model){
//        model.addAttribute("registerRequest", new UsersModel());
//        return "register";
//    }



//    @PostMapping("/register")
//    public String register(@ModelAttribute UsersModel usersModel){
//
//        System.out.println("register request: " + usersModel);
//        UsersModel registeredUser= usersService.registerUser(usersModel.getLogin(), usersModel.getPassword(), usersModel.getEmail());
//        return registeredUser == null ? "error" : "redirect:/login";
//    }


}