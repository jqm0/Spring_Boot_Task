package com.codeline.sampleProject.Service;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Manager;
import com.codeline.sampleProject.Repository.AccountRepository;
import com.codeline.sampleProject.Repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository mangerRepository;
    public void saveManger(Manager manger) {
        mangerRepository.save(manger);
    }
    public List<Manager> getManger() {
        return mangerRepository.findAll();
    }
}
