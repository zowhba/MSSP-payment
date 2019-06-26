package com.sk.sample.mssp.payment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.sk.sample.mssp.payment.domain.model.Credit;
import com.sk.sample.mssp.payment.domain.model.CreditCard;
import com.sk.sample.mssp.payment.domain.repository.CreditRepository;

@SpringBootApplication
@EnableFeignClients
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner execSampleCode(CreditRepository creditRepository) {	
		return (args) -> {
			insertCredits(creditRepository);
			displayCredits(creditRepository);

		};
	}
	
	public void insertCredits(CreditRepository creditRepository) {
		
		Credit account1 = new Credit(new CreditCard("12345678","2020"));
		creditRepository.save(account1);
		
	}
	
	public void displayCredits(CreditRepository creditRepository) {
		System.out.println("***************************************************************");
		
		Iterable<Credit> memberList = creditRepository.findAll();
		for(Credit member : memberList) {
			System.out.println(member.toString());	
		}
		
		System.out.println("***************************************************************");
	}
	
		
}
