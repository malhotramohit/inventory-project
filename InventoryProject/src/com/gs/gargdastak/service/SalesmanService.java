package com.gs.gargdastak.service;

import com.gs.gargdastak.model.Salesman;

public interface SalesmanService {

	public void save(Salesman salesman);

	public Salesman findById(long id);

	public Salesman findByIdWithRoundedComm(long i) throws SalemanNotFoundException;

}
