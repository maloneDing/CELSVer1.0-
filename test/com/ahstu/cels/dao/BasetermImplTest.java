/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.Set;

import org.junit.Test;

import com.ahstu.cels.dao.impl.BaseTermDaoImpl;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����5:36:36
 * @version ver1.0
 */
public class BasetermImplTest {
	
	private IBaseTermDao dao = new BaseTermDaoImpl();

	@Test
	public void testGetAllWords() {
		//
		Set<Word> words = dao.getAllWords();
		//
		if (words != null) {
			for (Word w : words){
				System.out.println(w);
			}
		}
		System.out.println("���ƣ�"+words.size());
	}
	@Test
	public void testGetAllVocabulars() {
		//
		Set<Vocabular> vs = dao.getAllvocabular();
		//
		if (vs != null) {
			for (Vocabular v: vs){
				System.out.println(v);
			}
		}
		System.out.println("���ƣ�"+vs.size()+"������");
	}
}
