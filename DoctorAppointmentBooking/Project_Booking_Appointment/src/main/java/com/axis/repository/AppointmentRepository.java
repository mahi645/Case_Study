package com.axis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.axis.model.Appointment;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
	@Query("SELECT appointment FROM Appointment appointment WHERE appointment.name=:name")
	List<Appointment> findByName(@Param("name")String name);

	//List<Appointment> findAllByAppointmentDate(LocalDate startDate, LocalDate endDate);

}
