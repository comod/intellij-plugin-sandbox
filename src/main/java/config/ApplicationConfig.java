package config;

import application.Constants;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This is a PersistentStateComponent.
 * Every Property in this class will be saved (on Application-Level)
 */
@State(
    name = ApplicationConfig.NAME,
    storages = { @Storage(ApplicationConfig.STORAGE) }
)
public class ApplicationConfig implements PersistentStateComponent<ApplicationConfig> {

    static final String NAME = Constants.APPLICATION_NAME + "ApplicationConfig";
    static final String STORAGE = Constants.APPLICATION_NAME + NAME + ".xml";

    private String host = "";
    private String user = "";
    private String pass = "";

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Nullable
    @Override
    public ApplicationConfig getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull ApplicationConfig ApplicationConfig) {
        XmlSerializerUtil.copyBean(ApplicationConfig, this);
    }

    @Nullable
    public static ApplicationConfig getInstance() {
        return ServiceManager.getService(ApplicationConfig.class);
    }
}
