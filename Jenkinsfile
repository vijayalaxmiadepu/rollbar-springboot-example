pipeline {
    agent any

    stages {
        stage ('Clean Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn clean'
                }
            }
        }

        stage ('Build Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn install'
                }
            }
        }
    }
}
