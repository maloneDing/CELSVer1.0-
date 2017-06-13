/**
 * 
 */
package com.ahstu.cels.service;

import java.util.List;

import com.ahstu.cels.entity.BaseTerm;
import com.ahstu.cels.entity.TestRecord;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����11:28:30
 * @version ver1.0
 */
public interface ItestingService {
	/********
	 * 
	 * 
	 * @param items  �û�����Ĳ�������
	 * @return
	 */

	List<BaseTerm> getTestingData(int items);
	/******
	 * 
	 * @return �������10�εĲ��Լ�¼�������е�
	 */
	List<TestRecord> getAllTestRecords();
	/*****
	 * 
	 * @param record Ҫ�־û��Ĳ�������
	 */
	void saveTestRecord(TestRecord record);
	
	

}
