package com.microservices.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.currencyexchange.model.CurrencyExchangeModel;

public interface CurrencyExchangeRepository 
	extends JpaRepository<CurrencyExchangeModel, Long> {
	public CurrencyExchangeModel findByFromAndTo(String from, String to);
}
