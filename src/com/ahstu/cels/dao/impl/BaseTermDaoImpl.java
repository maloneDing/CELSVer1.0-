/**
 * 
 */
package com.ahstu.cels.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.ahstu.cels.dao.IBaseTermDao;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description 此类的描述
 * @author ahstu 丁云龙
 * @createDate 下午5:00:52
 * @version ver1.0
 */
public class BaseTermDaoImpl implements IBaseTermDao {

	/** 存放了所有的单词的数据文件 **/
	private static final String WORD_FILE = "datas/dic/w.dic";
	/** 存放了所有的词汇的数据文件 **/
	private static final String VOCABULAR_FILE = "datas/dic/v.dic";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ahstu.cels.dao.IBaseTermDao#getAllWords()
	 */
	@Override
	public Set<Word> getAllWords() {
		// 1. 创建file 对象
		File file = new File(WORD_FILE);
		// 2. 判断文件是否存在
		if (!file.exists() && file.isFile()) {
			System.out.println("单词数据文件不存在，请保证此文件存在。。。");
			throw new RuntimeException("单词数据文件不存在。。。");
		}
		// 创建一个集合来保存所有的单词
		Set<Word> words = new HashSet<>();
		// 3. 如果文件存在，则读取,转换成IO流
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			// 读取
			String line = null;// 用来保存每次读取的行
			Word w = null;// 存放Word对象，【变量的定义最好放在循环外面】
			// 4. 循环读取，并把读到的数据转换成WORD 对象
			while ((line = br.readLine()) != null) {
				// 处理读到的line[行数据]，把它转换成Word对象
				String[] temp = line.split("\\s+");
				String en = temp[0]; // 第一行是英文
				String cn = temp[1];// 第二行元素是中文
				// 创建一个Word
				w = new Word(en, cn.split(":+"));
				// 5. 把这个Word添加到集合中
				words.add(w);
			}

		} catch (IOException e) {
			// 打印异常堆栈
			e.printStackTrace();
		}

		// 6. 返回
		return words;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ahstu.cels.dao.IBaseTermDao#getAllvocabular()
	 */
	@Override
	public Set<Vocabular> getAllvocabular() {

		// 1. 创建file 对象
		File file = new File(VOCABULAR_FILE);
		// 2. 判断文件是否存在
		if (!file.exists() && file.isFile()) {
			System.out.println("词汇数据文件不存在，请保证此文件存在。。。");
			throw new RuntimeException("词汇数据文件不存在。。。");
		}
		// 创建一个集合来保存所有的单词
		Set<Vocabular> words = new HashSet<>();
		// 3. 如果文件存在，则读取,转换成IO流
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			// 读取
			String line = null;// 用来保存每次读取的行
			Vocabular v = null;// 存放Word对象，【变量的定义最好放在循环外面】
			// 4. 循环读取，并把读到的数据转换成WORD 对象
			while ((line = br.readLine()) != null) {
				// 处理读到的line[行数据]，把它转换成Word对象
				String[] temp = line.split("#+");
				String en = temp[0]; // 第一行是英文
				String cn = temp[1];// 第二行元素是中文
				String abbr=null;//第三行是缩写
				if(temp.length>2){ // 说明此行有缩写
					abbr=temp[2];
				}
				// 创建一个Word
				v = new Vocabular(en, cn.split(":+"),abbr);
				// 5. 把这个Word添加到集合中
				words.add(v);
			}

		} catch (IOException e) {
			// 打印异常堆栈
			e.printStackTrace();
		}
		// 6. 返回
		return words;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ahstu.cels.dao.IBaseTermDao#persist(java.util.Map, boolean)
	 */
	@Override
	public void persist(Map<String, String> data, boolean en2cn) {
	}

}
