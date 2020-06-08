package com.example.ibex.ibexmockdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ibex.ibexmockdata.model.Dashboards;

@Repository
public interface DashboardsRepository extends JpaRepository<Dashboards,Long>{

}
