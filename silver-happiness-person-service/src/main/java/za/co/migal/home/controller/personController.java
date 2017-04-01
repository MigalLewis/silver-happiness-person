package za.co.migal.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.migal.home.PersonModule;
import za.co.migal.home.model.Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author migal
 */
@RestController
@RequestMapping(path = "/rest/person", produces = "application/json" )
public class personController {

  @Autowired
  private PersonModule module;

  @RequestMapping(method = RequestMethod.GET, value = "/hello")
  @ApiOperation(value = "Says hello.")
  public String hello() {
    return module.sayHello();
  }

  /**
   *
   * @param id
   * @return
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  @ApiOperation(value = "Finds person by id")
  @ResponseBody
  public Person findPerson(@PathVariable long id) {
    return module.getPerson(id);
  }
  @RequestMapping(method = RequestMethod.POST)
  @ApiOperation(value = "Adds a person")
  @ResponseBody
  public void addPerson(@RequestBody Person person){
    module.addPerson(person);
  }
  @RequestMapping(method = RequestMethod.DELETE , value = "/{id}")
  @ApiOperation(value = "Removes an person")
  public void deletePerson(@PathVariable long id){
    module.removePerson(id);
  }
  @RequestMapping(method = RequestMethod.PUT)
  @ApiOperation(value = "edits a person")
  @ResponseBody
  public Person updatePerson(@RequestBody Person person){
    return module.editPerson(person);
  }

}
