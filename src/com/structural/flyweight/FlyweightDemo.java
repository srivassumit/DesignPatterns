package com.structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

/**
 * @author Sumit
 *
 */
public class FlyweightDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7069514746847490441L;

	JButton startDrawing;

	int windowWidth = 1200;
	int windowHeight = 600;
	Color[] shapeColor = { Color.orange, Color.red, Color.blue, Color.cyan, Color.yellow, Color.black, Color.magenta,
			Color.pink, Color.green	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new FlyweightDemo();
	}

	public FlyweightDemo() {
		this.setSize(windowWidth, windowHeight);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Flyweight Demo");

		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());

		final JPanel drawingPanel = new JPanel();

		startDrawing = new JButton("Draw Stuff");

		contentPane.add(drawingPanel, BorderLayout.CENTER);
		contentPane.add(startDrawing, BorderLayout.SOUTH);

		startDrawing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = drawingPanel.getGraphics();
				long startTime = System.currentTimeMillis();
				for (int i = 0; i < 100000; i++) {
//					g.setColor(getRandColor());
//					g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());
//					MyRect rect = new MyRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
//					rect.draw(g);
					MyRect rect = new MyRect(getRandColor());
					rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
				}
				long endTime = System.currentTimeMillis();

				System.out.println("Time: " + (endTime - startTime));
			}
		});

		this.add(contentPane);
		this.setVisible(true);
	}

	private int getRandY() {
		return (int) (Math.random() * windowWidth);
	}

	private int getRandX() {
		return (int) (Math.random() * windowHeight);
	}

	private Color getRandColor() {
		Random randomGenerator = new Random();
		return shapeColor[randomGenerator.nextInt(9)];
	}

}
