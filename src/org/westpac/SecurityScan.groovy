package org.westpac

public class SecurityScan {
    def jenkinsSteps
    SecurityScan(jenkinsSteps) {
        this.jenkinsSteps = jenkinsSteps
    }

    void run() {
        this.jenkinsSteps.echo "Running security scan..."
    }
}