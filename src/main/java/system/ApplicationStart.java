package system;

import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.BaseComponent;
import com.intellij.openapi.fileEditor.FileEditorManagerListener;
import com.intellij.util.messages.MessageBusConnection;
import listener.FileOpenListener;

public class ApplicationStart implements BaseComponent {

    public void initComponent() {

        System.out.println("Application started");

        Application application = ApplicationManager.getApplication();
        MessageBusConnection messageBusConnection = application.getMessageBus().connect();
        messageBusConnection.subscribe(FileEditorManagerListener.FILE_EDITOR_MANAGER, new FileOpenListener());

    }

}