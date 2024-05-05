package com.diana.caretaker_v2.repository;

import com.diana.caretaker_v2.entity.Caretaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaretakerRepository  extends JpaRepository<Caretaker, Long> {
}
