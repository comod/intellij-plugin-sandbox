package listener;

import application.Constants;
import com.intellij.util.messages.Topic;

public interface ChangeActionNotifierInterface {

    Topic<ChangeActionNotifierInterface> CHANGE_ACTION_TOPIC = Topic.create(Constants.APPLICATION_NAME + "SomeAction", ChangeActionNotifierInterface.class);

    void doAction(String context);

}