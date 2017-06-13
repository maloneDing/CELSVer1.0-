/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;

import com.ahstu.cels.entity.TestRecord;

/**
 * @description �������ݼ�¼�����ݷ��ʽӿ�
 * @author ahstu ������
 * @createDate ����4:51:58
 * @version ver1.0
 */
public interface ITestRecordDao {

	// 1.������Լ�¼
	/*********
	 * �Լ��ϵķ�ʽ�洢���в��Լ�¼��ÿ�α���������ǣ�
	 *  1. �Ȱ�ԭ���ݶ��� 
	 *  2. �����²������ݵ����� 
	 *  3. ���°��¼���д���ļ�
	 * @param records
	 */
	void save(List<TestRecord> records);

	// 2.��ѯ�����еĲ��Լ�¼
	List<TestRecord> query();
	//�־û���
}
