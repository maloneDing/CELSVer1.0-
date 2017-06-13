/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;

import com.ahstu.cels.entity.TestRecord;

/**
 * @description 测试数据记录的数据访问接口
 * @author ahstu 丁云龙
 * @createDate 下午4:51:58
 * @version ver1.0
 */
public interface ITestRecordDao {

	// 1.保存测试记录
	/*********
	 * 以集合的方式存储所有测试记录，每次保存的流程是：
	 *  1. 先把原数据读出 
	 *  2. 加入新测试数据到集合 
	 *  3. 重新把新集合写回文件
	 * @param records
	 */
	void save(List<TestRecord> records);

	// 2.查询出所有的测试记录
	List<TestRecord> query();
	//持久化的
}
