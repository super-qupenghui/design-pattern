package com.qph.study.builder;

import com.qph.study.product.Message;

public class MailBuilder implements Builder {

	public Message getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void buildHead(String head) {
		System.out.println(head);
	}

	public void buildBody(String body) {
		System.out.println(body);
	}

	public void buildFoot(String foot) {
		System.out.println(foot);
	}

}
