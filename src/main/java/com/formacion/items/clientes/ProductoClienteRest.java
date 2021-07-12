package com.formacion.items.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.formacion.items.models.Producto;

@FeignClient(name="servicio-productos", url="localhost:8001")
public interface ProductoClienteRest {

	@GetMapping(value="/listar")
	public List<Producto> listar();
	
	@GetMapping(value = "/ver/{id}")
	public Producto detalle(@PathVariable Long id);
}
