def gitDownload(repo)
{
       git "https://github.com/saiteja6301/${repo}.git"
}
def mavenBuild()
{
    sh'mvn package'
}
def tomcatDeploy(jobname,ip,context)
{
   deploy adapters: [tomcat9(credentialsId: '512976cb-e580-4b9a-a8eb-c97961b4f35a', path: '', url: 'http://172.31.17.128:8080')], contextPath: 'testapp1', war: '**/*.war'

}

