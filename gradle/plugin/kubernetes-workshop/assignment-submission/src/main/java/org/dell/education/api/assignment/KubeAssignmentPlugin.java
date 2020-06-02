package org.dell.education.api.assignment;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.options.Option;

public class KubeAssignmentPlugin extends DefaultTask {

    @Input
    String serverUrl;

    public KubeAssignmentPlugin() {
        setDescription("This is a set of tasks to submit assignment for Kuberenetes workshop");
        setGroup("Kuberenetes");
    }

    @Option(option = "server url", description = "Set the url of the server against which assignment would be submitted.")
    public void setServerUrl(final String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @TaskAction
    public void displayMSUrl(){

            new MSAssignment().execute(serverUrl);

    }

    @TaskAction
    public void displayCKADUrl(){

            new CKADAssignment().execute(serverUrl);

    }

    public class MSAssignment implements Assignment{

        @Override
        public Response execute(Object... input) {
            return new Response(200,"Assignment Submission is Successfull for serverUrl="+serverUrl);
        }
    }

    public class CKADAssignment implements Assignment{

        @Override
        public Response execute(Object... input) {
            return new Response(400,"Assignment Submission Failed for serverUrl="+serverUrl);
        }
    }
}
