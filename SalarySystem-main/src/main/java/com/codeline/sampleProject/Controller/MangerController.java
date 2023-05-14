package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Manager;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Service.ManagerService;
import com.codeline.sampleProject.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MangerController {
    @Autowired
    ManagerService managerService;
    @RequestMapping("manager/create")
    public void saveManager () {
        createManager();
    }
    @RequestMapping("manager/get")
    public List<Manager> getManager () {
        return managerService.getManger();
    }
    public void createManager() {
        Manager manger = new Manager();
        manger.setCreatedDate(new Date());
        manger.setIsActive(true);
        manger.setTeamName("Ooredoo");
        manger.setDepartment("IT");
        managerService.saveManger(manger);
    }
}
