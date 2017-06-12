/**
 * 
 */
package com.ahstu.cels.view.impl;

import com.ahstu.cels.view.IView;

/**
 * @description ���������е���ͼ����
 * @author ahstu ������
 * @createDate ����10:19:48
 * @version ver1.0
 */
public class CommandView implements IView {

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#description()
	 */
	@Override
	public void description() {
		System.out.println("###################################");
		System.out.println("# ����Ŀ�Ǽ����Ӣ��ѧϰ��һ��С�����������java��䣬����IO�����ӿڡ�ѭ��+��֧�ṹ����� ");
		System.out.println("# ����ʹ�ù����У������ʻ��飬����ϵ��***********");
		System.out.println("###################################");
		System.out.println("--------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#showMainMenu()
	 */
	@Override
	public void showMainMenu() {
		System.out.println();
		System.out.println("# 1.   ����ĸ˳�����������");
		System.out.println("# 2.   ����Ϸѧϰ���ʡ���Ӣ�Ļ���");
		System.out.println("# 3.   �����Լ���ˮƽ��������⡿");
		System.out.println("# 0.   exit!");
		System.out.println();
		System.out.println("--------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#subshowBaseMenu()
	 */
	@Override
	public void subshowBaseMenu() {
		System.out.println("----------------");
		System.out.println("-> 1. �������");
		System.out.println("-> 2. ����ʻ�");
		System.out.println("-> 0. ������һ��");
		System.out.println("----------------");	
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#subGameBaseMenu()
	 */
	@Override
	public void subGameBaseMenu() {
		System.out.println("--------------------------------------");
		System.out.println("-> 1. ��ʾӢ�ģ��ش����ġ����һ����ԡ�");
		System.out.println("-> 2. ��ʾ���ģ��ش�Ӣ�ġ���Сд�����С�");
		System.out.println("-> 0. ������һ��");
		System.out.println("--------------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#subTestingMenu()
	 */
	@Override
	public void subTestingMenu() {
		System.out.println("--------------------------------------");
		System.out.println("-> 1. ��ʼ����");
		System.out.println("-> 2. �ҵĲ��Լ�¼��ֻ��ʾ���10�Ρ�");
		System.out.println("-> 0. ������һ��");
		System.out.println("--------------------------------------");
	}

}
