package config;

import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * This ProjectConfigurable class appears on Settings dialog,
 * to let user to configure this plugin's behavior.
 */
public class Configurable implements SearchableConfigurable {

    private static final String DISPLAY_NAME = "My Config";
    private static final String ID = "preference.MyConfigurable";
    private ConfigurableGUI mGUI = null;

    @Nullable
    @Override
    public JComponent createComponent() {
        this.mGUI = new ConfigurableGUI();
        this.mGUI.createUI();
        return this.mGUI.getRootPanel();
    }

    public Configurable() {

    }

    @Nls
    @Override
    public String getDisplayName() {
        return DISPLAY_NAME;
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return "";
    }

    @NotNull
    @Override
    public String getId() {
        return ID;
    }

    @Nullable
    @Override
    public Runnable enableSearch(String s) {
        return null;
    }

    @Override
    public boolean isModified() {
        return this.mGUI.isModified();
    }

    @Override
    public void apply() {
        this.mGUI.apply();
    }

    @Override
    public void reset() {
        this.mGUI.reset();
    }

    @Override
    public void disposeUIResources() {
        this.mGUI = null;
    }
}
