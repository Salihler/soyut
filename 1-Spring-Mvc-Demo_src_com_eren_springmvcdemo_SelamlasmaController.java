package com.eren.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SelamlasmaController {

    @RequestMapping("/formgoster")
    public String showHomePage(){
        return "selamlasma-formu";
    }

    @RequestMapping("/selamver")
    public String formuGoster(){
        return "selamlasma-sayfasi";
    }

    @RequestMapping("/selamverModel")
    public String formuGosterModel(HttpServletRequest request, Model model){

        String isim = request.getParameter("isim");
        isim = isim.toUpperCase();
        System.out.println(isim);
        String selamlasma = "Hoşgeldin" + isim + "bey";
        model.addAttribute("selamlasmaCumlesi", selamlasma);

        return "selamlasma-sayfasi-model";
    }

}
