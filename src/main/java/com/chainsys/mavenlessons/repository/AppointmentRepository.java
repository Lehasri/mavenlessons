package com.chainsys.mavenlessons.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.chainsys.mavenlessons.entity.Appointments;

public interface AppointmentRepository extends CrudRepository<Appointments, Integer>{

    Appointments findById(int id);
    Appointments save(Appointments apt);
    void deleteById(int id);
    List<Appointments> findAll();
    
//    @Query(value = "select a from Appointment a where a.doctorId=?1")
    // jpql = Java persistent query language
    // Here is an instance of Appointment 
//    List<Appointment> findAllByDoctorId(int drId);
    
    
}