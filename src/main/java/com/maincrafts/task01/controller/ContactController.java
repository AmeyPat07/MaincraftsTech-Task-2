package com.maincrafts.task01.controller;

import com.maincrafts.task01.model.Contact;
import com.maincrafts.task01.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/contact")
    public String handleContact(@RequestParam String name, 
                               @RequestParam String email, 
                               @RequestParam String message) {
        
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);
        
        Contact contact = new Contact(name, email, message);
        contactRepository.save(contact);
        
        return "Form submitted successfully!";
    }
    
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
