/**
 * 
 */
package com.ahstu.cels.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����9:43:12
 * @version ver1.0
 */
public class PageBean<T> {
	// �ܼ�·��
	private int count;
	// ÿҲҳ������
	private int rows;
	// Ҫ��ҳ����
	private List<T> data;
	private int pages;
	private int first = 1;
	private int last;
	private int previous;
	private int next;
	private int current = 1;
	private String style = "| 1 | 2 | 3 |...|";

	public PageBean(int count, int rows) {
		super();
		this.count = count;
		this.rows = rows;
		// 1.�����������
		this.pages = this.count % this.rows == 0 ? this.count / this.rows : this.count / this.rows + 1;
	}

	public void setCurrent(int current) {
		// ��current ��ֵ
		if (current < 0) {
			this.current = 1;
		} else if (current > this.pages) {
			this.current = this.pages;
		} else {
			this.current = current;
		}
		// �޸�����������ֵ
		this.last = this.pages;
		//
		this.next = this.current == this.last ? this.current : this.current + 1;
		//
		this.previous = this.current == this.first ? this.first : this.current - 1;
		// ����style
		this.style = this.current >= this.pages - 3 ? "| 1 | 2 | 3 |...|" + this.pages + "|"
				: "|" + this.current + "|" + (this.current + 1) + "|" + (this.current + 2) + "|...|" + this.pages + "|";
	}

	public int getCount() {
		return count;
	}

	public int getRows() {
		return rows;
	}

	public List<T> getData() {
		return data;
	}

	public int getPages() {
		return pages;
	}

	public int getFirst() {
		return first;
	}

	public int getLast() {
		return last;
	}

	public int getPrevious() {
		return previous;
	}

	public int getNext() {
		return next;
	}

	public int getCurrent() {
		return current;
	}

	public String getStyle() {
		return style;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	/***************
	 * ����ҳ�뷵��ָ��ҳ��������
	 * @param page
	 * @return
	 */
	public List<T> getDataByPage(int page) {
		int validPage = 1;
		if(page < 0){
		validPage = first;
		} else if (page > pages) {
			validPage = pages;
		} else {
			validPage = page;
		}
		//
		List<T> result = new ArrayList<>();
		// ��ԭʼ������ȡ��ָ��ҳ�������
		for(int i =(validPage-1)*rows; i<validPage*rows && i < count ; i++ ){
			result.add(data.get(i));
		}
		//
		return result;
	}

}
