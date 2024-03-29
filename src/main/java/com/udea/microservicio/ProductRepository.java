package com.udea.microservicio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
	@RestResource(path = "by-name")
    Collection<Product> findByProductName(@Param("rn") String rn);
	

}
