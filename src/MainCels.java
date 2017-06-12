import com.ahstu.cels.controller.IController;
import com.ahstu.cels.controller.SimpleContrller;

/**
 * 
 */

/**
 * @description 此类的描述
 * @author ahstu 丁云龙
 * @createDate 下午3:07:42
 * @version ver1.0
 */
public class MainCels {
	// 程序入口
	public static void main(String[] args) {
		// 创建对象
		IController controller = new SimpleContrller();
		// 启动发动器
		controller.start();
	}
}
