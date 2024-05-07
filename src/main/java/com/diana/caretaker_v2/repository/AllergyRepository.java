package com.diana.caretaker_v2.repository;

import com.diana.caretaker_v2.entity.Allergies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllergyRepository  extends JpaRepository<Allergies, Long> {
}
