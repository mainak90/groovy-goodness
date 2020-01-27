#!/usr/bin/groovy
def call(servername,env,username,filepath,appname,version,archivetype,backupPath,springProfile,logPath,cluster){
    def pid4 = pPid("${servername}","${username}","${cluster}")
    if (pid4 != null){
        backup("${servername}","${username}","${appname}","${filepath}","${backupPath}")        
        stop("${servername}","${username}","${cluster}")
        println('sending files...')
        try{
            sh "scp -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null -r ${sourcePath}/${appname}-${version}.${archivetype} ${username}@${servername}:${filepath}"
            println('files have been sent to ' + servername)
            start("${servername}","${username}","${filepath}","${appname}","${version}","${archivetype}","${backupPath}","${springProfile}","${logPath}","${cluster}")
            def pid5 = pPid("${servername}","${username}","${cluster}")
            println('Application ' + appname + ' started successfully, started with pid : ' + pid5 + ' on host ' + servername)
        } catch(Exception e){
            println('Error while sending files to destination host : ' + servername + ', please have a look!!')
        }
    } else {
        backup("${servername}","${username}","${appname}","${filepath}","${backupPath}")
        println('sending files...')
        try{
            sh "scp -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null -r ${sourcePath}/${appname}-${version}.${archivetype} ${username}@${servername}:${filepath}"
            println('files have been sent to ' + servername)
            start("${servername}","${username}","${filepath}","${appname}","${version}","${archivetype}","${backupPath}","${springProfile}","${logPath}","${cluster}")
            def pid6 = pPid("${servername}","${username}","${cluster}")
            println('Application ' + appname + ' deployed successfully, started with pid : ' + pid6 + ' on host ' + servername)
        } catch(Exception e){
            println('Error while sending files to destination host : ' + servername + ', please have a look!!')
        }
    }
}