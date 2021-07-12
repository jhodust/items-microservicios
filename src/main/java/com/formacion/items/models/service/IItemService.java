package com.formacion.items.models.service;

import java.util.List;

import com.formacion.items.models.Item;

public interface IItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
