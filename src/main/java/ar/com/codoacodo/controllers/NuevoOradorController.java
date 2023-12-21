package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.time.LocalDate;

import com.mysql.cj.x.protobuf.MysqlxResultset.FetchDoneMoreOutParamsOrBuilder;

import ar.com.codoacodo.entity.Oradores;
import ar.com.codoacodo.repository.MySQLOradoresRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevoOradorController extends HttpServlet{
	//enviar por POST todos los datos desde el formulario en el front

	protected void dopost(
			HttpServletRequest request, //aca viene todos del front
			HttpServletResponse response) //aca va hacia el front
	throws ServletException, IOException {
		String nombre = request.getParameter("nombre"); //<input name="nombre">
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String tema = request.getParameter("tema");
		
		//validaciones formato
		if(nombre == null || email == null || tema == null) {
			//response json de error		
	}
	
		MySQLOradoresRepository repository = new MySQLOradoresRepository();
			repository.save (new Oradores(nombre, apellido, email, tema, LocalDate.now()));
			
		//respondo al frontend un json ok
		   System.out.println("ok");
	}	

	}


