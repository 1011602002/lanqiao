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

	/*
	����������
	�﷨���������� �������ƣ���ʶ����;
	*/
	Image img,img1,img11,img111,img2,img3,currentImg;
	int x,y;
	int i=1;
	public MainCanvas(){
		try
		{
			/*
			��������ֵ
			�﷨����������=value;
			*/
			img=Image.createImage("/sayo10.png");
			img1=Image.createImage("/sayo12.png");//��
			img11=Image.createImage("/sayo02.png");
			img111=Image.createImage("/sayo22.png");
			img2=Image.createImage("/sayo14.png");
			img3=Image.createImage("/sayo16.png");
			currentImg=img;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void paint(Graphics g){
		g.setColor(0,0,0);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg,x,y,0);//120��X���ꡢ100��Y����
	}
	public void keyPressed(int keyCode) {
		int action=getGameAction(keyCode);
		/*
		action��ֵ��UP��DOWN��LEFT��RIGHT
		*/
		
		if(action==LEFT){
			/*
			ʵ��ת�����
			*/
			/*
			���������¸�ֵ����
			*/
			currentImg=img1;
			System.out.println("����ת");
			x=x-2;i++;
			if (i>2){
			i=1;
			}
			else if(i=1){
			currentImg=img11;}
			else if(i=2){
            currentImg=img111;}
			repaint();
		}
		if(action==UP){
		    currentImg=img2;
			System.out.println("����ת");
			y=y-2;
			repaint();
		
		}
		if(action==RIGHT){
		    currentImg=img3;
			System.out.println("����ת");
			x=x+2;
			repaint();
		
		}
			if(action==DOWN){
		    currentImg=img;
			System.out.println("����ת");
			y=y+2;
			repaint();
		
		}
	                                    }
	
}