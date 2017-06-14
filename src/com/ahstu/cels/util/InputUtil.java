/**
 * 
 */
package com.ahstu.cels.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����3:45:38
 * @version ver1.0
 */
public class InputUtil {
	// ���һ������
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/***********
	 * �����û���ʾ����ȡһ������
	 * 
	 * @param msg
	 *            ��ʾ��Ϣ
	 * @return
	 */
	public synchronized static int getInt(String msg) {
		int result = 0;
		try {

			// �����ʾ��Ϣ
			System.out.print(msg);
			String line = br.readLine();// ���û������뵱�����ַ��������ж�ȡ
			// ���ַ�������������

			if (line != null && line.trim().length() > 0) {
				result = Integer.parseInt(line);
			} else {
				System.out.println(">> �����ȫ�ǿհ��ַ�������������");
				// �����Լ�
				return getInt(msg);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			// �ص��Լ�
			return getInt(msg);
		}

		catch (RuntimeException e) {
			System.out.println("�����Ĳ�������");
			return getInt(msg);
		}
		// ���ض�ȡ������
		return result;
	}
	/**********
	 * �Ӽ��̶�ȡһ���ַ�
	 * @param msg
	 * @return
	 */
	public synchronized static char getChar (String msg) {
		char result =' ';
		try {
			//��ʾ
			System.out.print(msg);
			String line= br.readLine();
			// ȡ����һ����ĸ
			result= line.charAt(0);
			//�ж��Ƿ�Ϊ��ĸ
			if(!Character.isLetter(result)){
				//���µ����Լ�
				System.out.println("���棬����Ĳ�����ĸ");
				return getChar(msg);
			}
			
		} catch (IOException e) {
			System.out.println("error: IO����");
			return getChar(msg);
		
		}
		//����
		return result;
	}
}
