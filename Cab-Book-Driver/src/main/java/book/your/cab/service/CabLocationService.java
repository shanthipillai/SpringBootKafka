package book.your.cab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import book.your.cab.constant.AppConstant;

@Service
public class CabLocationService {

	@Autowired
	KafkaTemplate< String, Object> kafkaTemplate;
	
	public boolean updateLocation(String location)
	{
		kafkaTemplate.send(AppConstant.Fetch_Cab_Location, location);
	    return true;
	}
}
