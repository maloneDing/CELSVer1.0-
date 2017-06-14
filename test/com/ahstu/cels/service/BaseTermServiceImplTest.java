/**
 * 
 */
package com.ahstu.cels.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.ahstu.cels.entity.Word;
import com.ahstu.cels.service.impl.BaseTermServiceImpl;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����9:41:34
 * @version ver1.0
 */
public class BaseTermServiceImplTest {

	private IBaseTermService service =new BaseTermServiceImpl();
	
	@Test
	public void testGetAllWords(){
		Map<Character, List<Word>> results=service.getAllWords();
		//
		if(null != results){
			Set<Character> keys = results.keySet();
			for(Character key : keys){
				//ͨ��key����ȡvalue
				List<Word>  values = results.get(key);	
				//
				System.out.printf("����ĸΪ �� %s �ĵ����� �� \n",key);
				for(Word w: values){
					System.out.println("\t" + w);
				}
				System.out.println(" С�ƣ� "+values.size() + "��.");
				
			}
			
		}
		
		
	}
}
