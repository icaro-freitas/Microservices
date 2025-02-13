package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {
	
	CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
	
}
