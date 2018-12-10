Skip to content
 
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 @mackah666 Sign out
1
0 0 mackah666/sharedGroovyLibs
 Code  Issues 0  Pull requests 0  Projects 0  Wiki  Insights  Settings
sharedGroovyLibs/Jenkinsfile
e44c606  7 minutes ago
@mackah666 mackah666 Added Jenkinsfile
      
47 lines (45 sloc)  735 Bytes
pipeline {
  agent any
  stages {
    stage('Get stuff done') {
      steps {
        sleep 10
      }
    }
    stage('get more done') {
      steps {
        echo 'Getting stuff done'
      }
    }
    stage('Keep going') {
      parallel {
        stage('Keep going') {
          steps {
            retry(count: 10) {
              echo 'Hello'
            }

          }
        }
        stage('Keep going 2') {
          steps {
            echo 'Hello 2'
          }
        }
      }
    }
    stage('Nearly') {
      steps {
        timestamps() {
          echo 'Step one'
        }

        echo 'Step two'
        echo 'Step three'
      }
    }
  }
}
