package com.xworkz.hotelvendor.tester;

import com.xworkz.hotelvendor.constants.HotelType;
import com.xworkz.hotelvendor.entity.VendorEntity;
import com.xworkz.hotelvendor.repository.VendorRepo;
import com.xworkz.hotelvendor.repository.VendorRepoImpl;
import com.xworkz.hotelvendor.service.VendorSereviceImpl;
import com.xworkz.hotelvendor.service.VendorService;

public class HotelVendor {

	public static void main(String[] args) {
		
		VendorEntity entity = new VendorEntity("Nakshatra", "Ballari", 98765432, 6, HotelType.SUPPLIER);
		
		VendorEntity entity1 = new VendorEntity("Bageecha", "Ballari", 98765423, 8, HotelType.RETAILER);

		VendorRepo repository = new VendorRepoImpl();
		repository.save(entity);
		VendorService vendorService = new VendorSereviceImpl(repository);
		vendorService.ValidAndSave(entity);
		
		
	}
}
