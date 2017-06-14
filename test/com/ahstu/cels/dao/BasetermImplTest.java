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
 * @description 此类的描述
 * @author ahstu 丁云龙
 * @createDate 下午5:36:36
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
		System.out.println("共计："+words.size());
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
		System.out.println("共计："+vs.size()+"个单词");
	}
}
