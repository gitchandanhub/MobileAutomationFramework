package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class NumberReader 
{
    
    public static void readnum(String x) throws AWTException
    {
    	for(int i = 0; i<x.length(); i++)
    	{
    		char c = x.charAt(i);
    		int a = Integer.parseInt(String.valueOf(c));
    		Robot robot = new Robot();
    		if(a==0)
    		{
    			robot.keyPress(KeyEvent.VK_0);
    			robot.keyRelease(KeyEvent.VK_0);
    		}
    		if(a==1)
    		{
    			robot.keyPress(KeyEvent.VK_1);
    			robot.keyRelease(KeyEvent.VK_1);
    		}
    		if(a==2)
    		{
    			robot.keyPress(KeyEvent.VK_2);
    			robot.keyRelease(KeyEvent.VK_2);
    		}
    		if(a==3)
    		{
    			robot.keyPress(KeyEvent.VK_3);
    			robot.keyRelease(KeyEvent.VK_3);
    		}
    		if(a==4)
    		{
    			robot.keyPress(KeyEvent.VK_4);
    			robot.keyRelease(KeyEvent.VK_4);
    		}
    		if(a==5)
    		{
    			robot.keyPress(KeyEvent.VK_5);
    			robot.keyRelease(KeyEvent.VK_5);
    		}
    		if(a==6)
    		{
    			robot.keyPress(KeyEvent.VK_6);
    			robot.keyRelease(KeyEvent.VK_6);
    		}
    		if(a==7)
    		{
    			robot.keyPress(KeyEvent.VK_7);
    			robot.keyRelease(KeyEvent.VK_7);
    		}
    		if(a==8)
    		{
    			robot.keyPress(KeyEvent.VK_8);
    			robot.keyRelease(KeyEvent.VK_8);
    		}
    		if(a==9)
    		{
    			robot.keyPress(KeyEvent.VK_9);
    			robot.keyRelease(KeyEvent.VK_9);
    		}
    	}
    }
	
	  
}
