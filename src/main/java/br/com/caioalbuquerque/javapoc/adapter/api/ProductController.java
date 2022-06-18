package br.com.caioalbuquerque.javapoc.adapter.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import br.com.caioalbuquerque.javapoc.domain.BasicResource;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping(value = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return "Basic id: " + id;
    }

    @GetMapping
    public List<String> findAll() {
        return Arrays.asList("foo1", "foo2");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody BasicResource basicResource) {
        return basicResource.getId();
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String update(@PathVariable( "id" ) Long id, @RequestBody BasicResource basicResource) {
        return "void, but string updated to see if it's ok";
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable("id") Long id) {
        return "void, but string deleted to see if it's ok";
    }
}