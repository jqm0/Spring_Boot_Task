package com.codeline.sampleProject.Repository;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
