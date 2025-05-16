pipeline{
    agent any
    environment{
        MAVEN_HOME='/usr/share/maven'
        JAVA_HOME='/usr/lib/jvm/java-17-openjdk-amd64'
        EMAIL_RECIPIENTS='sharan4748@gamil.com'
    }

    stages{
        stage('checkout'){
            steps{
              git url: 'https://github.com/Sharan48/Cucumber_Demo.git'  ,branch:'main'
            }
        }

        stage('build'){
            steps{
                sh "${MAVEN_HOME}/bin/mvn clean compile"
            }
        }

        stage('test'){
            steps{
                sh "${MAVEN_HOME}/bin/mvn -DsuiteXmlFile=testng.xml"
            }
        }

        stage('Archive test results'){
            steps{
                archiveArtifacts artifacts: 'target/surefire-reports/*.xml', fingerprint:true
            }
        }
    }

    post{
        always{
            emialext(
                subject:"Autonation reports ${env.JOB_NAME} #${env.BUID_NAME} - ${currentBuild.currentResult}",
                body:"Please find the attached reports of test",
                to:"${EMAIL_RECIPIENTS}",
                attachmentsPattern:"**/target/surefire-reports/*.xml,**/target/surfire-reports/*.html",
                mimeType:'text/html'
            )
        }
    }
}