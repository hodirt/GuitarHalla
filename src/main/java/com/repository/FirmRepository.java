
package com.repository;

import com.entity.Firm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author home
 */
public interface FirmRepository extends JpaRepository<Firm, Integer>{
    
    @Query("select f from Firm f where f.firm = :firm")
    Firm findByName(@Param("firm") String firm);
    
    @Query("select f from Firm f where f.id = :id")
    Firm findById(@Param("id") int id);
}
