package book.your.cab.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

	@KafkaListener(topics="sendermsg1", groupId="user-group")
public void cabLocation(String location)
{
	System.out.println(location);
}

}
