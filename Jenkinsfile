pipeline {
    parameters {
        string(name: 'COLLECTION_NAME', description: 'options parse into katalon',                          defaultValue: 'regression')
        string(name: 'REPORT_NAME',     description: 'report name ex: Sprint-1 (no space)',                 defaultValue: 'Sprint-3')
        string(name: 'CREATED_BY',      description: 'PIC Run',                                             defaultValue: 'QA Pijar Sekolah')
        string(name: 'ENV',             description: 'env run automation, please input staging or develop', defaultValue: 'develop')
        string(name: 'PROJECT_NAME',    description: 'Your Project name',                                   defaultValue: 'Pijar Sekolah')
        string(name: 'PROJECT_DETAIL',  description: 'Contact PIC pipeline& Report for yout prohect detail',     defaultValue: '65')
        string(name: 'tokenTelegram',   description: 'token API Teleram',                                   defaultValue: '1296535772:AAE3yVn3p4iUpf95yZo71YAHi7KF6PvaG9Q')
        string(name: 'chatId',          description: 'ID Chat Room',                                        defaultValue: '-322914983')
    }
    agent { label "docker-qa" }
    options {
        skipDefaultCheckout()
    }
    stages {
        stage ( "Kill Old Build" ){
            steps{
                script{
                    cleanWs()
                    deleteDir()
                    echo 'Kill Old Build'
                 }  
            }   
        }
        stage('Checkout SCM') {
            steps {
                cleanWs()
                checkout scm
                script {
                    echo "get COMMIT_ID"
                    sh 'echo -n $(git rev-parse --short HEAD) > ./commit-id'
                    commitId = readFile('./commit-id')
                }
                stash(name: 'ws', includes:'**,./commit-id')
            }
        }
    
        stage('Test') {
            steps {
                unstash 'ws'
                echo "Run Docker to test WEB using katalon"
                script{
                    webTest.runtest()
                }
            }
        }
    }
    post {
        always{
                script{
                    webTest.telegram()
            }    
        }   
    }   
}
