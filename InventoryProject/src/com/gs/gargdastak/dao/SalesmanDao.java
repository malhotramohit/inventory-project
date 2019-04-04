package com.gs.gargdastak.dao;

import com.gs.gargdastak.model.Salesman;

public interface SalesmanDao {
	
	public void save(Salesman salesman);
	
	public Salesman findById(long id);

}
