package com.demo.lifecycle;

public class Bar {
	private String barVal;
	private String anotherbarVal;

	public Bar() {
		System.out.println("ctr of bar is called...");
	}

	public String getBarVal() {
		return barVal;
	}

	public void setBarVal(String barVal) {
		this.barVal = barVal;
	}

	public String getAnotherbarVal() {
		return anotherbarVal;
	}

	public void setAnotherbarVal(String anotherbarVal) {
		this.anotherbarVal = anotherbarVal;
	}

	public void afterBeanCreated() {
		System.out
				.println("public void afterBeanCreated() using xml wala conf");
	}

	public void beforeBeanCouldDestroy() {
		System.out
				.println("public void beforeBeanCouldDestroy()  using xml wala conf");
	}

	public void afterBeanCreatedForBar() {
		System.out
				.println("public void afterBeanCreatedForBar() using xml wala conf");
	}

	public void beforeBeanCouldDestroyForBar() {
		System.out
				.println("public void beforeBeanCouldDestroyForBar()  using xml wala conf");
	}
}
