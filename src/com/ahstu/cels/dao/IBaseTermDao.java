/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.Map;
import java.util.Set;

import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description ���Word��Vocabular�����ݷ��ʲ���
 * @author ahstu ������
 * @createDate ����11:36:08
 * @version ver1.0
 */
public interface IBaseTermDao {
	
	// 1.�����еĵ���
	Set<Word> getAllWords();
	
	// 2.�����еĴʻ�
	Set<Vocabular> getAllvocabular();
	
	// 3.�־û���Ӣ�Ļ���ʻ�
	/****
	 * 
	 * @param data
	 * @param en2cn
	 */
	void persist(Map<String, String> data,boolean en2cn);
	
}
