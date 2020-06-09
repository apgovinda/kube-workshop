package org.dell.edu.kube.workshop.assignment;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.options.Option;

public class SubmitTask extends DefaultTask {

    @TaskAction
    public void submit() {
        getLogger().quiet("Submit assignment");
    }

}