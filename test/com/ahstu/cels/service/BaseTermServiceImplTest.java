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
 * @description 此类的描述
 * @author ahstu 丁云龙
 * @createDate 上午9:41:34
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
				//通过key来获取value
				List<Word>  values = results.get(key);	
				//
				System.out.printf("首字母为 ： %s 的单词有 ： \n",key);
				for(Word w: values){
					System.out.println("\t" + w);
				}
				System.out.println(" 小计： "+values.size() + "个.");
				
			}
			
		}
		
		
	}
}
