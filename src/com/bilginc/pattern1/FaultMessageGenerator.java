package com.bilginc.pattern1;

import java.util.ArrayList;
import java.util.List;

import com.bilginc.pattern1.clients.FaultLogger;
import com.bilginc.pattern1.clients.FaultMailer;

public class FaultMessageGenerator {

	private final List<IFaultListener> listeners = new ArrayList<IFaultListener>();

	public FaultMessageGenerator() {
	}

	public void register(IFaultListener listener) {
		listeners.add(listener);
	}

	public void faulted(String msg) {
		System.out.println("FMG: Fault received: " + msg);
		Fault fault = new Fault();
		Exception ex = new Exception();
		fault.setMessage(msg);
		fault.setException(ex);
		//
		for (IFaultListener listener : listeners) {
			listener.receive(fault, msg);
		}
	}

}
