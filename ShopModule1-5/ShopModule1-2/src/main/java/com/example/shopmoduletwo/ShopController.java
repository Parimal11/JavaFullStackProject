package com.example.shopmoduletwo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")

public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
		// RESTful API method for Create operation
		@PostMapping("/shop")
		public Shop registerShop(@RequestBody Shop shop)
		{
			return shopService.registerShop(shop);
		}
		
		
		@GetMapping("/getShop")
		public List<Shop> getShop(){
			return shopService.getShop();
			
			
		}
		
		@DeleteMapping("/deleteShop")
		public void deleteShop(@RequestParam Integer shop_id) {
			shopService.deleteShop(shop_id);
		}
		
		@PutMapping("/updateShop")
		public Shop updateShop(@RequestBody Shop shop) {
			return shopService.updateShop(shop);
			
		}


}
