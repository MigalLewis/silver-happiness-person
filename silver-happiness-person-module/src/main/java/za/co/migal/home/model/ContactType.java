/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.model;

import lombok.Getter;

/**
 *
 * @author migal
 */
public enum ContactType {
  EMAIL(""),
  CELLPHONE(""),
  LANDLINE("");
  
  @Getter private final String regex;

  private ContactType(String regex) {
    this.regex = regex;
  }
  
  
}
