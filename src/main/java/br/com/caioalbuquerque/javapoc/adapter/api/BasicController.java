package br.com.caioalbuquerque.javapoc.adapter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @GetMapping(value = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return "Basic id: " + id;
    }
}