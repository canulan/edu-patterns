package com.bilginc.pattern1;

import com.bilginc.pattern1.clients.FaultLogger;
import com.bilginc.pattern1.clients.FaultMailer;

public class FaultManager {

	public static void main(String[] args) {
		FaultMessageGenerator fmg = new FaultMessageGenerator();

		new FaultLogger(fmg);
		new FaultMailer(fmg);

		fmg.faulted("OMG! System crashed!");

	}

}
