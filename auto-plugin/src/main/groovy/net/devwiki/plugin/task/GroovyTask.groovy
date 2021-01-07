package net.devwiki.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * 用Java语言编写Task
 * @author devwiki
 */
class GroovyTask extends DefaultTask{

    static final String NAME = "GroovyFirst"

    GroovyTask() {
        group = 'devwiki groovy'
        description = 'devwiki groovy task'
    }

    @TaskAction
    def devwiki() {
        println "groovy plugin: Hello, Groovy!"
    }
}
