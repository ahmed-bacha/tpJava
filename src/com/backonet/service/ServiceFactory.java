package com.backonet.service;

import com.backonet.service.impl.FakeBanqueServiceImpl;

public class ServiceFactory {

	public static BanqueService getBanqueService(){
		return new FakeBanqueServiceImpl();
	}
}
