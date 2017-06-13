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
 * @description 浏览单词词汇的接口
 * @author ahstu 丁云龙
 * @createDate 上午11:18:02
 * @version ver1.0
 */
public interface IBaseTermService {
	//方法
	// 1.获取所有的单词，一首字母分类
	Map<Character, List<Word>> getAllWords();
	
	PageBean<Vocabular> getAllVocabular();
	
}
