package ar.com.codoacodo.controllers;

import java.io.IOException;

import java.time.LocalDate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.cj.x.protobuf.MysqlxResultset.FetchDoneMoreOutParamsOrBuilder;

import ar.com.codoacodo.entity.Oradores;
import ar.com.codoacodo.repository.MySQLOradoresRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/api/orador/nuevo")
public class NuevoOradoresController extends HttpServlet{
	//enviar por POST todos los datos desde el formulario en el front

	protected void dopost(
			HttpServletRequest request, //aca viene todos del front
			HttpServletResponse response) //aca va hacia el front
	throws ServletException, IOException {
		
//		String nombre = request.getParameter("nombre"); //<input name="nombre">
//		String apellido = request.getParameter("apellido");
//		String email = request.getParameter("email");
//		String tema = request.getParameter("tema");
		
		String json = request.getReader()
				.lines()
				.collect(Collectors.joining(System.lineSeparator()));//Spring
		
		//Convertir de json string a objeto java usando la libreria de jackson2
		ObjectMapper mapper = new ObjectMapper();		
		 OradoresRequest oradoresRequest = mapper.readValue(json, OradoresRequest.class);
		
		//validaciones formato
		if(oradoresRequest.getNombre() == null || oradoresRequest.getApellido() == null || oradoresRequest.getEmail() == null || oradoresRequest.getTema() == null) {
			//response json de error		
	}
	
		MySQLOradoresRepository repository = new MySQLOradoresRepository();
		Oradores orador = new Oradores (oradoresRequest.getNombre(), 
				oradoresRequest.getApellido(),
				oradoresRequest.getEmail(), 
				oradoresRequest.getTema(), 
				LocalDate.now());
		
			repository.save (orador);
			
		//rconvierto ahora objeto java a string
		//enviar por medio del response al frontend
		   response.getWriter().print(mapper.writeValueAsString(orador));
	}	

}
