package com.example.progect.repo;

import com.example.progect.model.ChefsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefsRepo extends JpaRepository<ChefsModel,Long> {
}
