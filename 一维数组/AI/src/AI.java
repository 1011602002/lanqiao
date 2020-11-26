import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;

public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}

class MainCanvas extends Canvas
{
    
	Image leftimg[]=new Image[3];
    Image upimg[]=new Image[3];
	Image downimg[]=new Image[3];
	Image rightimg[]=new Image[3];
	Image currentImg,downimg1,downimg2,upimg1,upimg2,leftimg1,leftimg2,rightimg1,rightimg2;
    int x=120,y=100,a=1;
   
	public MainCanvas(){
		try{
			for(int i=0;i<leftimg.length;i++){
            downimg[i]=Image.createImage("/sayo"+i+"0.png");
			}
			for(int i=0;i<upimg.length;i++){
			upimg[i]=Image.createImage("/sayo"+i+"4.png")
			}
			for(int i=0;i<leftimg.length;i++){
			leftimg=Image.createImage("/sayo"+i+"2.png")
			}
			for(int i=0;i<rightimg.length;i++){
			rightimg=createImage("/sayo"+i+"6.png")
			}
/*
            downimg=Image.createImage("/sayo10.png");
	        downimg1=Image.createImage("/sayo00.png");
			downimg2=Image.createImage("/sayo20.png");

            upimg=Image.createImage("/sayo14.png");
			upimg1=Image.createImage("/sayo04.png");
			upimg2=Image.createImage("/sayo24.png");

			leftimg=Image.createImage("/sayo12.png");
			leftimg1=Image.createImage("/sayo02.png");
			leftimg2=Image.createImage("/sayo22.png");

			rightimg=Image.createImage("/sayo16.png");
			rightimg1=Image.createImage("/sayo06.png");
			rightimg2=Image.createImage("/sayo26.png");
*/
			currentImg=downimg[1];
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void paint(Graphics g){
		g.setColor(250,200,180);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg[1],x,y,0);
	}

	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
        if(action==LEFT){
            if(a==1){
		currentImg=leftimg1;
			a=2;
			}
            else if(a==2){
		currentImg=leftimg2;
			a=1;
			}
			x=x-3;
		repaint();
		}

        if(action==DOWN){
		    if(a==1){
		currentImg=downimg1;
			a=2;
			}
            else if(a==2){
		currentImg=downimg2;
			a=1;
			}
		y=y+3;
		repaint();
		}

		if(action==RIGHT){
		    if(a==1){
		currentImg=rightimg1;
			a=2;
			}
            else if(a==2){
		currentImg=rightimg2;
			a=1;
			}
		x=x+3;
		repaint();
		}

		if(action==UP){
		    if(a==1){
		currentImg=upimg1;
			a=2;
			}
            else if(a==2){
		currentImg=upimg2;
			a=1;
			}
		y=y-3;
		repaint();
		}
	}
}

