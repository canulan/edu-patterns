package com.bilginc.pattern1.clients;

import com.bilginc.pattern1.Fault;
import com.bilginc.pattern1.FaultMessageGenerator;
import com.bilginc.pattern1.IFaultListener;

public class FaultLogger implements IFaultListener {

	public FaultLogger(FaultMessageGenerator fmg) {
		fmg.register(this);
	}

	@Override
	public void receive(Fault fault, String message) {
		System.out.println("FaultLogger.log: " + fault);
	}

}
