package com.potatogod123.service;

import com.potatogod123.model.Speaker;
import com.potatogod123.repository.HibernateSpeakerRepositoryImpl;
import com.potatogod123.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository= speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }


    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
