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
   deploy adapters: [tomcat9(credentialsId: '${jobname}', path: '', url: 'http://${ip}:8080')], contextPath: '${context}', war: '**/*.war'
}

