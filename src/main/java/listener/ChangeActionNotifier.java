package listener;

public class ChangeActionNotifier implements ChangeActionNotifierInterface {
    @Override
    public void doAction(String context) {

        System.out.println(context);

    }
}