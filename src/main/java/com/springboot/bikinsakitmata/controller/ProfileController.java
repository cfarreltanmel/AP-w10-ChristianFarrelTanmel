package com.springboot.bikinsakitmata.controller;

import com.springboot.bikinsakitmata.Model.PageState;
import com.springboot.bikinsakitmata.Model.Student;
import com.springboot.bikinsakitmata.Repository.StudentRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfileController {

    @Autowired
    private StudentRepo StudentRepo;

    private PageState getOrCreateState(HttpSession session) {
        PageState state = (PageState) session.getAttribute("pageState");
        if (state == null) {
            state = new PageState();
            session.setAttribute("pageState", state);
        }
        return state;
    }

    @GetMapping("/")
    public String showProfile(Model model, HttpSession session) {
        PageState state = getOrCreateState(session);

        Student student = StudentRepo.findById(1L).orElse(new Student());
        
        model.addAttribute("student", student);
        model.addAttribute("state", state);
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