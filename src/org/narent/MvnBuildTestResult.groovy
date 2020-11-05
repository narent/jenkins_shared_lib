package org.narent

public class MvnBuildTestResult implements BuildTestResult{
    def jenkinsSteps
    MvnBuildTestResult(jenkinsSteps) {
        this.jenkinsSteps = jenkinsSteps
    }

    @Override
    void build() {
        this.jenkinsSteps.echo "Building maven project..."
    }

    @Override
    void test() {
        this.jenkinsSteps.echo "Testing maven project..."
    }

    @Override
    void result() {
        this.jenkinsSteps.echo "Storing artifacts..."
    }
}
