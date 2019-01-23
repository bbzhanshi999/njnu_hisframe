package edu.njnu.his.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class MedicalRecord {

    @Id
    private String id;
    private String name;
    private String code;
    private String gender;
    private Integer age;

    private List<MrDrug> mrDrugs;
}
