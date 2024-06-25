package com.nc13.newBoard.controller;

import jakarta.servlet.http.HttpSession;
import com.nc13.newBoard.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nc13.newBoard.service.UserService;

@Controller

@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("auth")
    public String auth(UserDTO userDTO, HttpSession session){
         UserDTO result =userService.auth(userDTO);
         if(result != null){
             session.setAttribute("logIn", result);
             return"redirect:/board/showAll";
         }
         return "redirect:/";
    }


}
