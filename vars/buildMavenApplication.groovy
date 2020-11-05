def call(Map config=[:], Closure body) {
    node {
        stage("Build") {
            echo "mvn build"
        }
        stage("Unit Test") {
            echo "mvn unit test"
        }
        stage("Static Analysis") {
            echo "sonarqube"
        }
        stage("Integration Test") {
            echo "mvn integration test"
        }
        stage("Acceptance Test") {
            echo "mvn acceptance test"
        }         
        stage("Publish Artifact") {
            echo "mvn publish"
        }
        body()
    }
}