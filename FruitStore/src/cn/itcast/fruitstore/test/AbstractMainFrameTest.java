package cn.itcast.fruitstore.test;
import cn.itcast.fruitstore.view.AbstractMainFrame;

@SuppressWarnings("serial")
public class AbstractMainFrameTest extends AbstractMainFrame {

	public static void main(String[] args) {
		new AbstractMainFrameTest().setVisible(true);
	}
	
	@Override
	public void showAdminDialog() {
		System.out.println("进入管理界面");
	} 
}
