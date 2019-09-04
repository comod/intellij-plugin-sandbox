package system;

import com.intellij.openapi.components.ProjectComponent;

public class ProjectStart implements ProjectComponent {

    public void projectOpened() {
        System.out.println("projectOpened (ProjectComponent)");
    }

}