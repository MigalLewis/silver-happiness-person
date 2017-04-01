/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home;

import za.co.migal.home.model.Person;

public interface PersonModule{

    public String sayHello();
    
    public void addPerson(Person person);
    
    public void removePerson(long id);
    
    public Person editPerson(Person person);
    
    public Person getPerson(long id);
    
}
