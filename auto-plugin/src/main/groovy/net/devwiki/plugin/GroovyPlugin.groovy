package net.devwiki.plugin

import net.devwiki.plugin.task.GroovyTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class GroovyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create(GroovyPluginExtension.NAME, GroovyPluginExtension)
        project.tasks.create(GroovyTask.NAME, GroovyTask)
    }
}
