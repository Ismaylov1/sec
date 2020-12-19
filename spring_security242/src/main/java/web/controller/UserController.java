//package web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import web.model.User;
//import web.service.UserServiceImpl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//	@GetMapping("/hello")
//	public String printWelcome(ModelMap model) {
//		System.out.println("govno");
//		List<String> messages = new ArrayList<>();
//		messages.add("Hello!");
//		messages.add("I'm Spring MVC-SECURITY application");
//		messages.add("5.2.0 version by sep'19 ");
//		model.addAttribute("messages", messages);
//		return "hello";
//	}
//	@Autowired
//	private UserServiceImpl userService;
//
//	@GetMapping
//	public String allUsers(Model model) {
//		model.addAttribute("allUsers", userService.listUsers());
//		List<User> users = userService.listUsers();
//		for (User user : users
//		) {
//			System.out.println(user);
//		}
//		return "user";
//	}
//}