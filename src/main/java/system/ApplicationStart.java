package system;

import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.BaseComponent;
import com.intellij.util.messages.MessageBus;
import listener.ChangeActionNotifier;
import listener.ChangeActionNotifierInterface;

public class ApplicationStart implements BaseComponent {

    public void initComponent() {

        System.out.println("Application started");

        // Get Application from ApplicationManager
        Application application = ApplicationManager.getApplication();

        // Get MessageBus from application
        MessageBus messageBus = application.getMessageBus();

        // SUBSCRIBE custom Event to the MessageBusConnection
        messageBus.connect().subscribe(ChangeActionNotifier.CHANGE_ACTION_TOPIC, new ChangeActionNotifier());

        // PUBLISH to custom listener
        ChangeActionNotifierInterface publisher = messageBus.syncPublisher(ChangeActionNotifierInterface.CHANGE_ACTION_TOPIC);
        publisher.doAction("Test doAction");

    }

}