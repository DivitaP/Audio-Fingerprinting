package view;

import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.net.URL;

public class MainView {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Class cls = Class.forName("AudioRecognizerWindow");
		// ClassLoader cLoader = cls.getClassLoader();

		// System.out.println(cLoader.getClass());

		// // finds resource
		// URL url = cLoader.getSystemResource("file.txt");
		// System.out.println("Value = " + url);

		AudioRecognizerWindow audioWindow = new AudioRecognizerWindow("Audio Recognizer");
		audioWindow.createWindow();
	}

}
