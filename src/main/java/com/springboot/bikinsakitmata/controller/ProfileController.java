package com.springboot.bikinsakitmata.controller;

import com.springboot.bikinsakitmata.Model.PageState;
import com.springboot.bikinsakitmata.Model.Student;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProfileController {

    private PageState getOrCreateState(HttpSession session) {
        PageState state = (PageState) session.getAttribute("pageState");
        if (state == null) {
            state = new PageState();
            session.setAttribute("pageState", state);
        }
        return state;
    }

    private Student createStudent() {
        return new Student(
                "Christian Farrel",
                "Tanmel",
                "Information and Multimedia Technology Student",
                "Passionate about games and technology.",
                "Christian is a logical thinker. He enjoys collaborative problem-solving. A bit of an introvert, but hyperactive around those he is comfortable with.",
                List.of(
                        "https://www.instagram.com/chrisfata_/",
                        "https://github.com/cfarreltanmel"
                ),
                19,
                "Gaming, Traveling",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill" 
        );
    }

    @GetMapping("/")
    public String showProfile(Model model, HttpSession session) {
        PageState state = getOrCreateState(session);
        Student student = createStudent();
        model.addAttribute("student", student);
        model.addAttribute("state", state); // Pass state object for conditional CSS class applying
        return "index";
    }
    
    @PostMapping("/toggle-dark-mode")
    public String toggleDarkMode(HttpSession session) {
        PageState state = getOrCreateState(session);
        state.setDarkMode(!state.isDarkMode());
        return "redirect:/";
    }
    
    @PostMapping("/toggle-personality")
    public String togglePersonality(HttpSession session) {
        PageState state = getOrCreateState(session);
        state.setShowPersonality(!state.isShowPersonality());
        return "redirect:/";
    }
}