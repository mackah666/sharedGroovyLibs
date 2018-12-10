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