import com.ahstu.cels.controller.IController;
import com.ahstu.cels.controller.impl.SimpleController;
import com.ahstu.cels.controller.impl.SimpleController;

/**
 * 
 */

/**
 * @description ���������
 * @author ahstu ������
 * @createDate ����3:07:42
 * @version ver1.0
 */
public class MainCels {
	// �������
	public static void main(String[] args) {
		// ��������
		IController controller = new SimpleController();
		// ����������
		controller.start();
	}
}
