/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.movie.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pvargas
 */
@RestController
public class MovieController {
    
    @RequestMapping(value = "/movies")
    public List<String> available(){
        List<String> movies = new ArrayList<>();
        
        movies.add("Ghostbusters (1984)");
        movies.add("Ghostbusters (2016)");
        
        return movies;
    }
    
    
}
