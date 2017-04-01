/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.za.mongo.repository;

import za.co.migal.home.za.mongo.model.PersonEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author migal
 */
public interface PersonRepository extends MongoRepository<PersonEntity, String>{
  /**
   * 
   * @param id
   * @return 
   */
  public PersonEntity findById(long id);

}
