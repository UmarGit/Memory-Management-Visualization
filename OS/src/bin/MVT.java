package bin;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MVT extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	int resx=1900;
	int resy=1000;
	int rot=40;
	Scene scene;
	boolean con1=true,con2=true,con3=true,con4=true,con5=true;
	int[] check= {50,300,320,15,400};
	final int total=1000;
	int rec;
	@Override
	public void start(Stage win) throws Exception {
		// TODO Auto-generated method stub
		Group gp=new Group();
		HBox hb1=new HBox();
		VBox vb1=new VBox(50);
		
		
		File fileimback11=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\ff1.png");
        Image image11=new Image(fileimback11.toURI().toURL().toString(),resx,resy,false,true);

		File fileimback12=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\ff2.png");
        Image image12=new Image(fileimback12.toURI().toURL().toString(),resx,resy,false,true);

		File fileimback13=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\ww1.png");
        Image image13=new Image(fileimback13.toURI().toURL().toString(),resx,resy,false,true);

		File fileimback14=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\ww2.png");
        Image image14=new Image(fileimback14.toURI().toURL().toString(),resx,resy,false,true);

		File fileimback15=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\bb1.png");
        Image image15=new Image(fileimback15.toURI().toURL().toString(),resx,resy,false,true);

		File fileimback16=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\bb2.png");
        Image image16=new Image(fileimback16.toURI().toURL().toString(),resx,resy,false,true);

		File fileimback17=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\ref1.png");
        Image image17=new Image(fileimback17.toURI().toURL().toString(),resx,resy,false,true);

		File fileimback18=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\ref2.png");
        Image image18=new Image(fileimback18.toURI().toURL().toString(),resx,resy,false,true);

		File fileimback19=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\ret1.png");
        Image image19=new Image(fileimback19.toURI().toURL().toString(),resx,resy,false,true);

		File fileimback20=new File("C:\\Users\\umars\\OneDrive\\Documents\\OS\\src\\media\\ret2.png");
        Image image20=new Image(fileimback20.toURI().toURL().toString(),resx,resy,false,true);

		
		
		vb1.setTranslateY(100);
		
		Rectangle r=new Rectangle(50,50);
		r.setOpacity(0.5);
		r.setTranslateX(540);
		r.setFill(new ImagePattern(image19));
		r.setOnMouseEntered(e ->{
			r.setFill(new ImagePattern(image20));
			r.setStroke(Color.WHITE);
		});
		r.setOnMouseExited(e ->{
			r.setFill(new ImagePattern(image19));
			r.setStroke(Color.TRANSPARENT);
			
		});
        r.setOnMouseClicked(e ->{
        	Intro in=new Intro();
        	
        try {
			in.start(win);
			win.setScene(in.scene2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        });
        
  
        
		Rectangle r1=new Rectangle(50,50);

		r1.setFill(new ImagePattern(image11));
		r1.setOnMouseEntered(e ->{
			r1.setFill(new ImagePattern(image12));
			r1.setStroke(Color.WHITE);
			r1.setRotate(90);
		});
		r1.setOnMouseExited(e ->{
			r1.setFill(new ImagePattern(image11));
			r1.setStroke(Color.TRANSPARENT);
			r1.setRotate(0);
		});
		
		Rectangle r2=new Rectangle(50,50);

		r2.setFill(new ImagePattern(image13));
		r2.setOnMouseEntered(e ->{
			r2.setFill(new ImagePattern(image14));
			r2.setStroke(Color.WHITE);
			r2.setRotate(10+rot);
		});
		r2.setOnMouseExited(e ->{
			r2.setFill(new ImagePattern(image13));
			r2.setStroke(Color.TRANSPARENT);
			r2.setRotate(0);
			rot++;
		});
		
		Rectangle r3=new Rectangle(50,50);

		r3.setFill(new ImagePattern(image15));
		r3.setOnMouseEntered(e ->{
			r3.setFill(new ImagePattern(image16));
			r3.setStroke(Color.WHITE);
			r3.setRotate(90);
		});
		r3.setOnMouseExited(e ->{
			r3.setFill(new ImagePattern(image15));
			r3.setStroke(Color.TRANSPARENT);
			r3.setRotate(0);
		});

		Rectangle r4=new Rectangle(50,50);

		r4.setFill(new ImagePattern(image17));
		r4.setOnMouseEntered(e ->{
			r4.setFill(new ImagePattern(image18));
			r4.setStroke(Color.WHITE);
		});
		r4.setOnMouseExited(e ->{
			r4.setFill(new ImagePattern(image17));
			r4.setStroke(Color.TRANSPARENT);
		});
		r4.setOnMouseClicked(e ->{
			
			MVT mvt=new MVT();
        	try {
				mvt.start(win);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		
		vb1.getChildren().addAll(r4);
		
		
		Text t1=new Text("Multiprogramming With Variable Task");
		t1.setFont(Font.font("Century Gothic",70));
		t1.setTranslateX(300);
		t1.setTranslateY(5);
		t1.setFill(Color.WHITE);
        t1.setOpacity(0.7);
		
        VBox vb2=new VBox();
        VBox vb3=new VBox(10);
        VBox vb4=new VBox();
        VBox vb5=new VBox(10);
        
        Text tm0=new Text("Main Memory");
        Text tm1=new Text(" ");
        Text tm2=new Text(" ");
        Text tm3=new Text(" ");
        Text tm4=new Text(" ");
        Text tm5=new Text(" ");
        Text tm6=new Text("1000K Memory");
        tm0.setFill(Color.WHITE);
        tm1.setFill(Color.WHITE);
        tm2.setFill(Color.WHITE);
        tm3.setFill(Color.WHITE);
        tm4.setFill(Color.WHITE);
        tm5.setFill(Color.WHITE);
        tm6.setFill(Color.WHITE);
        
        tm0.setFont(Font.font("Century Gothic",40));
        tm1.setFont(Font.font("Century Gothic",40));
        tm2.setFont(Font.font("Century Gothic",40));
        tm3.setFont(Font.font("Century Gothic",40));
        tm4.setFont(Font.font("Century Gothic",40));
        tm5.setFont(Font.font("Century Gothic",40));
        tm6.setFont(Font.font("Century Gothic",40));
        tm0.setTranslateX(0);
        tm1.setTranslateX(10);
        tm2.setTranslateX(10);
        tm3.setTranslateX(10);
        tm4.setTranslateX(10);
        tm5.setTranslateX(10);
        tm6.setTranslateX(-10);
        
        tm0.setTranslateY(0);
        tm1.setTranslateY(15);
        tm2.setTranslateY(50);
        tm3.setTranslateY(95);
        tm4.setTranslateY(135);
        tm5.setTranslateY(185);
        tm6.setTranslateY(215);
        
        
        Rectangle m1=new Rectangle(300,100);
        Rectangle m2=new Rectangle(300,100);
        Rectangle m3=new Rectangle(300,100);
        Rectangle m4=new Rectangle(300,100);
        Rectangle m5=new Rectangle(300,100);
        Rectangle m6=new Rectangle(300,503);
        m6.setStrokeWidth(3);
        m6.setTranslateY(-505);
        m1.setFill(Color.TRANSPARENT);
        m2.setFill(Color.TRANSPARENT);
        m3.setFill(Color.TRANSPARENT);
        m4.setFill(Color.TRANSPARENT);
        m5.setFill(Color.TRANSPARENT);
        m6.setFill(Color.TRANSPARENT);
        
        m1.setOpacity(0);
        m2.setOpacity(0);
        m3.setOpacity(0);
        m4.setOpacity(0);
        m5.setOpacity(0);
        
        
        m1.setStroke(Color.WHITE);
        m2.setStroke(Color.WHITE);
        m3.setStroke(Color.WHITE);
        m4.setStroke(Color.WHITE);
        m5.setStroke(Color.WHITE);
        m6.setStroke(Color.WHITE);
        
        Rectangle p1=new Rectangle(200,100);
        Rectangle p2=new Rectangle(200,100);
        Rectangle p3=new Rectangle(200,100);
        Rectangle p4=new Rectangle(200,100);
        Rectangle p5=new Rectangle(200,100);
        p1.setFill(Color.TRANSPARENT);
        p2.setFill(Color.TRANSPARENT);
        p3.setFill(Color.TRANSPARENT);
        p4.setFill(Color.TRANSPARENT);
        p5.setFill(Color.TRANSPARENT);
        
        p1.setStroke(Color.WHITE);
        p2.setStroke(Color.WHITE);
        p3.setStroke(Color.WHITE);
        p4.setStroke(Color.WHITE);
        p5.setStroke(Color.WHITE);
        
        
        Text tm01=new Text("  Proccesses");
        Text tm11=new Text("P1-50K");
        Text tm21=new Text("P2-300K");
        Text tm31=new Text("P3-320K");
        Text tm41=new Text("P4-15K");
        Text tm51=new Text("P5-400K");
        Text tm61=new Text(" ");
        tm01.setFill(Color.WHITE);
        tm11.setFill(Color.RED);
        tm21.setFill(Color.YELLOW);
        tm31.setFill(Color.ORANGE);
        tm41.setFill(Color.BLUE);
        tm51.setFill(Color.GREEN);
        tm61.setFill(Color.WHITE);
        
        tm01.setFont(Font.font("Century Gothic",40));
        tm11.setFont(Font.font("Century Gothic",40));
        tm21.setFont(Font.font("Century Gothic",40));
        tm31.setFont(Font.font("Century Gothic",40));
        tm41.setFont(Font.font("Century Gothic",40));
        tm51.setFont(Font.font("Century Gothic",40));
        tm61.setFont(Font.font("Century Gothic",40));
        tm01.setTranslateX(20);
        tm11.setTranslateX(80);
        tm21.setTranslateX(80);
        tm31.setTranslateX(80);
        tm41.setTranslateX(80);
        tm51.setTranslateX(80);
        tm61.setTranslateX(20);
        
        tm01.setTranslateY(0);
        tm11.setTranslateY(15);
        tm21.setTranslateY(50);
        tm31.setTranslateY(95);
        tm41.setTranslateY(135);
        tm51.setTranslateY(185);
        tm61.setTranslateY(215);
        
        
        
        
        vb2.setTranslateY(200);
        vb2.getChildren().addAll(m1,m2,m3,m4,m5,m6);
        vb3.setTranslateY(150);
        vb3.setTranslateX(-280);
        vb3.getChildren().addAll(tm0,tm1,tm2,tm3,tm4,tm5,tm6);
        vb4.setTranslateY(200);
        vb4.setTranslateX(-1500);
        vb4.getChildren().addAll(p1,p2,p3,p4,p5);
        vb5.setTranslateY(150);
        vb5.setTranslateX(-1750);
        vb5.getChildren().addAll(tm01,tm11,tm21,tm31,tm41,tm51,tm61);
        
        Text ttt=new Text("External Fragmentation = 0   ");
        ttt.setFont(Font.font("Century Gothic",50));
		ttt.setTranslateX(-1850);
		ttt.setTranslateY(800);
		ttt.setFill(Color.WHITE);
        ttt.setOpacity(0.7);
        
        tm11.setOnMouseClicked(e ->{
        if(rec>=total) {
        	ttt.setText("External Fragmentation Occurs :"+rec);
        }
        else {
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	if(con1==true) {
        	rec+=check[0];
        	tm11.setOpacity(0.5);
        	System.out.println(rec);
        	
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	
        	if(tm1.getText()==" ") {
        	tm1.setText(tm11.getText());
        	m1.setOpacity(1);}
        	else {
        		if(tm2.getText()==" ") {
                	tm2.setText(tm11.getText());
                	m2.setOpacity(1);}
                	else {
                		if(tm3.getText()==" ") {
                        	tm3.setText(tm11.getText());
                        	m3.setOpacity(1);}
                        	else {
                        		if(tm4.getText()==" ") {
                                	tm4.setText(tm11.getText());
                                	m4.setOpacity(1);}
                                	else {
                                		if(tm5.getText()==" ") {
                                        	tm5.setText(tm11.getText());
                                        	m5.setOpacity(1);}
                                        		
                                	}	
                        	}
                	}
        	}
        		
        		
        	con1=false;
        	}}
        	else {
        		ttt.setText("Process 1 is Allocated Successfully\n           Add another process");
        	}
        		
        }}
        });
        
        tm21.setOnMouseClicked(e ->{
        if(rec>=total) {
        	ttt.setText("External Fragmentation Occurs :"+rec);
        }
        else {
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	if(con2==true) {
        	rec+=check[1];
        	tm21.setOpacity(0.5);
        	
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	if(tm1.getText()==" ") {
        	tm1.setText(tm21.getText());
        	m1.setOpacity(1);}
        	else {
        		if(tm2.getText()==" ") {
                	tm2.setText(tm21.getText());
                	m2.setOpacity(1);}
                	else {
                		if(tm3.getText()==" ") {
                        	tm3.setText(tm21.getText());
                        	m3.setOpacity(1);}
                        	else {
                        		if(tm4.getText()==" ") {
                                	tm4.setText(tm21.getText());
                                	m4.setOpacity(1);}
                                	else {
                                		if(tm5.getText()==" ") {
                                        	tm5.setText(tm21.getText());
                                        	m5.setOpacity(1);}
                                        		
                                	}	
                        	}
                	}
        	}
        		
        		
        	con2=false;
            }}
        	else {
        		ttt.setText("Process 2 is Allocated Successfully\n           Add another process");
        	}
        		
        }}
        });
        tm31.setOnMouseClicked(e ->{
        if(rec>=total) {
        	ttt.setText("External Fragmentation Occurs :"+rec);
        }
        else {
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	if(con3==true) {
        	rec+=check[2];
        	tm31.setOpacity(0.5);
        	
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	if(tm1.getText()==" ") {
        	tm1.setText(tm31.getText());
        	m1.setOpacity(1);}
        	else {
        		if(tm2.getText()==" ") {
                	tm2.setText(tm31.getText());
                	m2.setOpacity(1);}
                	else {
                		if(tm3.getText()==" ") {
                        	tm3.setText(tm31.getText());
                        	m3.setOpacity(1);}
                        	else {
                        		if(tm4.getText()==" ") {
                                	tm4.setText(tm31.getText());
                                	m4.setOpacity(1);}
                                	else {
                                		if(tm5.getText()==" ") {
                                        	tm5.setText(tm31.getText());
                                        	m5.setOpacity(1);}
                                        		
                                	}	
                        	}
                	}
        	}
        		
        		
        	con3=false;
            }}
        	else {
        		ttt.setText("Process 3 is Allocated Successfully\n           Add another process");
        	}
        		
        }}
        });
        tm41.setOnMouseClicked(e ->{
        if(rec>=total) {
        	ttt.setText("External Fragmentation Occurs :"+rec);
        }
        else {
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	if(con4==true) {
        	rec+=check[3];
        	tm41.setOpacity(0.5);
        	
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	if(tm1.getText()==" ") {
        	tm1.setText(tm41.getText());
        	m1.setOpacity(1);}
        	else {
        		if(tm2.getText()==" ") {
                	tm2.setText(tm41.getText());
                	m2.setOpacity(1);}
                	else {
                		if(tm3.getText()==" ") {
                        	tm3.setText(tm41.getText());
                        	m3.setOpacity(1);}
                        	else {
                        		if(tm4.getText()==" ") {
                                	tm4.setText(tm41.getText());
                                	m4.setOpacity(1);}
                                	else {
                                		if(tm5.getText()==" ") {
                                        	tm5.setText(tm41.getText());
                                        	m5.setOpacity(1);}
                                        		
                                	}	
                        	}
                	}
        	}
        		
        		
        	con4=false;
            }}
        	else {
        		ttt.setText("Process 4 is Allocated Successfully\n           Add another process");
        	}
        		
        }}
        });
        tm51.setOnMouseClicked(e ->{
        if(rec>=total) {
        	ttt.setText("External Fragmentation Occurs :"+rec);
        }
        else {
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	if(con5==true) {
        	rec+=check[4];
        	tm51.setOpacity(0.5);
        	
        	if(rec>=total) {
            	ttt.setText("External Fragmentation Occurs :"+rec);
            }else {
        	
        	if(tm1.getText()==" ") {
        	tm1.setText(tm51.getText());
        	m1.setOpacity(1);}
        	else {
        		if(tm2.getText()==" ") {
                	tm2.setText(tm51.getText());
                	m2.setOpacity(1);}
                	else {
                		if(tm3.getText()==" ") {
                        	tm3.setText(tm51.getText());
                        	m3.setOpacity(1);}
                        	else {
                        		if(tm4.getText()==" ") {
                                	tm4.setText(tm51.getText());
                                	m4.setOpacity(1);}
                                	else {
                                		if(tm5.getText()==" ") {
                                        	tm5.setText(tm51.getText());
                                        	m5.setOpacity(1);}
                                        		
                                	}	
                        	}
                	}
        	}
        		
        		
        	con5=false;
            }}
        	else {
        		ttt.setText("Process 5 is Allocated Successfully\n           Add another process");
        	}
        		
        }}
        });

        
        
		hb1.getChildren().addAll(vb1,t1,r,vb2,vb3,vb4,vb5,ttt);
		
		
		
		gp.getChildren().addAll(hb1);
		
		scene=new Scene(gp,resx,resy);
		
		Group gp2=new Group();
		
		Text t2=new Text("Enter Processes");
		
		
		Scene scene2=new Scene(gp2,300,600);
		
		
		
		win.setScene(scene);
		scene.setFill(Color.ROYALBLUE);
		win.show();
		
	}

	
}
