package listener;

import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.FileEditorManagerAdapter;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

public class FileOpenListener extends FileEditorManagerAdapter {

    @Override
    public void fileOpened(@NotNull FileEditorManager manager, @NotNull VirtualFile file) {
        System.out.println("FileOpened");
    }

}