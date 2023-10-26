package com.camerinfolks.form.service.impl;

import com.camerinfolks.form.model.Form;
import com.camerinfolks.form.repository.FormRepository;
import com.camerinfolks.form.service.FormService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FormServiceImpl implements FormService {

    private FormRepository formRepository;

    @Override
    public Form saveForm(Form form) {

        return formRepository.save(form);
    }
}
