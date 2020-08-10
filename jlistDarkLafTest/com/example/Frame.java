import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.github.weisj.darklaf.LafManager;

/**
* New Test Code JList
* @author weisj
*/
class Test {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JPanel contentPane = new JPanel(new BorderLayout());
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

            DefaultListModel<String> listModel = new DefaultListModel<>();
            listModel.addElement("DARKLAFLISTTEST");
            JList<String> list = new JList<>(listModel);
            contentPane.add(list);

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(contentPane);
            frame.pack();
            frame.setLocationRelativeTo(null);
            LafManager.install();

            frame.setVisible(true);
        });
    }
}


/* old code for test JList */
//package com.example;

//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;

//import javax.swing.DefaultListModel;
//import javax.swing.JFrame;
//import javax.swing.JList;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.SwingUtilities;
//import javax.swing.UIManager;
//import javax.swing.border.EmptyBorder;

//import com.github.weisj.darklaf.LafManager;
//import com.github.weisj.darklaf.theme.OneDarkTheme;

//public class Frame extends JFrame {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 2533582800492176252L;
//	private JPanel contentPane;
//	private DefaultListModel<String> jlistest;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(() -> {
//			try {
//				//IManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//				LafManager.install(new OneDarkTheme());
//				Frame frame = new Frame();
//				
//				frame.setVisible(true);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
//	public Frame() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 832, 480);
//		setLocationRelativeTo(null);
//		contentPane = new JPanel();
//		contentPane.setBackground(Color.WHITE);
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
//		contentPane.setLayout(gbl_contentPane);
//		
//		JScrollPane scrollPane = new JScrollPane();
//		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
//		gbc_scrollPane.fill = GridBagConstraints.BOTH;
//		gbc_scrollPane.gridx = 1;
//		gbc_scrollPane.gridy = 1;
//		contentPane.add(scrollPane, gbc_scrollPane);
//		
//        jlistest = new DefaultListModel<>();
//
//       jlistest.addElement("DARKLAFLISTTEST");
//		
//		JList<String> list = new JList<String>(jlistest);
//		scrollPane.setViewportView(list);
//	}
//
//}
