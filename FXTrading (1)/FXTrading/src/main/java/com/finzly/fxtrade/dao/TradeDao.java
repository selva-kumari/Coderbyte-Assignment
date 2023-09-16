package com.finzly.fxtrade.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.fxtrade.entity.CurrencyRate;
import com.finzly.fxtrade.entity.Trade;


@Repository
public class TradeDao {
	@Autowired
	SessionFactory factory;

	public String addTrade(Trade trade1) {
		Session session = factory.openSession();
		session.save(trade1);
		session.beginTransaction().commit();
		return "Trade booked successfully..";
	}

	public String addCurrency(CurrencyRate currencyrate) {
		Session session = factory.openSession();
		session.save(currencyrate);
		session.beginTransaction().commit();
		return "currency added successfully..";
	}

	public List<Trade> getAllTradeDetails() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Trade.class);
		return criteria.list();
	}

	public List<CurrencyRate> getAllCurrencyDetails() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CurrencyRate.class);
		return criteria.list();
	}
}
