
package com.repository;

import com.entity.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface TreeRepository extends JpaRepository<Tree, Integer>{
    
//    @Query("select t from Tree t where t.treeType = :treeType")
//    Tree findByName(@Param("treeType") String name);
    
    @Query("select t from Tree t where t.id = :id")
    Tree findById(@Param("id") int id);
}
