package com.camerinfolks.form.repository;

import com.camerinfolks.form.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form, Long> {
}
