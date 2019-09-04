package config;

import application.Constants;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This is a PersistentStateComponent.
 * Every Property in this class will be saved (on Project-Level)
 */
@State(
    name = ProjectConfig.NAME,
    storages = { @Storage(ProjectConfig.STORAGE) }
)
public class ProjectConfig implements PersistentStateComponent<ProjectConfig> {

    static final String NAME = Constants.APPLICATION_NAME + "ProjectConfig";
    static final String STORAGE = Constants.APPLICATION_NAME + NAME + ".xml";

    public String data = "";

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Nullable
    @Override
    public ProjectConfig getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull ProjectConfig ProjectConfig) {
        XmlSerializerUtil.copyBean(ProjectConfig, this);
    }

    @Nullable
    public static ProjectConfig getInstance(Project project) {
        return ServiceManager.getService(project, ProjectConfig.class);
    }
}
