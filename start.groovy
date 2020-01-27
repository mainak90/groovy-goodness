#!/usr/bin/groovy
def call(servername,username,filepath,appname,version,archivetype,backupPath,springProfile,logPath,cluster){
    def pid3 = pPid("${servername}","${username}","${cluster}")
    if (pid3 != null){
        stop("${servername}","${username}","${cluster}")
        try {
            sh "ssh -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null ${username}@${servername} java -Xmx2024M -Dspring.profiles.active=${springProfile} -jar ${filepath}/${appname}-${version}.${archivetype}"
            def newPid = pPid("${servername}","${username}","${cluster}")
            println('Application started on pid ' + newPid)
        } catch (Exception e){
            println('Exception encountered' + e)
        }
    } else {
        try {
            sh "ssh -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null ${username}@${servername} java -Xmx2024M -Dspring.profiles.active=${springProfile} -jar ${filepath}/${appname}-${version}.${archivetype}"
            def newPid = pPid("${servername}","${username}","${cluster}")
            println('Application started on pid ' + newPid)
        } catch (Exception e){
            println('Exception encountered' + e)
        }      
    }
}