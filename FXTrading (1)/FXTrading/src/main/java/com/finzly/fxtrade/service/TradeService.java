package com.finzly.fxtrade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.fxtrade.customexception.CurrencyPairNotSpecifiedException;
import com.finzly.fxtrade.customexception.TradeNotFoundException;
import com.finzly.fxtrade.dao.TradeDao;
import com.finzly.fxtrade.entity.CurrencyRate;
import com.finzly.fxtrade.entity.Trade;

@Service
public class TradeService {
	@Autowired
	TradeDao tradedao;

	public String bookTrade(Trade trade, CurrencyRate currencyrate) {
		List<CurrencyRate> list = tradedao.getAllCurrencyDetails();
		Trade trade1 = new Trade();
		try {
			for (CurrencyRate currencylist : list) {
				if (currencylist.getCurrencyPair().equals(trade.getCurrencyPair())) {
					trade1.setCustomerName(trade.getCustomerName());
					trade1.setTradeNumber(trade.getTradeNumber());
					trade1.setCurrencyPair(trade.getCurrencyPair());
					trade1.setAmountToTransfer(trade.getAmountToTransfer());
					trade1.setExchangeRate(currencylist.getExchangeRate());
					trade1.setTransferredAmount(currencylist.getExchangeRate() * trade.getAmountToTransfer());

					return tradedao.addTrade(trade1);
				}
			}

			throw new TradeNotFoundException("Trade not found for currency pair: " + trade.getCurrencyPair());
		} catch (TradeNotFoundException e) {
			e.printStackTrace();
			return "Trade not found";
		}

		catch (CurrencyPairNotSpecifiedException e) {
			e.printStackTrace();
			return "Currency pair not specified";
		}
	}

	public void addCurrency(CurrencyRate currencyrate) {
		tradedao.addCurrency(currencyrate);

	}

	public List<Trade> getAllTradeDetails() {
		return tradedao.getAllTradeDetails();
	}

	public List<CurrencyRate> getAllCurrencyDetails() {
		return tradedao.getAllCurrencyDetails();
	}

}
