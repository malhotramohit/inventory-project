package com.gs.gargdastak.dao;

import java.util.List;

import javax.xml.crypto.Data;

import com.gs.gargdastak.model.Salesman;
import com.gs.gargdastak.util.DatabaseUtil;

public class SalesmanDaoImpl implements SalesmanDao {

	@Override
	public void save(Salesman salesman) {

		DatabaseUtil.salesManTable.add(salesman);
	}

	@Override
	public Salesman findById(long id) {
		List<Salesman> salesManTable = DatabaseUtil.salesManTable;
		Salesman salesmanToReturn = null;
		for (Salesman salesman : salesManTable) {
			if (salesman.getSalesmanId() == id) {
				salesmanToReturn = salesman;
				break;
			}
		}
		return salesmanToReturn;
	}

}
