package org.dell.edu.kube.workshop.assignment;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class KubeWorkshopAssignmentPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
           project.getTasks().create("greet",KubeWorkshopAssignment.class);
           project.getTasks().create("verify",KubeWorkshopAssignment.class);
    }
}
