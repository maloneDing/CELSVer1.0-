/**
 * 
 */
package com.ahstu.cels.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @description 此类的描述
 * @author ahstu 丁云龙
 * @createDate 下午5:29:58
 * @version ver1.0
 */
public class BaseTerm implements Serializable,Comparable<BaseTerm> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5564672604734157579L;


	// 填写共性属性
	// 1.英文
	private String en;


	// 2. 中文解释[多个]
	private String[] cn;
	// 添加id
	private Long id; // 标识符

	public BaseTerm(String en, String[] cn) {
		super();
		this.en = en;
		this.cn = cn;
	}

	public BaseTerm() {
		super();
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public String[] getCn() {
		return cn;
	}

	public void setCn(String[] cn) {
		this.cn = cn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseTerm [en=").append(en).append(", cn=").append(Arrays.toString(cn)).append(", id=")
				.append(id).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((en == null) ? 0 : en.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseTerm other = (BaseTerm) obj;
		if (en == null) {
			if (other.en != null)
				return false;
		} else if (!en.equals(other.en))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
		//@Override
	public int compareTo(BaseTerm o) {
			//直接比较英文即可
			return this.en.compareTo(o.en);
		}
}
