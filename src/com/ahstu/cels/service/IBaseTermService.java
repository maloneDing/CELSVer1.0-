/**
 * 
 */
package com.ahstu.cels.service;

import java.util.List;
import java.util.Map;

import com.ahstu.cels.entity.PageBean;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description ������ʴʻ�Ľӿ�
 * @author ahstu ������
 * @createDate ����11:18:02
 * @version ver1.0
 */
public interface IBaseTermService {
	//����
	// 1.��ȡ���еĵ��ʣ�һ����ĸ����
	Map<Character, List<Word>> getAllWords();
	
	PageBean<Vocabular> getAllVocabular();
	
}
