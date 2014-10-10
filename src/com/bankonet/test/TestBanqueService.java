package com.bankonet.test;

import com.backonet.service.BanqueService;
import com.backonet.service.ServiceFactory;

public class TestBanqueService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BanqueService banqueService = ServiceFactory.getBanqueService();
		System.out.println(banqueService.calculerFonds(1));

	}

}
