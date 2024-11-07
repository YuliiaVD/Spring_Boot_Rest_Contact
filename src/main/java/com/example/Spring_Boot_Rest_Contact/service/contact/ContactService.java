package com.example.Spring_Boot_Rest_Contact.service.contact;

import com.example.Spring_Boot_Rest_Contact.dto.contact.ContactDtoRequest;
import com.example.Spring_Boot_Rest_Contact.entity.contact.Contact;
import com.example.Spring_Boot_Rest_Contact.service.BaseService;

import java.util.List;
import java.util.Optional;


public interface ContactService extends BaseService<Contact, ContactDtoRequest> {
    Contact create(ContactDtoRequest request);
    Optional<List<Contact>> getAll();
    Contact getById(Long id);
    Contact updateById(Long id, ContactDtoRequest request);
    boolean deleteById(Long id);
}
