package net.devwiki.plugin;

import net.devwiki.plugin.task.JavaTask;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * 用Java语言编写Plugin
 * @author devwiki
 */
public class JavaPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        target.getExtensions().create(JavaPluginExtension.NAME, JavaPluginExtension.class);
        target.getTasks().create(JavaTask.NAME, JavaTask.class);
    }
}
