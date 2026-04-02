package com.myfirstapi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
/*
	importante: para que sirve cada anotacion y cada metodo, y como se relacionan entre si


	@RestController: es una anotacion que indica que esta clase es un controlador de REST, es decir, que va a manejar las peticiones HTTP y devolver respuestas en formato JSON o XML.
	@SpringBootApplication: es una anotacion que indica que esta clase es la clase principal de
	la aplicacion, es decir, que va a contener el metodo main que va a iniciar la aplicacion.
	@GetMapping: es una anotacion que indica que este metodo va a manejar las peticiones HTTP GET, es decir, que va a devolver una respuesta cuando se haga una peticion GET a la ruta especificada entre parentesis.
	@PostMapping: es una anotacion que indica que este metodo va a manejar las peticiones HTTP POST, es decir, que va a devolver una respuesta cuando se haga una peticion POST a la ruta especificada entre parentesis.
	@RequestBody: es una anotacion que indica que el parametro de este metodo va a ser el cuerpo de la peticion HTTP, es decir, que va a contener los datos que se envian en la peticion POST

	Usa Postman para POST
	 Verifica método HTTP
	 Verifica URL
	 Verifica headers
	 Verifica anotaciones (@RestController)



*/ 
@RestController 
@SpringBootApplication // para que sirve 
public class DemoApplication {
	@GetMapping("/hello") // que es un getmapping
	public String hello() {
		return "Hello, World to my First API!";
	}
@PostMapping("/sayHello") // que es un postmapping
public String postMethodName(@RequestBody String entity) {
    return "Hello, "+entity;
}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
