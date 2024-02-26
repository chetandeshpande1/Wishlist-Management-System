package com.example.demo.Controller;

//import com.example.demo.Entity.UserEntity;
//import com.example.demo.Repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class UserController {
//
//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @GetMapping("/signup")
//    public String signupForm(Model model) {
//         model.addAttribute("user", new UserEntity());
//        return "signup";
//    }
//
//    @PostMapping("/signup")
//    public String signupSubmit(@ModelAttribute UserEntity user, Model model) {
//         user.setPassword(passwordEncoder.encode(user.getPassword()));
//         userRepository.save(user);
//         model.addAttribute("message", "Signup successful for user: " + user.getUsername());
//        return "signup-success";
//    }
//
//    @GetMapping("/login")
//    public String loginForm() {
//        return "login";
//    }
//}








//solved code

//import com.example.demo.Entity.UserEntity;
//import com.example.demo.Repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class UserController {
//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @GetMapping("/signup")
//    public String signupForm(Model model) {
//        model.addAttribute("user", new UserEntity());
//        return "signup";
//    }
//
//    @PostMapping("/signup")
//    public String signupSubmit(@ModelAttribute UserEntity user, Model model) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);
//        model.addAttribute("message", "Signup successful for user: " + user.getUsername());
//        return "signup-success";
//    }
//
//    @GetMapping("/login")
//    public String loginForm() {
//        return "login";
//    }
//}





//solved code 2

import com.example.demo.Entity.UserEntity;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new UserEntity());
        return "signup";
    }

    @PostMapping("/signup")
    public String signupSubmit(@ModelAttribute UserEntity user, Model model) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        model.addAttribute("message", "Signup successful for user: " + user.getUsername());
        return "signup-success";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
}


