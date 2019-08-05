pipeline{
	agent any
	
	stages {
		stage ('Package Stage') {
			steps {
				withMaven(maven : 'maven_3_5_3'){
					sh 'mvn clean package'
				}
			}
		}	
	}
}