/**
 * 
 */
package com.ahstu.cels.service;

import java.util.List;

import com.ahstu.cels.entity.BaseTerm;
import com.ahstu.cels.entity.TestRecord;

/**
 * @description 此类的描述
 * @author ahstu 丁云龙
 * @createDate 上午11:28:30
 * @version ver1.0
 */
public interface ItestingService {
	/********
	 * 
	 * 
	 * @param items  用户输入的测试数据
	 * @return
	 */

	List<BaseTerm> getTestingData(int items);
	/******
	 * 
	 * @return 返回最近10次的测试记录或是所有的
	 */
	List<TestRecord> getAllTestRecords();
	/*****
	 * 
	 * @param record 要持久化的测试数据
	 */
	void saveTestRecord(TestRecord record);
	
	

}
