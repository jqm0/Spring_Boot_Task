package com.codeline.sampleProject.Service;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Manager;
import com.codeline.sampleProject.Repository.AccountRepository;
import com.codeline.sampleProject.Repository.ManagerRepository;
import com.codeline.sampleProject.ResponseObject.GetManagerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public GetManagerResponse getManagerById(Long managerId) {
        Optional<Manager> optionalManager = mangerRepository.findById(managerId);
        if (!optionalManager.isEmpty()) {
            Manager manager = optionalManager.get();
            GetManagerResponse managerResponse = new GetManagerResponse(manager.getDepartment(), manager.getTeamName());
            return managerResponse;
        } else {
            return null;
        }
    }
}
