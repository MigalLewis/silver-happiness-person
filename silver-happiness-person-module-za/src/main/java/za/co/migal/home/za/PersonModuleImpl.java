package za.co.migal.home.za;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.migal.home.model.Person;
import za.co.migal.home.za.mongo.repository.PersonRepository;
import za.co.migal.home.za.util.PersonMapper;
import za.co.migal.home.PersonModule;
import za.co.migal.home.za.mongo.model.PersonEntity;

@Component
public class PersonModuleImpl implements PersonModule {

  PersonMapper personMapper;
  PersonRepository personRepository;

  @Override
  public String sayHello() {
    return "Hello from South Africa";
  }

  @Override
  public void addPerson(Person person) {
    personRepository.save(personMapper.mapPersonEntity(person));
  }

  @Override
  public void removePerson(long id) {
    personRepository.delete(Long.toString(id));
  }

  @Override
  public Person editPerson(Person person) {
    PersonEntity personEntity=personRepository.save(personMapper.mapPersonEntity(person));
    return personMapper.mapPerson(personEntity);
  }

  @Override
  public Person getPerson(long id) {
    return personMapper.mapPerson(personRepository.findById(id));
  }

  @Autowired
  public void setPersonMapper(PersonMapper personMapper) {
    this.personMapper = personMapper;
  }

  @Autowired
  public void setPersonRepository(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

}
