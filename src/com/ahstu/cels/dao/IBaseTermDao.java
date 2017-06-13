/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;
import java.util.Map;

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
	List<Word> getAllWords();
	
	// 2.�����еĴʻ�
	List<Vocabular> getAllvocabular();
	
	// 3.�־û���Ӣ�Ļ���ʻ�
	/****
	 * 
	 * @param data
	 * @param en2cn
	 */
	void persist(Map<String, String> data,boolean en2cn);
	
}
