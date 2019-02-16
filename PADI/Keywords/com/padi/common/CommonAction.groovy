package com.padi.common

public class CommonAction {
	static customInputValue(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
		print "Input:"
		def input = br.readLine().toString()
		return input
	}
}
