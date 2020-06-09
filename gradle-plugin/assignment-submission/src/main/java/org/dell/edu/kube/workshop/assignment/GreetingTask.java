package org.dell.edu.kube.workshop.assignment;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.options.Option;

public class GreetingTask extends DefaultTask {


    @Input
    String greeting = "hello from GreetingTask";


    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @TaskAction
    void greet() {
        getLogger().quiet(greeting);
    }

}