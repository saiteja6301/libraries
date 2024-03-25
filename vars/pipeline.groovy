
def gitDownload(repo)
{
       git "https://github.com/saiteja6301/${repo}.git"
}
def mavenBuild()
{
    sh'mvn package'
}
