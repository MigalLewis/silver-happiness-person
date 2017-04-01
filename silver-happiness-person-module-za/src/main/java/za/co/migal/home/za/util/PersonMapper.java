/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.za.util;

import java.util.ArrayList;
import za.co.migal.home.model.ContactDetail;
import za.co.migal.home.model.Person;
import za.co.migal.home.za.mongo.model.ContactDetailEntity;
import za.co.migal.home.za.mongo.model.PersonEntity;

/**
 *
 * @author migal
 */
public class PersonMapper {

  public Person mapPerson(PersonEntity entity) {
    Person model = new Person();
    model.setId(entity.getId());
    model.setFirstname(entity.getFirstname());
    model.setFullname(entity.getFullname());
    model.setLastname(entity.getLastname());
    model.setNickname(entity.getNickname());
    model.setDateOfBirth(entity.getDateOfBirth());
    model.setContactDetails(new ArrayList<>());
    entity.getContactDetails().stream().forEach((contactDetailEntity) -> {
      model.getContactDetails().add(mapContactDetail(contactDetailEntity));
    });
    return model;
  }

  public PersonEntity mapPersonEntity(Person model) {
    PersonEntity entity = new PersonEntity();
    entity.setId(model.getId());
    entity.setFirstname(model.getFirstname());
    entity.setFullname(model.getFullname());
    entity.setLastname(model.getLastname());
    entity.setNickname(model.getNickname());
    entity.setDateOfBirth(model.getDateOfBirth());
    entity.setContactDetails(new ArrayList<>());
    model.getContactDetails().stream().forEach((contactDetail) -> {
      entity.getContactDetails().add(mapContactDetail(contactDetail));
    });
    return entity;
  }

  public ContactDetail mapContactDetail(ContactDetailEntity entity) {
    ContactDetail model = new ContactDetail();
    model.setId(entity.getId());
    model.setName(entity.getName());
    model.setType(entity.getType());
    model.setValue(entity.getValue());
    return model;
  }

  public ContactDetailEntity mapContactDetail(ContactDetail model) {
    ContactDetailEntity entity = new ContactDetailEntity();
    entity.setId(model.getId());
    entity.setName(model.getName());
    entity.setType(model.getType());
    entity.setValue(model.getValue());
    return entity;
  }
}
