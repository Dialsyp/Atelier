node{
    cleanWs()
    try{
        stage('PremiereEtape'){
            sh'echo 'hello world''
        }
         stage('deuxiemeEtape'){
            sh'echo 'hello world''
        }
    }
    finally{
        cleanWs()
    }
}