node{
    
    def mvnHome
    stage ('Setup'){
        //Establecemos el email y el nombre del usuario para poder realizar operaciones en los repositirios de git-hub
        sh" git config --global user.email 'robertoestevanez@gmail.com'"
        sh" git config --global user.name 'Rob6810'"
       
        //Clonamos el repositorio usando las credenciales que hemos creado anteriormente
        git credentialsId: 'robertoGHCOM', url: 'https://github.com/Rob6810/web-service-java.git'
        
        //Creamos una carpeta donde almacenaremos lo que vayamos a incluir en el repositorio para que Openshift utilice ese código
        //sh "mkdir clon"
        dir('clon/'){
            //Añadimos el repositorio para poder realizar un push con los archivos
            sh "git remote add destination https://roberto-estevanez-externo:b8981e3cd24ead31fdcfb6d28f7caa4d853a8fa8@github.axa.com/roberto-estevanez-externo/prueba.git"
        }
    }
    
    stage ('Push git-hub'){
        //Copiamos los archivos que se han generado en la carpeta creada anteriormente
        echo(pwd())
        dir('clon/'){
            //Añadimos los archivos al repositorio 
            sh "git add ."
            sh "git commit -m 'Jenkins'"
            sh('git push -u destination master')            
        }
        //Eliminamos la carpeta
        sh "rm -fr clon"
    }    
}
