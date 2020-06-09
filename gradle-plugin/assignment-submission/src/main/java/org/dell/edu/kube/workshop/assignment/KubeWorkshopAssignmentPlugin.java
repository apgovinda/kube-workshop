package org.dell.edu.kube.workshop.assignment;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;

public class KubeWorkshopAssignmentPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {

           Task  greet =project.getTasks().create("greet",GreetingTask.class);
           greet.setGroup("assignment");
           greet.setDescription("Simple Greeting message");

           Task verify = project.getTasks().create("verify",VerifyTask.class);
           verify.setDescription("Simple URL Verification");
           verify.setGroup("assignment");

           Task submit = project.getTasks().create("submit",SubmitTask.class);
           submit.setDescription("Simple Submit Output");
           submit.setGroup("assignment");
    }
}
