package cn.itcast.fruitstore.app;
import cn.itcast.fruitstore.controller.MainFrameController;

public class MainApp {
	public static void main(String[] args) {		
		new MainFrameController().setVisible(true);
	}

	public void setVisible(boolean b) {
		new MainFrameController().setVisible(true);
	}


}
