/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import com.entity.GuitarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GuitarTypeRepository extends JpaRepository<GuitarType, Integer>{
 
    @Query("select g from GuitarType g where g.id = :id")
    GuitarType findById(@Param("id") int id);
}
