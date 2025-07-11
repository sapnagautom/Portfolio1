import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleNotepad extends JFrame implements ActionListener {

    JTextArea textArea;
    JMenuItem openItem, saveItem, newItem, exitItem;

    SimpleNotepad() {
        // Create the Text Area
        textArea = new JTextArea();
        add(new JScrollPane(textArea));

        // Create Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        // Create Menu Items
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        // Add menu items to menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add menu to menu bar
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Add action listeners
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Frame settings
        setTitle("Simple Notepad");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            textArea.setText(""); // Clear text
        } else if (e.getSource() == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    textArea.read(br, null);
                    br.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "File not found!");
                }
            }
        } else if (e.getSource() == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    textArea.write(bw);
                    bw.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file!");
                }
            }
        } else if (e.getSource() == exitItem) {
            System.exit(0); // Close the application
        }
    }

    public static void main(String[] args) {
        new SimpleNotepad();
    }
}
