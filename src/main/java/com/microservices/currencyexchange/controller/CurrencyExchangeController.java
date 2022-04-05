package com.microservices.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.currencyexchange.model.CurrencyExchangeModel;
import com.microservices.currencyexchange.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	private CurrencyExchangeModel getCurrencyExchange(@PathVariable String from, 
			@PathVariable String to) {
		return currencyExchangeRepository.findByFromAndTo(from, to);
	}
}
