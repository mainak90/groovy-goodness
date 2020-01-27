#!/usr/bin/groovy
def call(servername,username,cluster){
  def pid1 = pPid("${servername}","${username}","${cluster}")
    if (pid1 != null){
        try{
            sh "ssh -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null ${username}@${servername} kill -9 ${pid1}"
        } catch(Exception e) {
            println('Exception occured while killing process' + e)
        }           
    } else {
        println('The process is already stopped!')
    }
}