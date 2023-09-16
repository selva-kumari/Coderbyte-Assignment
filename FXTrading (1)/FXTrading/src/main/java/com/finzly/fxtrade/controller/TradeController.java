package com.finzly.fxtrade.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.fxtrade.entity.CurrencyRate;
import com.finzly.fxtrade.entity.Trade;
import com.finzly.fxtrade.service.TradeService;

@RestController
@RequestMapping("/trade")

public class TradeController {
	@Autowired
	TradeService tradeservice;

	@PostMapping("/booktrade")
	public String tradeInformation(@RequestBody Trade trade, CurrencyRate currencyrate) {
		 tradeservice.bookTrade(trade, currencyrate);
		 return "Your trade booked Successfully";
	}
	
	@PostMapping("/addcurrency")
	public String addCurrency(@RequestBody CurrencyRate currencyrate) {
		tradeservice.addCurrency(currencyrate);
		return "Currency information added successfully";
	}
	
    @GetMapping("/gettradedetails")
	public List<Trade> getAllTradeDetails() {
	    return tradeservice.getAllTradeDetails();
	    }
    
    @GetMapping("/getcurrencydetails")
    public List<CurrencyRate> getAllCurrencyDetails(){
    	return tradeservice.getAllCurrencyDetails();
    	
    }

}