import com.cloudbees.hudson.plugins.folder.*
import hudson.model.*
import jenkins.model.*
def jenkins = Jenkins.instance
import groovy.transform.Field

def resolver = build.buildVariableResolver
def jobName  = resolver.resolve("job")
println(jobName)
def resetBuildNumber = false
@Field def cleanedJobsTotal = 0
removeBuilds(Jenkins.instance.getItemByFullName(jobName), resetBuildNumber)
def removeBuilds(job, resetBuildNumber) {
  def buildTotal = 5
  def count
  if (job instanceof AbstractFolder) {
    cleanedJobsLimit = 20 
    for (subJob in job.getItems()) {
      if(cleanedJobsTotal >= cleanedJobsLimit){ 
         println "The cleaned jobs limit of " + cleanedJobsTotal + " has been reached.  Exiting..."
         return
      }
      else{
        removeBuilds(subJob, resetBuildNumber)
      }
    }
  } else if (job instanceof Job) {
    count = 0
    buildsDeleted = false
    job.getBuilds().each { 
      if(count < buildTotal){
        count++
      }
      else{
        it.delete()
        buildsDeleted = true
      } 
    }
    if(buildsDeleted){
    	println "Job " + job.name + " cleaned successfully.\n"
      	cleanedJobsTotal++
    }
    if (resetBuildNumber) {
      job.nextBuildNumber = 1
      job.save()
    }
  } else {
    throw new RuntimeException("Unsupported job type ${job.getClass().getName()}!")
  }
}