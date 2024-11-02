package book.your.cab.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import book.your.cab.constant.AppConstant;

@Configuration
public class KafkaConfig {

	@Bean
	
	public NewTopic topic()
	{
		return TopicBuilder.name(AppConstant.Fetch_Cab_Location).build();
	}
}
