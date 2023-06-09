package com.example.shopmoduletwo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ShopService {
	
	@Autowired
	private ShopRepository shopRepository;
	
	public Shop registerShop(Shop shop) {
		return shopRepository.save(shop);
		
	}
	
	public List<Shop> getShop(){
		return (List<Shop>) shopRepository.findAll();
	
		
	}
	
	public void deleteShop(Integer shop_id) {
		
		shopRepository.deleteById(shop_id);
	}
	
	public Shop updateShop(Shop shop) {
		Integer shop_id = shop.getShop_id();
		Shop shop1= shopRepository.findById(shop_id).get();
		shop1.setShop_category(shop.getShop_category());
		shop1.setShop_customers(shop.getShop_customers());
		shop1.setShop_name(shop.getShop_name());
		shop1.setShop_status(shop.getShop_status());
		
		
		return shopRepository.save(shop1);
		
	}

}
