node{
    
    def mvnHome
    stage ('Clone GH'){
        //Creamos una carpeta donde almacenaremos lo que vayamos a incluir en el repositorio para que Openshift utilice ese código
        //sh "mkdir clon"
        dir('clon/'){
            echo(pwd())
            //Clonamos el repositorio usando las credenciales que hemos creado anteriormente
            //git credentialsId: 'robertoGHCOM', url: 'https://github.com/Rob6810/web-service-java.git'
            git credentialsId: 'agustin.munoz@axa-tech.com@github', url: 'https://github.com/Rob6810/web-service-java.git'
            sh 'ls -lah'
        }
        sh 'rm -r clon'
    }    
}
