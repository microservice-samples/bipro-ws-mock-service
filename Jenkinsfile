pipeline { 
    agent any
    stages {
    
        stage('MVN- Build') { 
            steps { 
            	echo 'Step0 - Run Maven clean install: '
                sh 'mvn clean install' 
            }
        }
        
        stage('SoapUI- Run MockServices') {
            steps {
            	echo 'Step1 - Run MockServices tests: '
                sh 'mvn com.smartbear.soapui:soapui-maven-plugin:4.6.1:mock'
            }
        }
        
        stage('SoapUI- Run functional') {
            steps {
                echo 'Step2 - Run functional tests: '
                sh 'mvn com.smartbear.soapui:soapui-maven-plugin:4.6.1:test'
            }
        }
        
        stage('SoapUI- Run loadtests') {
            steps {
                echo 'Step3 - Run loadtests tests: '
                sh 'mvn com.smartbear.soapui:soapui-maven-plugin:4.6.1:loadtest'
            }
        }
    }
}