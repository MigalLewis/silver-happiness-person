/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.za.mongo.model;

import lombok.Data;
import za.co.migal.home.model.ContactType;

/**
 *
 * @author migal
 */
@Data
public class ContactDetailEntity {
  private long id;
  private String name;
  private ContactType type;
  private String value;
}
