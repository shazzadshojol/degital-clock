package com.degitalclock;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;


public class ClockFram extends JFrame {

    private JLabel heading;
    private JLabel clockLable;
    private Font font = new Font("", Font.BOLD, 35);


// This is heading part //
    public void ClockFramMain() {
        setTitle("Degital Clock");
        setSize(400, 500);
        setLocation(300, 50);
        setVisible(true);
        this.clockSystem();
        this.StartClock();
    }

    //This class is for clock system
    public void clockSystem() {
        heading = new JLabel("My Clock");
        clockLable = new JLabel("Degital Clock");
        

        heading.setFont(font);
        clockLable.setFont(font);
        


        this.setLayout(new GridLayout(3, 2));
        this.add(heading);
        this.add(clockLable);
        

    }
    // this is for clock body//

    public void StartClock(){
        Timer timer = new Timer(1000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String dateString=new Date().toString();
                clockLable.setText(dateString);
            }
            
        });
        timer.start();
    }
}
