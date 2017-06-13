/**
 * 
 */
package com.ahstu.cels.entity;

import java.util.List;
import java.io.Serializable;
import java.util.Date;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����8:18:49
 * @version ver1.0
 */
public class TestRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1765779256482629424L;
	// ����
	// 1.����ʱ��
	private Date test_date;
	// 2.����ʱ��,����Ϊ��λ
	private long sec;
	// 3.����������
	private int count;
	// 4.�������
	private int finish;
	// 5.��ȷ��
	private int correct;
	// 6.������
	private int error;
	// 7.��������[����BaseTerm�ļ���]
	private List<BaseTerm> datas;
	// 8.��ʶ
	private long id;
	public TestRecord() {
		super();
	}
	public Date getTest_date() {
		return test_date;
	}
	public void setTest_date(Date test_date) {
		this.test_date = test_date;
	}
	public long getSec() {
		return sec;
	}
	public void setSec(long sec) {
		this.sec = sec;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getFinish() {
		return finish;
	}
	public void setFinish(int finish) {
		this.finish = finish;
	}
	public int getCorrect() {
		return correct;
	}
	public void setCorrect(int correct) {
		this.correct = correct;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public List<BaseTerm> getDatas() {
		return datas;
	}
	public void setDatas(List<BaseTerm> datas) {
		this.datas = datas;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestRecord [test_date=").append(test_date).append(", sec=").append(sec).append(", count=")
				.append(count).append(", finish=").append(finish).append(", correct=").append(correct)
				.append(", error=").append(error).append(", id=").append(id).append("]");
		return builder.toString();
	}
	
	
}
