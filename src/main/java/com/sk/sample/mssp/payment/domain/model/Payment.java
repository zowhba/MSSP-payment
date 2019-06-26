package com.sk.sample.mssp.payment.domain.model;

import java.util.Date;

import javax.persistence.Entity;

import com.sk.sample.mssp.shared.base.AbstractEntity;
import com.sk.sample.mssp.shared.base.AggregateRoot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Payment extends AbstractEntity implements AggregateRoot {
	private CreditCard creditCard;
	private Integer purchasedAmount;
	private Boolean successed;
	private Date purchasedDate;
	private String partyId;
	
	public Payment(CreditCard creditCard, Integer purchasedAmount, String partyId) {
		this.partyId = partyId;
		this.creditCard = creditCard;
		this.purchasedAmount = purchasedAmount;
		this.successed = false;
		this.purchasedDate = new Date();
	}
}
