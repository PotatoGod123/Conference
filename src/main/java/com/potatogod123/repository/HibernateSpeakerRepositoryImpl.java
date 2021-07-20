package com.potatogod123.repository;

import com.potatogod123.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

     @Override
     public List<Speaker> findAll(){
         List<Speaker> speakers = new ArrayList<>();

         Speaker speaker = new Speaker();
         speaker.setFirstName("Cristian");
         speaker.setLastName("Robles");
         speakers.add(speaker);

         return speakers;
     }

}
