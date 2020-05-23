package com.uca.capas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.dao.EstudianteDAO;
import com.uca.capas.domain.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	EstudianteDAO estudianteDao;
	
	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteDao.findAll();
	}
	
	@Override
	@Transactional
	public void insert(Estudiante estudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteDao.insert(estudiante);
	}

	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteDao.findOne(code);
	}

	@Override
	public void save(Estudiante estudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteDao.save(estudiante);
	}

	@Override
	@Transactional
	public void delete(Integer codigoEstudiant) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteDao.delete(codigoEstudiant);
	}

}
