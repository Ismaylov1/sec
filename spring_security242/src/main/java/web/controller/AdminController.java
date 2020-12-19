package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import java.util.List;

@RequestMapping(value = "/")
@Controller
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/admin")
    public String allUsers(Model model) {
        model.addAttribute("allUsers", userService.listUsers());
        List<User> users = userService.listUsers();
        for (User user : users
        ) {
            System.out.println(user);
        }
        return "admin";
    }

    @GetMapping("/add")
    public String getUserForm() {
        return "userAdd";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute("addUser") User user) {
        userService.add(user);
        return "redirect:/admin";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") long id, Model model) {
        model.addAttribute("editUser", userService.getUserById(id));
        return "editUsers";
    }

    @PostMapping("/edit/{id}")
    public String updateUser(@ModelAttribute("editUser") User user) {
        userService.updateUsers(user);
        return "redirect:/admin";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.remove(userService.getUserById(id));
        return "redirect:/admin";
    }


    //USER logic

    @GetMapping(value = "/user")
    public String User(){
        return "user";
    }
}
