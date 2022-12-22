package com.example.task7;

import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Timer implements IObserver {
    int setTime;
    Text txt = new Text();
    public Timer(){

    }
    public int counter = 0;
    boolean flag = true;

    Circle circle = new Circle();
    @Override
    public void update() {
        if (flag == true){
            counter++;
        }

        txt.setText(""+ counter);
        if (setTime == counter) {
            txt.setFont(Font.font(10));
            txt.setText("Time is over");
            flag = false;
        }

    }
}
