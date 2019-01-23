package edu.njnu.his.service;

import edu.njnu.his.model.MrDrug;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("drug-server")
public interface DrugService {

    @RequestMapping("/mrdrug/{mrId}")
    List<MrDrug> getMrDrug(@PathVariable("mrId") String mrId);
}
