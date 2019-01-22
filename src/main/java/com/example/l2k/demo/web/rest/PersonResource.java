package com.example.l2k.demo.web.rest;

import com.example.l2k.demo.dto.PersonDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author James Dunnam
 */
@RestController
@RequestMapping("/api")
public class PersonResource {

    @GetMapping("/persons")
    public ResponseEntity<PersonDTO> getPerson() {
        return ResponseEntity.ok(new PersonDTO("John", 22));
    }

    @PostMapping("/persons/{nickName}")
    public ResponseEntity<PersonDTO> updateNickname(@PathVariable("nickName") String nickName) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setNickName(nickName);

        return ResponseEntity.ok(personDTO);
    }
}
