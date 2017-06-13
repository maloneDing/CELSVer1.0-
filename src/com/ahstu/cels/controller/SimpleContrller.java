/**
 * 
 */
package com.ahstu.cels.controller;


import com.ahstu.cels.controller.IController;
import com.ahstu.cels.util.InputUtil;
import com.ahstu.cels.view.IView;
import com.ahstu.cels.view.impl.CommandView;

/**
 * @description 此类的描述
 * @author ahstu 丁云龙
 * @createDate 下午2:52:10
 * @version ver1.0
 */
public class SimpleContrller implements IController {

	private IView view; // 使用视图

	/**
	 * 默认构造器，初始化 视图实例
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
		int choice = -1; // 定义用户的选择
		boolean rtnTop = false; // 用来保存是否返回上一级
		boolean exist = false; // 用来保存是否退出的变量
		// 首先显示欢迎界面
		view.description();
		// 利用do while 循环来展现菜单
		do {
			// 1. 显示主菜单
			view.showMainMenu();
			choice=InputUtil.getInt("请选择>");
			//重置rtnTop变量的值为false
			rtnTop=false;
			// 2. 根据用户的选择进行分支判断
			switch (choice) {
			case 1:
				while (!rtnTop) {
					// 1. 进入第一个子菜单【浏览器库】
					view.subGameBaseMenu();
					// 进一步让用户选择
					choice=InputUtil.getInt("请选择>");
					// 进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 浏览单词
						System.out.println("\n *** 敬请期待，此功能开发中【单词】.....******");
						// TODO 待开发列表1 -- 浏览单词列表
						break;
					case 2:
						// 浏览词汇
						System.out.println("\n *** 敬请期待，此功能开发中【词汇】.....******");
						// TODO 待开发列表2 -- 浏览词汇列表
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("输入有误");
						break;
					}
				}
				break;
			case 2:
				while (!rtnTop) {
					// 1. 进入第二个子菜单【浏览器库】
					view.subGameBaseMenu();
					// 进一步让用户选择
					choice=InputUtil.getInt("请选择>");
					// 进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 提示中文回答英文
						System.out.println("\n *** 敬请期待，此功能开发中【单词】.....******");
						// TODO 待开发列表3 -- 浏览单词列表
						break;
					case 2:
						// 提示英文回答中文
						System.out.println("\n *** 敬请期待，此功能开发中【词汇】.....******");
						// TODO 待开发列表4 -- 浏览词汇列表
						break;
					case 0:
						//返回上一级
						rtnTop = true;
						break;
					default:
						System.out.println("输入有误");
						break;
					}
				}
				break;
			case 3:
				while (!rtnTop) {
					// 1. 进入第一个子菜单【浏览器库】
					view.subTestingMenu();
					// 进一步让用户选择
					choice=InputUtil.getInt("请选择>");
					// 进一步分支子菜单处理
					switch (choice) {
					case 1:
						// 开始测试
						System.out.println("\n *** 敬请期待，此功能开发中【单词】.....******");
						// TODO 待开发列表5 -- 浏览单词列表
						break;
					case 2:
						// 浏览词汇
						System.out.println("\n *** 敬请期待，此功能开发中【词汇】.....******");
						// TODO 待开发列表6 -- 浏览词汇列表
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("输入有误");
						break;
					}
				}
				break;
				case 0:
					//代表用户退出
					exist=true;//即可以退出循环
					break;
			default:{
				System.out.println("输入有误");
				break;
			}
			}

		} while (!exist);
		//
		System.out.println("\n 程序结束。。。");
	}//end of method start
}
