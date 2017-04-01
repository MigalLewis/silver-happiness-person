/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.model;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

/**
 *
 * @author migal
 */
@Data
public class Person {
  private long id;
  private String firstname;
  private String lastname;
  private String fullname;
  private String nickname;
  private LocalDate dateOfBirth;
  private List<ContactDetail> contactDetails;
  
  
  public int getAge(){
    return 0;
  }
}
