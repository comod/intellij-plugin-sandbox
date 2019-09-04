package system;

import com.intellij.openapi.components.BaseComponent;
import com.intellij.openapi.project.ProjectManager;

public class ApplicationStart implements BaseComponent {

    public void initComponent() {

        System.out.println("Application started");

        // Register ProjectManagerListener (Once at ApplicationLevel)
        ProjectStartListener projectManagerListener = new ProjectStartListener();
        ProjectManager.getInstance().addProjectManagerListener(projectManagerListener);

    }

}