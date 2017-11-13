node{
    
    def mvnHome
    stage ('Setup'){
        //Creamos una carpeta donde almacenaremos lo que vayamos a incluir en el repositorio para que Openshift utilice ese código
        //sh "mkdir clon"
        dir('clon/'){
            echo(pwd())
            //Añadimos el repositorio para poder realizar un push con los archivos
            //sh "git remote add destination https://github.axa.com/roberto-estevanez-externo/prueba.git"
            //Clonamos el repositorio usando las credenciales que hemos creado anteriormente
            //git credentialsId: 'robertoGHCOM', url: 'https://github.com/Rob6810/web-service-java.git'
            git credentialsId: 'agustin.munoz@axa-tech.com@github', url: 'https://github.com/Rob6810/web-service-java.git'
            sh "ls -lah"
        }
    }
    
    stage ('Push git-hub'){
        //Copiamos los archivos que se han generado en la carpeta creada anteriormente
        echo(pwd())
        dir('clon/'){
            sh "ls -lah"
            //Añadimos los archivos al repositorio 
            sh "git add ."
            sh "git commit -m 'Jenkins'"
            sh('git push -u destination master')            
        }
        //Eliminamos la carpeta
        sh "rm -fr clon"
    }    
}
