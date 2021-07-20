import com.potatogod123.repository.HibernateSpeakerRepositoryImpl;
import com.potatogod123.repository.SpeakerRepository;
import com.potatogod123.service.SpeakerService;
import com.potatogod123.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.potatogod123"})
public class AppConfig {

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)// for single instance
//    //SCOPE_PROTOTYPE is for multiple instances
//    //@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//    public SpeakerService getSpeakerService(){
//        //setter injection
//        //        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        //        service.setRepository(getSpeakerRepository());
//
//        //Constructor Injection
//        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        return service;
//    }

//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
