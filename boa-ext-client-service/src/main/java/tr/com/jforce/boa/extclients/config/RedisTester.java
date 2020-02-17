package tr.com.jforce.boa.extclients.config;

import org.springframework.boot.SpringApplication;

import redis.clients.jedis.Jedis;

public class RedisTester {

	
	public static void main(String[] args) {
		Jedis jedis=new Jedis();
		jedis.set("1", "harun");
		System.out.println(jedis.get("1"));
		
	}
}
