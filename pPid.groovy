#!/usr/bin/groovy
def call(servername,username,cluster){
    String cmdl = "ssh -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null ${username}@${servername} ps -ef | grep ${cluster} | grep java | grep -v grep | awk '{print \$2}'"
    def springPid = sh returnStdout: true, script: "${cmdl}"
    return springPid
} 
