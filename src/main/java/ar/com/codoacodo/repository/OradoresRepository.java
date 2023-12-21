package ar.com.codoacodo.repository;

import java.util.List;


import ar.com.codoacodo.entity.Oradores;

public interface OradoresRepository {
	public void save(Oradores orador);
	public Oradores getById(Long id);
	public void update(Oradores orador);
	public void delete(Long id);
	List<Oradores> findAll();

}
