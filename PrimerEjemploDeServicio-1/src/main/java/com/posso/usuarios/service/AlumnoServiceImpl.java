package com.posso.usuarios.service;

import java.util.Optional;

import com.posso.usuarios.entity.Alumno;
import com.posso.usuarios.repository.AlumnoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	AlumnoRepository dao;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll(){
		return dao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> findById(Long id){
		//TODO Auto-generated method stub
		return dao.findById(id);
		
	}
	
	@Override
	public Alumno save(Alumno alumno) {
		// TODO Auto-generated method stub
		return dao.save(alumno);
	}
	
	@Override
	@Transactional
	public void deleteById(Long id) {
		//TODO Auto-generated method stub
		dao.deleteById(id);
	}

	
}
