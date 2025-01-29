package org.example;
import javax.swing.*;
import java.awt.*;


public class MusicCatalogue {
    JFrame catalogue;
    JPanel northPanel,southPanel,westPanel,centerPanel;
    JLabel label;
    JList categories;
    JCheckBox checkBox;
    JComboBox comboBox;
    JButton submitButton,ExitButton;
    JTextField field,field2;
    String text,text2;

    public MusicCatalogue() {
        this.catalogueWindow();
    }

    public JFrame catalogueWindow(){
        catalogue=new JFrame("Catalogue");
        catalogue.setMinimumSize(new Dimension(800,600));
        catalogue.setExtendedState(JFrame.MAXIMIZED_BOTH);
        catalogue.setVisible(true);
        catalogue.setLayout(new BorderLayout());
        catalogue.add(this.north(),BorderLayout.NORTH);
        catalogue.add(this.west(),BorderLayout.WEST);
        catalogue.add(this.south(),BorderLayout.SOUTH);
        catalogue.add(this.center(),BorderLayout.CENTER);
        catalogue.add(this.nullPanel(),BorderLayout.EAST);
        return catalogue;
    }

    public JPanel north(){
        northPanel= new JPanel();
        northPanel.setBackground(Color.lightGray);
        northPanel.setPreferredSize(new Dimension(100,250));
        northPanel.add(this.northText());
        return northPanel;
    }
    public JPanel south(){
        southPanel= new JPanel();
        southPanel.setBackground(Color.lightGray);
        southPanel.setPreferredSize(new Dimension(100,200));
        //southPanel.setLayout(new GridLayout(1,2));
        southPanel.add(this.ExitButtonFunc());
        southPanel.add(this.submitButtonFunc());
        return southPanel;
    }

    public JPanel west(){
        westPanel= new JPanel();
        westPanel.setBackground(Color.lightGray);
        westPanel.setPreferredSize(new Dimension(250,100));
        westPanel.add(this.westlist());

        return westPanel;
    }
    public JPanel center(){
        centerPanel= new JPanel();
        //centerPanel.setBackground(Color.gray);
        centerPanel.setPreferredSize(new Dimension(100,100));
        GridLayout Gl=new GridLayout(4,2);
        centerPanel.setLayout(Gl);

        centerPanel.add(this.artist());
        centerPanel.add(this.field());
        centerPanel.add(this.studio());
        centerPanel.add(this.field2());
        centerPanel.add(this.genre());
        centerPanel.add(this.combo());
        centerPanel.add(this.available());
        centerPanel.add(this.check());
        centerPanel.setForeground(Color.white);
        return centerPanel;
    }

    public JLabel northText(){
        label = new JLabel("My Music Catalogue",JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("Verdana", Font.BOLD, 22));
        label.setPreferredSize(new Dimension(300, 200));
        label.setForeground(new Color(120, 90, 40));
        label.setBackground(new Color(100, 20, 70));
        label.setBorder(BorderFactory.createEmptyBorder(40,0,0,0));

        return label;
    }

    public JList westlist(){
        String categ[]={"Rap","Raggae","Ballads"};
        categories=new JList<>(categ);
        categories.setPreferredSize(new Dimension(150,600));
        categories.setSelectedIndex(0);
        return categories;
    }

    public JButton ExitButtonFunc(){
        ExitButton=new JButton("EXIT");
        ExitButton.setBackground(new Color(255, 127, 127));
        ExitButton.setForeground(Color.white);
        ExitButton.setFocusPainted(false);
        ExitButton.addActionListener(e->{
        catalogue.dispose();

        });

        return ExitButton;
    }

    public JButton submitButtonFunc(){
        submitButton=new JButton("SUBMIT");
        submitButton.setBackground(new Color(60,179,113));
        submitButton.setForeground(Color.white);
        submitButton.setFocusPainted(false);
        submitButton.addActionListener(e -> {

            if(!field.getText().isBlank()&&!field2.getText().isBlank()){
                System.out.println("ARTIST NAME: "+field.getText());
                System.out.println("RECORDING STUDIO: "+field2.getText());
                System.out.println("CATEGORY: "+comboBox.getSelectedItem());
                System.out.println("BOOK: "+(checkBox.isSelected()?"Available":"unAvailable"));
            }

        });
        return submitButton;
    }

    public JLabel artist(){
        JLabel label1 =new JLabel("ARTIST NAME");
        label1.setFont(new Font("Verdana", Font.BOLD, 14));
        label1.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        return label1;
    }
    public JLabel studio(){
        JLabel label1 =new JLabel("RECORDING STUDIO");
        label1.setFont(new Font("Verdana", Font.BOLD, 14));
        label1.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        return label1;
    }public JLabel genre(){
        JLabel label1 =new JLabel("CATEGORY");
        label1.setFont(new Font("Verdana", Font.BOLD, 14));
        label1.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        return label1;
    }

    public JLabel available(){
        JLabel label1 =new JLabel("AVAILABLE");
        label1.setFont(new Font("Verdana", Font.BOLD, 14));
        label1.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        return label1;
    }


    public JTextField field(){
        field=new JTextField();
        text = field.getText();
        field.setColumns(80);
        return field;
    }
    public JTextField field2(){
        field2=new JTextField();
        text2 =field2.getText();
        field2.setColumns(80);
        return field2;
    }

    public JPanel nullPanel(){
        JPanel right=new JPanel();
        right.setPreferredSize(new Dimension(200,100));
        right.setBackground(Color.lightGray);
        return right;
    }

    public JCheckBox check(){
        checkBox = new JCheckBox();
        return checkBox;
    }

    public JComboBox combo(){
        String categ[]={"Rap","Raggae","Ballads"};
        comboBox = new JComboBox<>(categ);
        return comboBox;
    }



}

