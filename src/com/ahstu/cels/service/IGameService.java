/**
 * 
 */
package com.ahstu.cels.service;

import java.util.Map;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����11:20:51
 * @version ver1.0
 */
public interface IGameService {

	//����
	// 1.��ȡ���ĵ�Ӣ�ĵļ���
	/****
	 * 
	 * @param isNew ���Ϊ�棬���ʾ���ϴν����ĵط���ʼ�����򣬴�ͷ��ʼ
	 * @return
	 */
	Map<String, String> cn2en(boolean isNew);
	// 2.��ȡӢ�ĵ����ĵļ���
	/****
	 * 
	 * @param isNew ���Ϊ�棬���ʾ���ϴν����ĵط���ʼ�����򣬴�ͷ��ʼ
	 * @return
	 */
	Map<String, String> en2cn(boolean isNew);
	/****
	 * ����û�лش��ʣ�µ����ݣ���en2cn����Ϊ��ʱ���򱣴浽en2cn�ļ��У�
	 * @param data
	 * @param en2cn
	 */
	void saveNOtAnswer(Map<String, String> data,boolean en2cn);
	
	
}
