package system;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManagerListener;

public class ProjectStartListener implements ProjectManagerListener {

    public void projectOpened(Project project) {
        System.out.println("projectOpened (ProjectManagerListener)" + project.toString());
    }

    public void projectClosed(Project project) {
        System.out.println("projectClosed (ProjectManagerListener)" + project.toString());
    }

}