package com.gameslib.weblib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/gameList", method=RequestMethod.GET)
public class GameController {

    // All Games List View
    @GetMapping("/")
    public String reguestGameList() {
        return "gameList.html";
    }

    // One Game Detail View
    @GetMapping("/gameDetail")
    public String requestGameDetail() {
        return "gameDetail.html";
    }

}
