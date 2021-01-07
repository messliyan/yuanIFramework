package net.devwiki.plugin.task;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * 用Java语言编写Task
 * @author devwiki
 */
public class JavaTask extends DefaultTask {

    public static final String NAME = "JavaFirst";

    public JavaTask() {
        setGroup("devwiki java");
        setDescription("devwiki groovy task");
    }

    @TaskAction
    void task() {
        System.out.println("java plugin: Hello, Java!");
    }
}
