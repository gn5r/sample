package com.gn5r.sample;

public class HelloWorld {

	private String Hello;

	/**
	 * インスタンス生成時にローカル変数に適当な文字列を代入しておく
	 */
	public HelloWorld() {
		this.Hello = "Hello World";
	}

	/**
	 * システムコンソールに<strong>Hello World</strong>と出るだけの関数
	 */
	public void Hello() {
		System.out.println(Hello);
	}
}
