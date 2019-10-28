# Develop a Plugin

## User Interface Components
- Dialogs
- Popups
- Notifications
- File and Class Choosers
- Editor Components
- List and Tree Controls
- Misc Swing Components
- Tool Windows
  - child windows of the IDE used to display information
  - examples:
    - [Git Scope](https://plugins.jetbrains.com/plugin/10083-git-scope)
    - [Atlassian Assistant](https://confluence.check24.de/pages/viewpage.action?pageId=65049252)

## Actions
- add own items to menus and toolbars

### Example
Create action with context menu:
 - right click on src/main/java
   - New > Plugin DevKit > Action
     - "MyAction" 
     - Group: ToolsMenu
     - Anchor: First
     - Debug with: ```System.out.println("debug");```
     
 - Another Example:
   - [BitbucketLinky-Plugin](https://bitbucket.org/atlassianlabs/intellij-bitbucket-references-plugin/src/master/resources/META-INF/plugin.xml)

## Plugin Components
- Application level components 
  - are created and initialized when your *IDE starts up*
- Project level components 
  - are created for *each Project instance* in the IDE
- Module level components

### Example

java/ApplicationStart.java
```java
import com.intellij.openapi.components.BaseComponent;

public class ApplicationStart implements BaseComponent {

    public void initComponent() {
        System.out.println("IDE bootet, Plugin is ready...");
    }
    
}
```

plugin.xml
```
<application-components>
    <component>
        <!-- Plugin's application components (On Start IDE) -->
        <implementation-class>ApplicationStart</implementation-class>
    </component>
</application-components>
```

=> Branch: ApplicationComponent, ProjectManagerListener

## Plugin Extensions and Extension Points
The IntelliJ Platform provides the concept of extensions and extension points that allows a plugin to 
*interact with other plugins or with the IDE itself*

## Plugin Services
A service is a plugin component loaded on demand when your plugin calls the 
getService method of the ServiceManager class.
- The IntelliJ Platform ensures that only one instance of a service is loaded

### How to Declare a Service?
To declare a service, you can use the following extension points: 
- applicationService
- projectService
- moduleService

### Example
Create Service with context menu:
 - right click on src/main/java
   - New > Plugin DevKit
   - ... 

## Messaging infrastructure
Observer pattern based Publisher/Subscriber-EventSystem

```java
MessageBusConnection messageBusConnection = project.getMessageBus().connect();
```

=> Branch: MessageBusFileOpenListenerExample



2 | | 4
--- | --- | ---
[<=](Slide2.md) |  | [=>](Slide4.md)