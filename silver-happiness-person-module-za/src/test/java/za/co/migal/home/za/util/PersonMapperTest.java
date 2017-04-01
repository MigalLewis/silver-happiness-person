/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.za.util;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import za.co.migal.home.model.ContactDetail;
import za.co.migal.home.model.ContactType;
import za.co.migal.home.model.Person;
import za.co.migal.home.za.mongo.model.ContactDetailEntity;
import za.co.migal.home.za.mongo.model.PersonEntity;

/**
 *
 * @author migal
 */
public class PersonMapperTest {

  public PersonMapperTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of mapPerson method, of class PersonMapper.
   */
  @Test
  public void testMapPerson() {
    System.out.println("mapPerson");
    PersonEntity entity = new PersonEntity();
    entity.setFirstname("Peter");
    entity.setLastname("Parker");
    entity.setFullname("Peter Benjamin Parker");
    entity.setNickname("Spiderman");
    entity.setDateOfBirth(LocalDate.MIN);
    entity.setId(1);
    ContactDetailEntity contactDetail = new ContactDetailEntity();
    contactDetail.setId(1);
    contactDetail.setName("My Cell");
    contactDetail.setType(ContactType.CELLPHONE);
    contactDetail.setValue("043 038 3849");
    entity.setContactDetails(new ArrayList<>());
    entity.getContactDetails().add(contactDetail);
    PersonMapper instance = new PersonMapper();
    Person expResult = new Person();
    expResult.setFirstname("Peter");
    expResult.setLastname("Parker");
    expResult.setFullname("Peter Benjamin Parker");
    expResult.setNickname("Spiderman");
    expResult.setDateOfBirth(LocalDate.MIN);
    expResult.setId(1);
    ContactDetail contactDetailExpResult = new ContactDetail();
    contactDetailExpResult.setId(1);
    contactDetailExpResult.setName("My Cell");
    contactDetailExpResult.setType(ContactType.CELLPHONE);
    contactDetailExpResult.setValue("043 038 3849");
    expResult.setContactDetails(new ArrayList<>());
    expResult.getContactDetails().add(contactDetailExpResult);
    Person result = instance.mapPerson(entity);
    assertEquals(expResult, result);
  }

  /**
   * Test of mapPersonEntity method, of class PersonMapper.
   */
  @Test
  public void testMapPersonEntity() {
    System.out.println("mapPersonEntity");
    Person model = new Person();
    model.setFirstname("Peter");
    model.setLastname("Parker");
    model.setFullname("Peter Benjamin Parker");
    model.setNickname("Spiderman");
    model.setDateOfBirth(LocalDate.MIN);
    model.setId(1);
    ContactDetail contactDetail = new ContactDetail();
    contactDetail.setId(1);
    contactDetail.setName("My Cell");
    contactDetail.setType(ContactType.CELLPHONE);
    contactDetail.setValue("043 038 3849");
    model.setContactDetails(new ArrayList<>());
    model.getContactDetails().add(contactDetail);
    PersonMapper instance = new PersonMapper();
    PersonEntity expResult = new PersonEntity();
    expResult.setFirstname("Peter");
    expResult.setLastname("Parker");
    expResult.setFullname("Peter Benjamin Parker");
    expResult.setNickname("Spiderman");
    expResult.setDateOfBirth(LocalDate.MIN);
    expResult.setId(1);
    ContactDetailEntity contactDetailExpResult = new ContactDetailEntity();
    contactDetailExpResult.setId(1);
    contactDetailExpResult.setName("My Cell");
    contactDetailExpResult.setType(ContactType.CELLPHONE);
    contactDetailExpResult.setValue("043 038 3849");
    expResult.setContactDetails(new ArrayList<>());
    expResult.getContactDetails().add(contactDetailExpResult);
    PersonEntity result = instance.mapPersonEntity(model);
    assertEquals(expResult, result);
  }

  /**
   * Test of mapContactDetail method, of class PersonMapper.
   */
  @Test
  public void testMapContactDetail_ContactDetailEntity() {
    System.out.println("mapContactDetail");
    ContactDetailEntity entity = new ContactDetailEntity();
    entity.setId(1);
    entity.setName("My Cell");
    entity.setType(ContactType.CELLPHONE);
    entity.setValue("043 038 3849");
    PersonMapper instance = new PersonMapper();
    ContactDetail expResult = new ContactDetail();
    expResult.setId(1);
    expResult.setType(ContactType.CELLPHONE);
    expResult.setValue("043 038 3849");
    expResult.setName("My Cell");
    ContactDetail result = instance.mapContactDetail(entity);
    assertEquals(expResult, result);
  }

  /**
   * Test of mapContactDetail method, of class PersonMapper.
   */
  @Test
  public void testMapContactDetail_ContactDetail() {
    System.out.println("mapContactDetail");
    ContactDetail model = new ContactDetail();
    model.setId(1);
    model.setName("My Cell");
    model.setType(ContactType.CELLPHONE);
    model.setValue("043 038 3849");
    PersonMapper instance = new PersonMapper();
    ContactDetailEntity expResult = new ContactDetailEntity();
    expResult.setId(1);
    expResult.setType(ContactType.CELLPHONE);
    expResult.setValue("043 038 3849");
    expResult.setName("My Cell");
    ContactDetailEntity result = instance.mapContactDetail(model);
    assertEquals(expResult, result);

  }

}
