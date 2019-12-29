package com.gn5r.sample;

/**
 * @author gn5r
 *
 * サンプルクラス
*/
public class HelloWorld {

	private String hello;

	/**
	 * インスタンス生成時に適当な文字列を代入する
	 */
	public HelloWorld() {
		this.hello = "Hello World";
	}

	/**
	 * 文字列を設定する
	 * @param text 文字列
	 */
	public HelloWorld(String text) {
		this.hello = text;
	}

	/**
	 * システムコンソールにHello Worldと出るだけの関数
	 */
	public void Hello() {
		System.out.println(hello);
	}
}