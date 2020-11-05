def call() {
    pipeline {
        agent any
        stages {
            stage('Configure execution') {
                steps {
                    script {
                        currentBuild.displayName = "" + currentBuild.number + ". feature/AD10-Feature_name"
                    }
                }
            }

            stage('Checkout') {
                steps {
                    echo "checkout"
                }
            }

            stage('Build') {
                steps {
                    echo "mvn build"
                }
            }

            stage ('Unit test') {
                steps {
                    echo "mvn unit test"
                }
            }

            stage ('Static analysis') {
                steps {
                    echo "Sonarqube"
                }
            }            

            stage ('Integration test') {
                steps {
                    echo "mvn integration test"
                }
            }

            stage ('Acceptance test') {
                steps {
                    echo "mvn acceptance test"
                }
            }

            stage ('Publish artifact') {
                steps {
                    echo "mvn publish"
                }
            }            

        }
    }
}