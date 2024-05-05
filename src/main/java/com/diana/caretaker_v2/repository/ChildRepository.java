package com.diana.caretaker_v2.repository;

import com.diana.caretaker_v2.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChildRepository extends JpaRepository<Child, Long> {

}
