/**
 * 
 */
package com.ahstu.cels.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.ahstu.cels.dao.IBaseTermDao;
import com.ahstu.cels.dao.impl.BaseTermDaoImpl;
import com.ahstu.cels.entity.PageBean;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;
import com.ahstu.cels.service.IBaseTermService;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����8:53:12
 * @version ver1.0
 */
public class BaseTermServiceImpl implements IBaseTermService {

	// ��daoΪ֧��
	private IBaseTermDao baseTermDao = new BaseTermDaoImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ahstu.cels.service.IBaseTermService#getAllWords()
	 */
	@Override
	public Map<Character, List<Word>> getAllWords() {

		// 1.����һ��map�������������յĽ��
		Map<Character, List<Word>> results = new TreeMap<>();
		// 2.������dao��ȡ��Set<Word>����
		Set<Word> words = baseTermDao.getAllWords();
		// ����һ��List�����������ͬ����ĸ�ĵ��ʵļ���
		List<Word> wordList = null;// �ݲ���ʼ��
		// 3.һ���ж����Word������ĸ�Ƿ������map�У����û�г�����map�У��򴴽�һ���µ�List,����������word������
		// ����ĸ�����List��ӵ�map�С�
		for (Word w : words) {
			// ��ȡ������ʵ�����ĸ
			Character letter = w.getCaptical();
			// �ж�map���Ƿ����������ĸ��Ӧ�ļ�¼
			if (results.containsKey(letter)) {
				// ˵��map���Ѿ��� ������ĸ��¼��ֱ�Ӹ���key ��ȡ��value
				wordList = results.get(letter);
			} else {
				// ˵�������map��û������ĸ��¼���򴴽��µ�List
				wordList = new ArrayList<>();
				// �����������ĸ�뼯�ϵ�ӳ���ϵ��ӵ�map��
				results.put(letter, wordList);
			}
			//�����������ӵ�List��
			wordList.add(w);
		}
		// ����
		return results;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ahstu.cels.service.IBaseTermService#getAllVocabular()
	 */
	@Override
	public PageBean<Vocabular> getAllVocabular() {
		// TODO Auto-generated method stub
		return null;
	}

}
