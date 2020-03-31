/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.utp.isc.gia.hello.CalculadoraController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Michael
 */
@RestController
@RequestMapping("calc")
public class CalculadoraController {
    
    @GetMapping("suma")
    public String suma(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
        Double val = num1 + num2;
        return String.format(""
                + " <body style=\"background: BLACK\">"
                + "<h1 style = 'background : BLACK; color: WHITE;padding : 20px'> "
                + "Suma = <i style= 'color: WHITE'> %.2f </i> "
                + "</h1>"
                + "</body>",
                 val);    }
    
     @GetMapping("resta")
    public String resta(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
        Double val = num1 - num2;
         return String.format(""
                 + " <body style=\"background: BLACK\">"
                 + "<h1 style = 'background : BLACK; color: WHITE;padding : 20px'> "
                 + "Resta = <i style= 'color: WHITE'> %.2f </i> "
                 + "</h1>"
                 + "</body>",
                  val);    }
    
     @GetMapping("multiplicacion")
    public String multiplicacion(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
        Double val = num1 * num2;
         return String.format(""
                 + " <body style=\"background: BLACK\">"
                 + "<h1 style = 'background : BLACK; color: WHITE;padding : 20px'> "
                 + "Multiplicacion = <i style= 'color: WHITE'> %.2f </i> "
                 + "</h1>"
                 + "</body>",
                  val);    }
    
     @GetMapping("division")
    public String division(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
        Double val = num1 / num2;
        return String.format(""
                + " <body style=\"background: BLACK\">"
                + "<h1 style = 'background : BLACK; color: WHITE;padding : 20px'> "
                + "División = <i style= 'color: WHITE'> %.2f </i> "
                + "</h1>"
                + "</body>"
                ,val);
    }
    
}
