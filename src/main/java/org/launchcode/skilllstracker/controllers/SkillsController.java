package org.launchcode.skilllstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping("/")
    @ResponseBody
    public String rootSkills(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>Language Selection</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>";
    }
    @RequestMapping(value="formSubmit", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String language(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<h2>" + name + "</h2>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";
    }
    @GetMapping("form")
    @ResponseBody
    public String languageForm() {
        String html = "<h2>Name:</h2>" +
                "<form method='post' action ='/formSubmit'>" +
                "<input type='text' name='name'/>" +
                "<h2>My favorite language:</h2>" +
                "<select name='language1'>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Java'> Java </option>" +
                "<option value='Python'> Python </option>" +
                "</select>" +
                "<h2>My second favorite language:</h2>" +
                "<select name='language2'>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Java'> Java </option>" +
                "<option value='Python'> Python </option>" +
                "</select>" +
                "<h2>My third favorite language:</h2>" +
                "<select name='language3'>" +
                "<option value='javaScript'> JavaScript </option>" +
                "<option value='Java'> Java </option>" +
                "<option value='Python'> Python </option>" +
                "<br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>";
        return html;
    }
}
