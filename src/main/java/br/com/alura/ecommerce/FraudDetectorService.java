package br.com.alura.ecommerce;

import java.util.Map;
import java.util.Properties;
import java.util.function.Consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class FraudDetectorService {

	public static void main(String[] args) {
		
		var consumer = new KafkaConsumer<String, String>(properties());

	}

	private static Properties properties() {
		var  properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.);
		properties.setProperty(ConsumerConfig.);
		properties.setProperty(ConsumerConfig.);
		properties.setProperty(ConsumerConfig.);
		properties.setProperty(ConsumerConfig.);
		return null;
	}

}
