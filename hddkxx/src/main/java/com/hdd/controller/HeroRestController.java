package com.hdd.controller;

import com.hdd.entity.Hero;
import com.hdd.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by 格调 on 2018/12/20.
 */
@RestController
public class HeroRestController {

    @Autowired
    public HeroService heroService;

    @RequestMapping("/hero")
    public Hero getHero(){
        Hero hero = new Hero();
        hero.setId(1l);
        hero.setName("invoker");
        hero.setCode("10");
        return hero;
    }

    @RequestMapping("/heros")
    public List<Hero> getHeros(){
        Hero hero = new Hero();
        hero.setId(1l);
        hero.setName("invoker");
        hero.setCode("10");
        List<Hero> list = new ArrayList<>();
        list.add(hero);
        list.add(hero);
        return list;
    }

    @RequestMapping("/save")
    public Hero save(){
        Hero hero = new Hero();
        hero.setName(UUID.randomUUID().toString());
        hero.setCode(UUID.randomUUID().toString());
        return heroService.save(hero);
    }

    @RequestMapping("findAll")
    public List<Hero> findAll(){
        return heroService.findAll();
    }
}
