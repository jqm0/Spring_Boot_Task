package com.codeline.sampleProject.Repository;

import com.codeline.sampleProject.Models.Manager;
import com.codeline.sampleProject.Models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
