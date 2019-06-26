package com.sk.sample.mssp.payment.domain.model;

import javax.persistence.Entity;

import com.sk.sample.mssp.shared.base.AbstractEntity;
import com.sk.sample.mssp.shared.base.AggregateRoot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Credit extends AbstractEntity implements AggregateRoot {
	private CreditCard creditCard;
	private Integer usedAmount;
	private Integer limitAmount;
	
	public Credit(CreditCard creditCard) {
		this.creditCard = creditCard;
		this.usedAmount = 0;
		this.limitAmount = 100000;
	}
	
	public Credit(CreditCard creditCard, Integer limitAmount) {
		this.creditCard = creditCard;
		this.usedAmount = 0;
		this.limitAmount = limitAmount;
	}
}
