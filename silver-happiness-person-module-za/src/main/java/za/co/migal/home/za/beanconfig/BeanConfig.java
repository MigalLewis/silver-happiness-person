package za.co.migal.home.za.beanconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;
import za.co.migal.home.za.util.PersonMapper;



@Configuration
@ComponentScan(basePackages = "za.co.migal.home")
@Conditional(SouthAfrica.class)
public class BeanConfig {
  private static final Logger LOGGER = LoggerFactory.getLogger(BeanConfig.class);
  
  @Bean
  public PersonMapper personMapper(){
    return new PersonMapper();
  } 
   
}
