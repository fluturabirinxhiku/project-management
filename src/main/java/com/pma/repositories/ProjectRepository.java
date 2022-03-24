package com.pma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pma.models.Project;


public interface ProjectRepository extends JpaRepository<Project,Integer > {

	
	
}
