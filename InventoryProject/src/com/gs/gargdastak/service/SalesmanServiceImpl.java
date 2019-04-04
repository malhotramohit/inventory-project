package com.gs.gargdastak.service;

import com.gs.gargdastak.dao.SalesmanDao;
import com.gs.gargdastak.dao.SalesmanDaoImpl;
import com.gs.gargdastak.model.Salesman;

public class SalesmanServiceImpl implements SalesmanService {

	private SalesmanDao salesmanDaoImpl = new SalesmanDaoImpl();

	@Override
	public void save(Salesman salesman) {
		salesmanDaoImpl.save(salesman);
	}

	@Override
	public Salesman findById(long id) {
		return salesmanDaoImpl.findById(id);
	}

	@Override
	public Salesman findByIdWithRoundedComm(long i) throws SalemanNotFoundException {
		Salesman salesman = salesmanDaoImpl.findById(i);
		if (null == salesman) {
			throw new SalemanNotFoundException("Salesman nhi hai");
		}
		Long roundedValue = Math.round(salesman.getCommision());

		salesman.setCommision(Double.valueOf(roundedValue));

		return salesman;

	}

}
