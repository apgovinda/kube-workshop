package org.dell.edu.kube.workshop.assignment;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.options.Option;

public class KubeWorkshopAssignment extends DefaultTask {

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
        getLogger().debug(greeting);
    }

    private String url;

    @Option(option = "url", description = "Configures the URL to be verified.")
    public void setUrl(String url) {
        this.url = url;
    }

    @Input
    public String getUrl() {
        return url;
    }

    @TaskAction
    public void verify() {
        getLogger().quiet("Verifying URL '{}'", url);

        // verify URL by making a HTTP call
    }

    @TaskAction
    public void submit(){
        getLogger().debug("Submit assignment");
    }

}
