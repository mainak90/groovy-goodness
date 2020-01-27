import groovy.util.*

def getVersion(String workspace){
    def cmdarray = ["python", "-c", "/home/Rwlfjnk/custom_scripts/getVersionInt.py", "${workspace}"]
    def proc = cmdarray.execute()
    proc.waitFor()
    if ("${proc.exitValue()}".equals('0')){
        return proc.exitValue()
    } else {
        println("stderr: ${proc.err.text}")
    }
}

def pushTags(String tag, String user, String pass, String url, String workspace){
    def tags = [ "python", "-c", "/home/Rwlfjnk/custom_scripts/pushGitTags.py", "${tag}", "${user}", "${pass}", "${url}", "${workspace}" ]
    def proc = tags.execute()
    if (${proc.exitValue()}.equals('0')){
        return proc.exitValue()
    } else {
        println("stderr: ${proc.err.text}")
    }   
}

def getChangeLogs(String workspace){
    def getChangeLog = [ "python", "-c", "/home/Rwlfjnk/custom_scripts/getGitChangelog.py", "${workspace}" ]
    def exec = getChangeLog.execute()
    if (${exec.exitValue()}.equals('0')){
        return exec.exitValue()
    } else {
        println("stderr: ${exec.err.text}")
    }    
}

def createReleaseVersion(String workspace){
    def versionArray = [ "python", "-c", "/home/Rwlfjnk/custom_scripts/createAlmRelease.py", "${workspace}" ]
    def proc = versionArray.execute()
    if (proc.exitValue().equals('0')){
        return exec.exitValue()
    } else {
        println("stderr: ${proc.err.text}")
        handleError()
    }   
}

def mvnVersionSet(String version){
    if (version == null){
        throw new IllegalArgumentException("please provide the version number")
    }

    echo "Setting the new version-set....."
    def versionArray = ["mvn", "versions:set", "-DnewVersion=${version}", "-DgenerateBackupPoms=false"]
    def proc = versionArray.execute()
    proc.consumeProcessOutput(out,err)
    proc.waitForOrKill(1000)
    println "out> $sout err> $serr"
    println "Version set to ${version}"

}

def mvnDeploy(String pom, String mavenCmdOptions="", boolean skipTests=true) {
    if (pom == null) {
        throw new IllegalArgumentException("please provide pom path")
    }

    if (skipTests.equals.(true)){
        def deployArray = [ "mvn", "-B", "${mavenCmdOptions}", "-f", "${pom}", "-s", "/rel/loc/sft/wlfjnk/machineC/jenkins_home/apache-maven-3.2.2/conf/user-settings.xml", "clean", "deploy", "-DskipTests" ]
    } else {
        def deployArray = [ "mvn", "-B", "${mavenCmdOptions}", "-f", "${pom}", "-s", "/rel/loc/sft/wlfjnk/machineC/jenkins_home/apache-maven-3.2.2/conf/user-settings.xml", "clean", "deploy" ]
    }

    echo "Starting maven deploy....."
    def proc = deployArray.execute()
    proc.consumeProcessOutput(sout, serr)
    proc.waitForOrKill(1000)
    println "out> $sout err> $serr"
    echo "Deploy finished!!!....."
    /*steps.sh("mvn ${packaging} deploy:deploy -DskipTests=${skipTests} --batch-mode ${mavenCmdOptions}");*/
}

def handleError(e) {
    println ("Handling errors...")
    currentBuild.result = 'FAILURE'
    mail()
    throw e as java.lang.Throwable
}

def createReleaseVersion(String workspace){
    def versionArray = [ "python", "-c", "/home/Rwlfjnk/custom_scripts/createAlmRelease.py", "${workspace}" ]
    def proc = versionArray.execute()
    proc.consumeProcessOutput(sout, serr)
    if (proc.exitValue().equals('0')){
        println "$out"
    } else {
        println("stderr: $err")
    }   
}

def createPatchRequest(String derelease, String env, String tag, String url, String time, String user, String pass, String artifact, String type, String group){
    def sout = new StringBuilder(), serr = new StringBuilder()
    def proc = "/home/Rwlfjnk/create_patch_request.sh ${derelease} ${env} ${tag} ${url} ${time} ${user} ${pass} ${artifact} ${type} ${group}".execute()
    proc.consumeProcessOutput(sout, serr)
    proc.waitForOrKill(1000)
    println "out> $sout err> $serr"
}

export this