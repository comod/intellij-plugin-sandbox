package system;

import com.intellij.openapi.components.BaseComponent;

public class ApplicationStart implements BaseComponent {

    public void initComponent() {
        System.out.println("Application started");
    }

}