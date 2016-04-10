/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import com.entity.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GuitarRepository extends JpaRepository<Guitar, Integer>{

    @Query("select g from Guitar g where g.name = :name")
    Guitar findByName(@Param("name") String name);
    
    @Query("select g from Guitar g join g.type t where t.guitarType = :guitarType")
    Guitar[] findByType(@Param("guitarType") String type);
    
    @Query("select g from Guitar g where g.id = :id")
    Guitar findById(@Param("id") int id);
}
