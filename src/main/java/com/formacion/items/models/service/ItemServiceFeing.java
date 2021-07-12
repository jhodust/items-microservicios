package com.formacion.items.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.formacion.items.clientes.ProductoClienteRest;
import com.formacion.items.models.Item;

@Service("serviceFeign")
@Primary
public class ItemServiceFeing implements IItemService {

	
	@Autowired
	private ProductoClienteRest clienteFeignProducto;
	
	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		System.out.println("listar feign");
		return clienteFeignProducto.listar().stream().map(p ->  new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		// TODO Auto-generated method stub
		return new Item(clienteFeignProducto.detalle(id), cantidad);
	}

}
