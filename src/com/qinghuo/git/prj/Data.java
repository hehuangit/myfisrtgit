package com.qinghuo.git.prj;
/**
 * 
 * @author hehuan
 *
 */
public class Data {

	private int m;
	private int n;
	
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[m = " + m);
		sb.append(",n = ");
		sb.append(n + "]");
		return sb.toString();
	}
	
	
	
	
}
