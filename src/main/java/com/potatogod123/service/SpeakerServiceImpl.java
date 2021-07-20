package com.potatogod123.service;

import com.potatogod123.model.Speaker;
import com.potatogod123.repository.HibernateSpeakerRepositoryImpl;
import com.potatogod123.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        this.repository= speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }


    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
