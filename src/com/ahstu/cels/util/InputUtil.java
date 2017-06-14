/**
 * 
 */
package com.ahstu.cels.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description 此类的描述
 * @author ahstu 丁云龙
 * @createDate 下午3:45:38
 * @version ver1.0
 */
public class InputUtil {
	// 添加一个属性
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/***********
	 * 根据用户提示，获取一个整数
	 * 
	 * @param msg
	 *            提示信息
	 * @return
	 */
	public synchronized static int getInt(String msg) {
		int result = 0;
		try {

			// 输出提示信息
			System.out.print(msg);
			String line = br.readLine();// 把用户的输入当成是字符串，整行读取
			// 把字符串解析成整数

			if (line != null && line.trim().length() > 0) {
				result = Integer.parseInt(line);
			} else {
				System.out.println(">> 输入的全是空白字符、请重新输入");
				// 调用自己
				return getInt(msg);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			// 回调自己
			return getInt(msg);
		}

		catch (RuntimeException e) {
			System.out.println("读到的不是整数");
			return getInt(msg);
		}
		// 返回读取的整数
		return result;
	}
	/**********
	 * 从键盘读取一个字符
	 * @param msg
	 * @return
	 */
	public synchronized static char getChar (String msg) {
		char result =' ';
		try {
			//提示
			System.out.print(msg);
			String line= br.readLine();
			// 取出第一个字母
			result= line.charAt(0);
			//判断是否为字母
			if(!Character.isLetter(result)){
				//重新调用自己
				System.out.println("警告，输入的不是字母");
				return getChar(msg);
			}
			
		} catch (IOException e) {
			System.out.println("error: IO错误");
			return getChar(msg);
		
		}
		//返回
		return result;
	}
}
