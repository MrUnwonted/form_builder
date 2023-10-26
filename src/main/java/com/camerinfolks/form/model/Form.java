package com.camerinfolks.form.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "form")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String form;
    @Column
    private String AutoComplete;
    @Column
    private String Button;
    @Column
    private String CheckboxGroup;
    @Column
    private Date Date;
    @Column
    private String File;
    @Column
    private String Header;
    @Column
    private String Hidden;
    @Column
    private Long Number;
    @Column
    private String Paragraph;
    @Column
    private String Radio;
    @Column
    private String Select;
    @Column
    private String Text;

    private String TextArea;


}
