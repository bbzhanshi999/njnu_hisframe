package edu.njnu.his.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecord {


    private String id;
    private String name;
    private String code;
    private String gender;
    private Integer age;

    private List<MrDrug> mrDrugs;
}
