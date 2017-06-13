/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;
import java.util.Map;

import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description 针对Word和Vocabular的数据访问操作
 * @author ahstu 丁云龙
 * @createDate 上午11:36:08
 * @version ver1.0
 */
public interface IBaseTermDao {
	
	// 1.查所有的单词
	List<Word> getAllWords();
	
	// 2.差所有的词汇
	List<Vocabular> getAllvocabular();
	
	// 3.持久化中英文互答词汇
	/****
	 * 
	 * @param data
	 * @param en2cn
	 */
	void persist(Map<String, String> data,boolean en2cn);
	
}
