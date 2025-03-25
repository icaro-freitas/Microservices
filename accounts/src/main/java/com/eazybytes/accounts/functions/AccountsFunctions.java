package com.eazybytes.accounts.functions;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eazybytes.accounts.service.IAccountsService;

@Configuration
public class AccountsFunctions {

	private static final Logger log = LoggerFactory.getLogger(AccountsFunctions.class);

	@Bean
	public Consumer<Long> updateCommunication(IAccountsService accountsService) {
		return accountNumber -> {
			log.info("Updating Communication status for the account number : " + accountNumber.toString());
			accountsService.updateCommunicationStatus(accountNumber);
		};
	}

}
