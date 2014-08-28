package com.bilginc.pattern1.clients;

import com.bilginc.pattern1.Fault;
import com.bilginc.pattern1.FaultMessageGenerator;
import com.bilginc.pattern1.IFaultListener;

public class FaultMailer implements IFaultListener {

	public FaultMailer(FaultMessageGenerator fmg) {
		fmg.register(this);
	}

	@Override
	public void receive(Fault fault, String message) {
		System.out.println("FaultMailer.log: " + fault);
	}

}
