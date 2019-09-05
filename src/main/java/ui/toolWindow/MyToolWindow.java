package ui.toolWindow;

import com.intellij.openapi.wm.ToolWindow;
import javax.swing.*;

public class MyToolWindow {

    private JButton refreshToolWindowButton;
    private JButton hideToolWindowButton;
    private JLabel currentDate;
    private JLabel currentTime;
    private JPanel myToolWindowContent;

    MyToolWindow(ToolWindow toolWindow) {

        hideToolWindowButton.addActionListener(e -> toolWindow.hide(null));
        refreshToolWindowButton.addActionListener(e -> doSomething());

        this.doSomething();

    }

    private void doSomething() {

        currentDate.setText("some content");
        currentTime.setText("some content");

    }

    JPanel getContent() {
        return myToolWindowContent;
    }

}