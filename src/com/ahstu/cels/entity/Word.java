/**
 * 
 */
package com.ahstu.cels.entity;

/**
 * @description ������
 * @author ahstu ������
 * @createDate ����5:24:21
 * @version ver1.0
 */
public class Word extends BaseTerm {
	// ����
	// 1. ����ĸ[��д]
	private Character captical;
	// ������Ҫ�������another elements

	public Word(String en, String[] cn) {
		super(en, cn);
		//��ʼ������ĸ
		this.captical=en.toUpperCase().charAt(0);
		
	}

	public Character getCaptical() {
		return captical;
	}

	
	
	
}
