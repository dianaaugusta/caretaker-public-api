package com.diana.caretaker_v2.repository;

import com.diana.caretaker_v2.entity.Caretaker;
import com.diana.caretaker_v2.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CaretakerRepository  extends JpaRepository<Caretaker, Long> {

    @Query("SELECT c.children FROM Caretaker c WHERE c.id = :caretakerId")
    List<Child> findChildrenByCaretakerId(Long caretakerId);
}
