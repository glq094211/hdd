package com.hdd.service;

import com.hdd.dao.HeroRepository;
import com.hdd.entity.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 格调 on 2018/12/20.
 */
@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public Hero save(Hero hero){
        return heroRepository.save(hero);
    }

    @Cacheable
    public List<Hero> findAll(){
        return heroRepository.findAll();
    }
}
