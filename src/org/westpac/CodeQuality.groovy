package org.narent

public class CodeQuality {
    def jenkinsSteps
    CodeQuality(jenkinsSteps) {
        this.jenkinsSteps = jenkinsSteps
    }

    void run() {
        this.jenkinsSteps.echo "Running code quality scan..."
    }
}