package org.narent

public class DotNetBuildTestResult implements BuildTestResult{
    def jenkinsSteps
    DotNetBuildTestResult(jenkinsSteps) {
        this.jenkinsSteps = jenkinsSteps
    }

    @Override
    void build() {
        this.jenkinsSteps.echo "Building .net project..."
    }

    @Override
    void test() {
        this.jenkinsSteps.echo "Testing .net project..."
    }

    @Override
    void result() {
        this.jenkinsSteps.echo "Storing artifacts..."
    }
}
