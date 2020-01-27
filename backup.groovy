#!/usr/bin/groovy
def call(servername,username,appname,filepath,backupPath){
    String backupScript = "ssh -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null '${username}'@'${servername}' ls -lrt '${filepath}' | grep '${appname}' | sort | head -1 | awk '{print \$9}'"
    def backupVersion = sh returnStdout: true, script: "${backupScript}"
    if (backupVersion){
        println('Backing up previous version file: ' + backupVersion)
        try{
            sh "ssh -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null '${username}'@'${servername}' cp -r '${filepath}'/'${backupVersion}' '${backupPath}'"
            println('File ' + backupVersion + ' backed up to backup directory successfully')
        } catch(Exception e){
            println('There is some issue with the file backup, please have a look, Exception : ' + e)
        }
    } else {
        println('No files found to be backed up')
    }
}