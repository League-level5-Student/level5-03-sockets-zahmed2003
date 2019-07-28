package _02_Chat_Application;

import java.io.IOException;

import javax.swing.*;
import _01_Intro_To_Sockets.client.ClientGreeter;
import _01_Intro_To_Sockets.server.ServerGreeter;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp extends JFrame{
	public void initialize()
	{
		int response = JOptionPane.showConfirmDialog(null, "Would you like to host a connection?", "Test", JOptionPane.YES_NO_OPTION);
		if(response == JOptionPane.YES_OPTION){
			try {
				new ServerGreeter().run();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		else
		{
			new ClientGreeter().run();
		}
	}
	
	public static void main(String[] args) {
		new ChatApp().initialize();
	}
}
