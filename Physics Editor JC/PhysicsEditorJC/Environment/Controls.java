package Environment;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import Landscapes.Field;
import Objects.BouncyBall;
import Objects.RandomClass;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Controls extends JPanel implements KeyListener
{
	JButton gravity;
	TheWorld world;
	
    public Controls(TheWorld world) 
    {
    	this.world = world;
    	gravity = new JButton("Gravity Up");
    	gravity.setSize(300,300);
    	add(gravity);
    	gravity.addActionListener(new ActionListener(){
    		public synchronized void actionPerformed(ActionEvent e)
    		{
    			world.requestFocusInWindow();
    		}
    	});
    }
    
     @Override
 public synchronized void keyPressed(KeyEvent arg0) 
 { 
	 if(arg0.getKeyCode()==KeyEvent.VK_RIGHT) 
		 world.rightHeld=true;
	 if(arg0.getKeyCode()==KeyEvent.VK_LEFT) 
		 world.leftHeld=true;
	 if(arg0.getKeyCode()==KeyEvent.VK_UP) 
		 world.upHeld=true;
//	 if(arg0.getKeyCode()==KeyEvent.VK_DOWN) 
//		 world.downHeld=true;
 }

 @Override
 public synchronized void keyReleased(KeyEvent arg0) 
 {
	 if(arg0.getKeyCode()==KeyEvent.VK_RIGHT) 
		 world.rightHeld=false;
	 if(arg0.getKeyCode()==KeyEvent.VK_LEFT) 
		 world.leftHeld=false;
	 if(arg0.getKeyCode()==KeyEvent.VK_UP) 
		 world.upHeld=false;
 }

 @Override
 public synchronized void keyTyped(KeyEvent arg0) 
 {
	 
 }
    
}