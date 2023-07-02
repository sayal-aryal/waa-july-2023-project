package com.miu.waa.aluminimanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@DiscriminatorValue("faculty")
public class Faculty extends Person {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="department_id")
    private Department department;

}
