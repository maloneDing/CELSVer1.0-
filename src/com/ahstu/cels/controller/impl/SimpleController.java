/**
 * 
 */
package com.ahstu.cels.controller.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ahstu.cels.controller.IController;
import com.ahstu.cels.entity.PageBean;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;
import com.ahstu.cels.service.IBaseTermService;
import com.ahstu.cels.service.impl.BaseTermServiceImpl;
import com.ahstu.cels.util.InputUtil;
import com.ahstu.cels.view.IView;
import com.ahstu.cels.view.impl.CommandView;

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����2:52:10
 * @version ver1.0
 */
public class SimpleController implements IController {

	private IView view; // ʹ����ͼ
	private IBaseTermService baseTermService;// ʹ��ҵ���

	/**
	 * Ĭ�Ϲ���������ʼ�� ��ͼʵ��
	 * 
	 * @return
	 */
	public SimpleController() {
		this.view = new CommandView();
		this.baseTermService = new BaseTermServiceImpl();
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
			choice = InputUtil.getInt("��ѡ��>");
			// ����rtnTop������ֵΪfalse
			rtnTop = false;
			// 2. �����û���ѡ����з�֧�ж�
			switch (choice) {
			case 1:
				while (!rtnTop) {
					// 1. �����һ���Ӳ˵���������⡿
					view.subshowBaseMenu();
					// ��һ�����û�ѡ��
					choice = InputUtil.getInt("��ѡ��>");
					// ��һ����֧�Ӳ˵�����
					switch (choice) {
					case 1:
						// �������
						// 1.����ҵ�񷽷���ȡMap����
						Map<Character, List<Word>> results = baseTermService.getAllWords();
						// 2.�������map,����ȡһ���ĸ�ʽ��ʾ��������
						Set<Character> keys = results.keySet();
						for (Character key : keys) {
							// ͨ��key ����ȡvalue
							List<Word> values = results.get(key);
							// ��ӡ��ʾ
							System.out.printf("%s[%d]   ", key, values.size());
							// ������ĸG,N,T��Z ����
							if (key == 'G' || key == 'N' || key == 'T' || key == 'Z')
								System.out.println(); // ����
						}
						// ���û�ѡ��
						char input = InputUtil.getChar("��ѡ����Ҫ�鿴����ĸ>");
						// �����û��������ĸ��Ϊkey������ȡvalue �ļ���
						List<Word> showList = results.get(Character.toUpperCase(input));
						// ��ʾ�������
						int count = 0;
						while (count < showList.size()) {
							Word temp = showList.get(count);

							//

							System.out.printf("-> %d  %s �Ľ����ǣ� %s\n", count + 1, temp.getEn(),
									Arrays.toString(temp.getCn()));
							// ����һ��
							count++;
							// �ж�
							if (count % 15 == 0) { // �ﵽ15����������Ҫ��ͣ
								// ��ʾ�û��Ƿ����
								input = InputUtil.getChar(" -> �Ƿ�鿴��һҳ? n ��N �����жϣ������ַ�����>");
								// ����û�����n,���˳�ѭ��
								if (input == 'n' || input == 'N') {
									//
									break;
								}
							}
							// ���δ�˳�������ʾ�����һ�����ʣ�����ʾ��һ��
							if (count == showList.size()) {
								System.out.println("\n�Ѿ����������... ... ... ...");
							}
						}
						// ����
						System.out.println("\n ... ... ... ... ... ... ... ... ");
						break;
					case 2:
						// ����ʻ�
						// 1. ����ҵ�񷽷���ȡ��ҳ����
						PageBean<Vocabular> pb = baseTermService.getAllVocabular();
						while (true) {
							// 2. ��ʾ��ҳ����ʽ
							System.out.println(pb.getStyle());
							System.out.println("___________________________________");
							// 3. ���û�ѡ����Ҫ�鿴�ĵ�ҳ��
							int page = InputUtil.getInt("��ѡ����Ҫ�鿴��ҳ��>");
							// 4. ����ҳ������ӡ����
							List<Vocabular> data = pb.getDataByPage(page);
							//
							count = 0;
							for (Vocabular v : data) {
								count++;
								System.out.printf("-> %d. %s �Ľ����ǣ� %s\n", count, v.getEn(), Arrays.toString(v.getCn()));
							}
							// �ж��Ƿ�Ҫ����
							if (count % 15 == 0) { // �ﵽ15����������Ҫ��ͣ
								// ��ʾ�û��Ƿ����
								input = InputUtil.getChar(" -> �Ƿ�鿴��һҳ? n ��N �����жϣ������ַ�����>");
								// ����û�����n,���˳�ѭ��
								if (input == 'n' || input == 'N') {
									//
									break;
								}
							}
						}
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
					choice = InputUtil.getInt("��ѡ��>");
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
						// ������һ��
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
					choice = InputUtil.getInt("��ѡ��>");
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
				// �����û��˳�
				exist = true;// �������˳�ѭ��
				break;
			default: {
				System.out.println("��������");
				break;
			}
			}

		} while (!exist);
		//
		System.out.println("\n �������������");
	}// end of method start
}
