package bin;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.ObservableArray;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Intro extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}
	int resx=1900;
	int resy=1000;
Stage win;
Scene scene2;
	@Override
	public void start(Stage wins) throws Exception {
		win=wins;
		Rectangle r1=new Rectangle(resx,resy);
		Rectangle r2=new Rectangle(resx,resy);
		Rectangle r3=new Rectangle(resx,resy);
		Rectangle r4=new Rectangle(resx,resy);
		
		DropShadow dps=new DropShadow();
		dps.setRadius(50);
		DropShadow dps2=new DropShadow();
		dps2.setRadius(10);
		dps2.setSpread(0.5);
		
		Circle c=new Circle(20);
		c.setTranslateX(resx/2);
		c.setTranslateY(resy/2+20);
		c.setFill(Color.BROWN);
		c.setOpacity(0);
		Duration dur=new Duration(20*1000);
		
		ScaleTransition scale=new ScaleTransition(dur,c);
		scale.setByX(70);
		scale.setByY(70);
		scale.setRate(10);
		scale.setToX(70);
		scale.setToY(70);
		
		
		Text load=new Text("Memory Management Unit\n              Loading....");
		load.setFont(Font.font("Century Gothic",70));
		load.setTranslateX(resx/2-440);
		load.setTranslateY(resy/2);
		load.setFill(Color.WHITE);
        load.setOpacity(0.7);
		
		Rectangle start=new Rectangle(160,40);
        start.setTranslateX(resx/2-50);
		start.setTranslateY(resy/2+200);
		start.setScaleX(2);
		start.setScaleY(2);
		start.setFill(Color.TRANSPARENT);
		start.setStroke(Color.WHITE);
		start.setStrokeWidth(2);
		start.setArcHeight(40);
		start.setArcWidth(40);
		start.setOpacity(0);
	
        
		Text count=new Text("Get Started");
		count.setFont(Font.font("Century Gothic",50));
		count.setTranslateX(resx/2-110);
		count.setTranslateY(resy/2+240);
		count.setFill(Color.WHITE);
		count.setOpacity(0);
		
		r1.setFill(Color.YELLOW);
		r1.setEffect(dps);
		r2.setFill(Color.BLUE);
		r2.setEffect(dps);
		r3.setFill(Color.GREEN);
		r3.setEffect(dps);
		r4.setFill(Color.RED);
		r4.setEffect(dps);
		
		Timeline timeline=new Timeline();
		Timeline timeline2=new Timeline();
		Timeline timeline3=new Timeline();
		Timeline timeline4=new Timeline();
		
		r1.setTranslateX(-resx+100);
		r2.setTranslateY(-resy+100);
		r3.setTranslateX(resx-100);
		r4.setTranslateY(resy-100);
		
		int  speed=1;
		timeline.currentTimeProperty().addListener(new InvalidationListener() {
	
			@Override
			public void invalidated(Observable ov) {
				// TODO Auto-generated method stub
				int time = (int) timeline.getCurrentTime().toSeconds();

			}
		});
	
		KeyValue keyvalue=new KeyValue(r1.translateXProperty(),0);
		KeyFrame keyframe=new KeyFrame(Duration.seconds(speed), keyvalue);
		timeline.getKeyFrames().add(keyframe);
		timeline.setAutoReverse(true);
		timeline.setCycleCount(4);
		timeline.play();
		
		timeline2.currentTimeProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable ov2) {
				// TODO Auto-generated method stub
				int time = (int) timeline2.getCurrentTime().toSeconds();
	
			}
		});
	
		KeyValue keyvalue2=new KeyValue(r2.translateYProperty(),0);
		KeyFrame keyframe2=new KeyFrame(Duration.seconds(speed+1), keyvalue2);
		timeline2.getKeyFrames().add(keyframe2);
		timeline2.setAutoReverse(true);
		timeline2.setCycleCount(4);
		timeline2.play();
		
		
		timeline3.currentTimeProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable ov3) {
				// TODO Auto-generated method stub
				int time = (int) timeline3.getCurrentTime().toSeconds();

			}
		});
	
		KeyValue keyvalue3=new KeyValue(r3.translateXProperty(),-0);
		KeyFrame keyframe3=new KeyFrame(Duration.seconds(speed+2), keyvalue3);
		timeline3.getKeyFrames().add(keyframe3);
		timeline3.setAutoReverse(true);
		timeline3.setCycleCount(4);
		timeline3.play();
		
		
		timeline4.currentTimeProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable ov4) {
				// TODO Auto-generated method stub
				int time = (int) timeline4.getCurrentTime().toSeconds();

			}
		});
	
		KeyValue keyvalue4=new KeyValue(r4.translateYProperty(),-0);
		KeyFrame keyframe4=new KeyFrame(Duration.seconds(speed+3), keyvalue4);
		timeline4.getKeyFrames().add(keyframe4);
		timeline4.setAutoReverse(true);
		timeline4.setCycleCount(4);
		timeline4.play();
		
		timeline.setOnFinished(e ->{
			load.setText("Loading Resources in RAM");
		});
		timeline2.setOnFinished(e ->{
			load.setText("Loading RAM and initializing");
		});
		timeline3.setOnFinished(e ->{
			load.setText("Are you ready for best MMU\n             experience");
		});
		timeline4.setOnFinished(e ->{
			start.setOpacity(0.5);
			count.setOpacity(0.5);
			load.setText("  Get ready to experience !!");
			start.setOnMouseEntered(a ->{
				start.setStroke(Color.DEEPSKYBLUE);
				count.setFill(Color.DEEPSKYBLUE);
				start.setOpacity(1);
				count.setOpacity(1);
			});
			start.setOnMouseExited(a ->{
				start.setStroke(Color.WHITE);
				count.setFill(Color.WHITE);
				start.setOpacity(0.5);
				count.setOpacity(0.5);
			});
			start.setEffect(dps2);
		});
		start.setOnMouseClicked(e ->{
			c.setOpacity(1);
			scale.play();
		});
		count.setOnMouseClicked(e ->{
			c.setOpacity(1);
			scale.play();
		});
		
		
		
		Group gp=new Group();
		Group gp2=new Group();
		
		gp.getChildren().addAll(r1,r2,r3,r4,load,count,start,c);
		
		Scene scene=new Scene(gp,resx,resy);	
		scene.setFill(Color.INDIGO);
		
		
		HBox hb=new HBox(200);
		Rectangle rr1=new Rectangle(300,400);
		Rectangle rr2=new Rectangle(300,400);
		rr1.setFill(Color.TRANSPARENT);
		rr1.setStroke(Color.WHITE);
		rr1.setStrokeWidth(7);
		rr1.setArcHeight(40);
		rr1.setArcWidth(40);
		
		rr2.setFill(Color.TRANSPARENT);
		rr2.setStroke(Color.WHITE);
		rr2.setStrokeWidth(7);
		rr2.setArcHeight(40);
		rr2.setArcWidth(40);
		
		Text tt1=new Text("MFT");
		tt1.setFont(Font.font("Century Gothic",70));
		tt1.setTranslateX(-920);
		tt1.setTranslateY(150);
		tt1.setFill(Color.WHITE);
        tt1.setOpacity(0.7);
		Text tt2=new Text("MVT");
		tt2.setFont(Font.font("Century Gothic",70));
		tt2.setTranslateX(-760);
		tt2.setTranslateY(150);
		tt2.setFill(Color.WHITE);
        tt2.setOpacity(0.7);
        
        
        
        rr1.setOnMouseEntered(e ->{
        	rr1.setStroke(Color.DEEPPINK);
        	tt1.setFill(Color.DEEPPINK);
        	rr1.setEffect(dps2);
        	tt1.setEffect(dps2);
        });
        rr1.setOnMouseExited(e ->{
        	rr1.setStroke(Color.WHITE);
        	tt1.setFill(Color.WHITE);
        	rr1.setEffect(null);
        	tt1.setEffect(null);
        });
        rr2.setOnMouseEntered(e ->{
        	rr2.setStroke(Color.DEEPPINK);
        	tt2.setFill(Color.DEEPPINK);
        	rr2.setEffect(dps2);
        	tt2.setEffect(dps2);
        });
        rr2.setOnMouseExited(e ->{
        	rr2.setStroke(Color.WHITE);
        	tt2.setFill(Color.WHITE);
        	rr2.setEffect(null);
        	tt2.setEffect(null);
        });
        tt1.setOnMouseEntered(e ->{
        	rr1.setStroke(Color.DEEPPINK);
        	tt1.setFill(Color.DEEPPINK);
        	rr1.setEffect(dps2);
        	tt1.setEffect(dps2);
        });
        tt1.setOnMouseExited(e ->{
        	rr1.setStroke(Color.WHITE);
        	tt1.setFill(Color.WHITE);
        	rr1.setEffect(null);
        	tt1.setEffect(null);
        });
        tt2.setOnMouseEntered(e ->{
        	rr2.setStroke(Color.DEEPPINK);
        	tt2.setFill(Color.DEEPPINK);
        	rr2.setEffect(dps2);
        	tt2.setEffect(dps2);
        });
        tt2.setOnMouseExited(e ->{
        	rr2.setStroke(Color.WHITE);
        	tt2.setFill(Color.WHITE);
        	rr2.setEffect(null);
        	tt2.setEffect(null);
        });
        
        rr1.setOnMouseClicked(e ->{
        	MFT mft=new MFT();
        	try {
				mft.start(win);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });
        tt1.setOnMouseClicked(e ->{
        	MFT mft=new MFT();
        	try {
				mft.start(win);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });
        rr2.setOnMouseClicked(e ->{
        	MVT mvt=new MVT();
        	try {
				mvt.start(win);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });
        tt2.setOnMouseClicked(e ->{
        	MVT mvt=new MVT();
        	try {
				mvt.start(win);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });
        
		
        rr2.setEffect(dps2);
        tt2.setEffect(dps2);
        
		hb.getChildren().addAll(rr1,rr2,tt1,tt2);
		hb.setTranslateX(resx/2-400);
		hb.setTranslateY(resy/2-200);
		gp2.getChildren().addAll(hb);
		scene2=new Scene(gp2, resx, resy);
		scene2.setFill(Color.INDIGO);
		
		scale.setOnFinished(e ->{
			gp2.getChildren().addAll(r1,r2,r3,r4);
			win.setScene(scene2);
		});
		
		win.setScene(scene);
		win.show();
		
	}

}
