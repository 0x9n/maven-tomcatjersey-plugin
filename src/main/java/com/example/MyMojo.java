package com.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Run "run" goal
 */
@Mojo(name = "run")
class MyMojo extends AbstractMojo {

    /**
     * Execute "run" goal
     * @throws MojoExecutionException Unexpected Exception
     * @throws MojoFailureException Expected Exception
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello, world from maven plugin!");
    }
}
