package com.bridgelabz;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
@JmsListener(destination="anilqueue")
public void consume(String message) {
	System.out.println("i received "+message);
 }

}
