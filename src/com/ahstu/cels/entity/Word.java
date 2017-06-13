/**
 * 
 */
package com.ahstu.cels.entity;

/**
 * @description 单词类
 * @author ahstu 丁云龙
 * @createDate 下午5:24:21
 * @version ver1.0
 */
public class Word extends BaseTerm {
	// 属性
	// 1. 首字母[大写]
	private Character captical;
	// 如有需要，再添加another elements

	public Word(String en, String[] cn) {
		super(en, cn);
		//初始化首字母
		this.captical=en.toUpperCase().charAt(0);
		
	}

	public Character getCaptical() {
		return captical;
	}

	
	
	
}
