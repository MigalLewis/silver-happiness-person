/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.za.mongo.model;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 *
 * @author migal
 */
@Data
public class PersonEntity {
  @Id
  private long id;
  private String firstname;
  private String lastname;
  private String fullname;
  private String nickname;
  private LocalDate dateOfBirth;
  private List<ContactDetailEntity> contactDetails;
}
