package com.hdd.dao;

import com.hdd.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 格调 on 2018/12/20.
 */
@Repository
public interface HeroRepository extends JpaRepository<Hero,Long> {
}
