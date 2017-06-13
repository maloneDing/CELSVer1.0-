/**
 * 
 */
package com.ahstu.cels.controller;


import com.ahstu.cels.controller.IController;
import com.ahstu.cels.util.InputUtil;
import com.ahstu.cels.view.IView;
import com.ahstu.cels.view.impl.CommandView;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����2:52:10
 * @version ver1.0
 */
public class SimpleContrller implements IController {

	private IView view; // ʹ����ͼ

	/**
	 * Ĭ�Ϲ���������ʼ�� ��ͼʵ��
	 */
	public SimpleContrller() {
		this.view = new CommandView();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ahstu.cels.controller.IController#start()
	 */
	@Override
	public void start() {
		int choice = -1; // �����û���ѡ��
		boolean rtnTop = false; // ���������Ƿ񷵻���һ��
		boolean exist = false; // ���������Ƿ��˳��ı���
		// ������ʾ��ӭ����
		view.description();
		// ����do while ѭ����չ�ֲ˵�
		do {
			// 1. ��ʾ���˵�
			view.showMainMenu();
			choice=InputUtil.getInt("��ѡ��>");
			//����rtnTop������ֵΪfalse
			rtnTop=false;
			// 2. �����û���ѡ����з�֧�ж�
			switch (choice) {
			case 1:
				while (!rtnTop) {
					// 1. �����һ���Ӳ˵���������⡿
					view.subGameBaseMenu();
					// ��һ�����û�ѡ��
					choice=InputUtil.getInt("��ѡ��>");
					// ��һ����֧�Ӳ˵�����
					switch (choice) {
					case 1:
						// �������
						System.out.println("\n *** �����ڴ����˹��ܿ����С����ʡ�.....******");
						// TODO �������б�1 -- ��������б�
						break;
					case 2:
						// ����ʻ�
						System.out.println("\n *** �����ڴ����˹��ܿ����С��ʻ㡿.....******");
						// TODO �������б�2 -- ����ʻ��б�
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("��������");
						break;
					}
				}
				break;
			case 2:
				while (!rtnTop) {
					// 1. ����ڶ����Ӳ˵���������⡿
					view.subGameBaseMenu();
					// ��һ�����û�ѡ��
					choice=InputUtil.getInt("��ѡ��>");
					// ��һ����֧�Ӳ˵�����
					switch (choice) {
					case 1:
						// ��ʾ���Ļش�Ӣ��
						System.out.println("\n *** �����ڴ����˹��ܿ����С����ʡ�.....******");
						// TODO �������б�3 -- ��������б�
						break;
					case 2:
						// ��ʾӢ�Ļش�����
						System.out.println("\n *** �����ڴ����˹��ܿ����С��ʻ㡿.....******");
						// TODO �������б�4 -- ����ʻ��б�
						break;
					case 0:
						//������һ��
						rtnTop = true;
						break;
					default:
						System.out.println("��������");
						break;
					}
				}
				break;
			case 3:
				while (!rtnTop) {
					// 1. �����һ���Ӳ˵���������⡿
					view.subTestingMenu();
					// ��һ�����û�ѡ��
					choice=InputUtil.getInt("��ѡ��>");
					// ��һ����֧�Ӳ˵�����
					switch (choice) {
					case 1:
						// ��ʼ����
						System.out.println("\n *** �����ڴ����˹��ܿ����С����ʡ�.....******");
						// TODO �������б�5 -- ��������б�
						break;
					case 2:
						// ����ʻ�
						System.out.println("\n *** �����ڴ����˹��ܿ����С��ʻ㡿.....******");
						// TODO �������б�6 -- ����ʻ��б�
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("��������");
						break;
					}
				}
				break;
				case 0:
					//�����û��˳�
					exist=true;//�������˳�ѭ��
					break;
			default:{
				System.out.println("��������");
				break;
			}
			}

		} while (!exist);
		//
		System.out.println("\n �������������");
	}//end of method start
}
