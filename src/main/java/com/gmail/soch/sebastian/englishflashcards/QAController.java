/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.soch.sebastian.englishflashcards;

import com.gmail.soch.sebastian.englishflashcards.logic.LessonManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ssoch
 */
@Controller
public class QAController {

    @Autowired
    private LessonManager lessonManager;
            
    @RequestMapping("showQuestion")
    public String showQuestion(Model model) {
        model.addAttribute("question", lessonManager.getNextQuestion());
        model.addAttribute("answer", "................");
        model.addAttribute("button_text", "Answer");
        return "questionandanswer";
    }

    @RequestMapping("showAnswer")
    public String showAnswer(Model model) {
        model.addAttribute("question", lessonManager.getQuestion());
        model.addAttribute("answer", lessonManager.getAnswer());
        model.addAttribute("button_text", "NextQuestion");
        return "questionandanswer";
    }
}
