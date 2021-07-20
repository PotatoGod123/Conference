import com.potatogod123.repository.HibernateSpeakerRepositoryImpl;
import com.potatogod123.repository.SpeakerRepository;
import com.potatogod123.service.SpeakerService;
import com.potatogod123.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        //setter injection
        //        SpeakerServiceImpl service = new SpeakerServiceImpl();
        //        service.setRepository(getSpeakerRepository());

        //Constructor Injection
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
