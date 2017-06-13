/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;

import org.junit.Test;

import com.ahstu.cels.dao.impl.BaseTermDaoImpl;
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
		List<Word> words = dao.getAllWords();
		//
		if (words != null) {
			for (Word w : words){
				System.out.println(w);
			}
		}
	}
}
