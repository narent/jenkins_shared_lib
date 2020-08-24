package org.westpac

public class MvnBuildTestResult implements BuildTestResult{
    @Override
    void build() {
        println "Building maven project..."
    }

    @Override
    void test() {
        println "Testing maven project..."
    }

    @Override
    void result() {
        println "Storing artifacts..."
    }
}
