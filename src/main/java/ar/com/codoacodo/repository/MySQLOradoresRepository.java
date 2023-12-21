package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.com.codoacodo.entity.Oradores;

public class MySQLOradoresRepository implements OradoresRepository{

	private Oradores orador;

	//implementar todos los metodos de la interface
	@Override
	public void save(Oradores orador) {
		String sql = "insert into orador (nombre, apellido, email, tema, fecha_alta) values (?,?,?,?,?)";		
		
		try (Connection conn = AdministradorDeConexiones.getConnection()) {
		PreparedStatement statement = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		//cargar los ? con los valores
		statement.setString(1, orador.getNombre());
		statement.setString(2, orador.getApellido());
		statement.setString(3, orador.getEmail());
		statement.setString(4, orador.getTema());
		statement.setDate(5, new java.sql.Date(System.currentTimeMillis()));
		
		statement.executeUpdate(); //INSERT, UPDATE, DELETE
		
		}catch (Exception e) {
			throw new IllegalArgumentException ("No se pudo crear el orador", e);
		}
		}			
	
		public Oradores getById (Long id) {
			String sql = "select id, nombre, apellido, email, tema, fecha_alta from oradores where id=?";			
						
			Oradores orador = null;
		
		try (Connection conn = AdministradorDeConexiones.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(sql);
		
			statement.setLong(1, id);
			
			ResultSet res = statement.executeQuery(); //SELECT
			
			//hay datos que evaluar?			
						
			if(res.next()) {					
				//obtengo los datos desde el ResultSet							
				Long _id = res.getLong(1);
				String nombre = res.getString(2);
				String apellido = res.getString(3);
				String email = res.getString(4);
				String tema = res.getString(5);
				Date fecha_alta = res.getDate(6);
				
				
				java.sql.Date sqlDate = java.sql.Date.valueOf("2023-12-18");
				LocalDate localDate = sqlDate.toLocalDate();
				orador = new Oradores(id, nombre, apellido, email, tema, LocalDate.now());
			}	
		
			} catch (Exception e) {
				
				throw new IllegalArgumentException("No se pudo obtener el orador", e);
			}		
		return orador;
		}

	@Override
	public void update(Oradores orador) {
		String sql = "update orador"
		+ "set nombre=?, apellido=?, email=?, tema=?"
		+ "where id = ?";		
		
		try (Connection conn = AdministradorDeConexiones.getConnection()){
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1, orador.getNombre());
			statement.setString(2, orador.getApellido());
			statement.setString(3, orador.getEmail());
			statement.setString(4, orador.getTema());
			statement.setLong(5, orador.getId());
			
			statement.executeUpdate();
			} catch(Exception e) {
				throw new IllegalArgumentException("No se pudo eliminar el orador", e);			
			}
		}

	@Override
	public void delete(Long id) {
		String sql = "delete from oradores where id=?";			
		try (Connection conn = AdministradorDeConexiones.getConnection()) {
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setLong(1, id);
		statement.executeUpdate();
		} catch(Exception e) {
			throw new IllegalArgumentException("No se pudo eliminar el orador", e);			
		}
		
	}

	@Override
	public List<Oradores> findAll() {
		String sql = "select id, nombre, apellido, email, tema, fecha_alta from oradores";		
		
		List<Oradores> oradores = new ArrayList<>(); //ver en curso avanzado (spring)
	
	try (Connection conn = AdministradorDeConexiones.getConnection()) {
		PreparedStatement statement = conn.prepareStatement(sql);
	
		ResultSet res = statement.executeQuery(); //SELECT
		
		//hay datos que evaluar? si, muuuchos. Mientras haya datos, extraere datos...			
					
		while(res.next()) {					
			//obtengo los datos desde el ResultSet							
			Long _id = res.getLong(1);
			String nombre = res.getString(2);
			String apellido = res.getString(3);
			String email = res.getString(4);
			String tema = res.getString(5);
			Date fecha_alta = res.getDate(6);
			
			
			java.sql.Date sqlDate = java.sql.Date.valueOf("2023-12-18");
			LocalDate localDate = sqlDate.toLocalDate();
			Oradores orador = new Oradores(_id, nombre, apellido, email, tema, LocalDate.now());
			oradores.add(orador);
		}	
	
		} catch (Exception e) {
			
			throw new IllegalArgumentException("No se pudo obtener el orador", e);
		}
	
	return oradores;
	}	

}
