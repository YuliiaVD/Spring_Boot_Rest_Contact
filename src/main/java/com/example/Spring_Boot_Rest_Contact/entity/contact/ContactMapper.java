package com.example.Spring_Boot_Rest_Contact.entity.contact;

import com.example.Spring_Boot_Rest_Contact.dto.contact.ContactDtoRequest;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    public Contact dtoCreateToEntity(ContactDtoRequest request) {
        Contact contact = new Contact();

        Long id = request.id();
        if (id != null) contact.setId(id);

        String firstName = request.firstName();
        if (firstName != null) {
            if (!firstName.isBlank())
                contact.setFirstName(firstName);
        }

        String lastName = request.lastName();
        if (lastName != null) {
            if (!lastName.isBlank())
                contact.setLastName(lastName);
        }

        String phone = request.phone();
        if (phone != null) {
            if (!phone.isBlank())
                contact.setPhone(phone);
        }

        return contact;
    }

    public Contact dtoUpdateToEntity(Long id, ContactDtoRequest request,
                                     Contact contactToUpdate) {
        if (id != null) contactToUpdate.setId(id);

        String firstName = request.firstName();
        if (firstName != null) {
            if (!firstName.isBlank())
                contactToUpdate.setFirstName(firstName);
        }

        String lastName = request.lastName();
        if (lastName != null) {
            if (!lastName.isBlank())
                contactToUpdate.setLastName(lastName);
        }

        String phone = request.phone();
        if (phone != null) {
            if (!phone.isBlank())
                contactToUpdate.setPhone(phone);
        }

        return contactToUpdate;
    }
}
