package edu.njnu.his.controller;

import edu.njnu.his.dao.MrDrugDao;
import edu.njnu.his.model.MrDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrugController {

    @Autowired
    private MrDrugDao mrDrugDao;

    @GetMapping("/mrdrug/{mrId}")
    public List<MrDrug> getMrDrug(@PathVariable("mrId") String mrId){
        return mrDrugDao.findByMrId(mrId);
    }
}
