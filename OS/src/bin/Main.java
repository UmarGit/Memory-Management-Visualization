package bin;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

	public class Main extends Application{

		public static void main(String[] args) {
			
			launch(args);

		}
	Intro intro;
		@Override
		public void start(Stage win) throws Exception {
			// TODO Auto-generated method stub
			win.initStyle(StageStyle.UNDECORATED);
			win.centerOnScreen();
			intro=new Intro();
			intro.start(win);
			
			
			
		}

	}
