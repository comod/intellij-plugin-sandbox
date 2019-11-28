package system;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManagerListener;
import com.intellij.openapi.vcs.FileStatusListener;
import com.intellij.openapi.vcs.FileStatusManager;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

public class ProjectStartListener implements ProjectManagerListener {

    public void projectOpened(Project project) {

        System.out.println("projectOpened (ProjectManagerListener)" + project.toString());

        FileStatusManager.getInstance(project).addFileStatusListener(new FileStatusListener() {
            @Override
            public void fileStatusesChanged() {
                System.out.println("fileStatusesChanged");
            }

            @Override
            public void fileStatusChanged(@NotNull VirtualFile virtualFile) {
                System.out.println("fileStatusChangedVirtualFile");
            }
        });

    }

    public void projectClosed(Project project) {
        System.out.println("projectClosed (ProjectManagerListener)" + project.toString());
    }

}