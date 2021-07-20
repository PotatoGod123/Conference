package com.potatogod123.repository;

import com.potatogod123.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
