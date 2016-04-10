/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import com.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author home
 */
public interface ColorRepository extends JpaRepository<Color, Integer>{
    
    @Query("select c from Color c where c.color = :color")
    Color findByName(@Param("color") String name);
    
    @Query("select c from Color c where c.id = :id")
    Color findById(@Param("id") int id);
}
