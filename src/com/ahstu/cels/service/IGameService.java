/**
 * 
 */
package com.ahstu.cels.service;

import java.util.Map;

/**
 * @description 此类的描述
 * @author ahstu 丁云龙
 * @createDate 上午11:20:51
 * @version ver1.0
 */
public interface IGameService {

	//方法
	// 1.获取中文到英文的集合
	/****
	 * 
	 * @param isNew 如果为真，则表示从上次结束的地方开始，否则，从头开始
	 * @return
	 */
	Map<String, String> cn2en(boolean isNew);
	// 2.获取英文到中文的集合
	/****
	 * 
	 * @param isNew 如果为真，则表示从上次结束的地方开始，否则，从头开始
	 * @return
	 */
	Map<String, String> en2cn(boolean isNew);
	/****
	 * 保存没有回答的剩下的数据，当en2cn参数为真时，则保存到en2cn文件中，
	 * @param data
	 * @param en2cn
	 */
	void saveNOtAnswer(Map<String, String> data,boolean en2cn);
	
	
}
