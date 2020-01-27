folder('eDev-Ocapi') {
    displayName('eDev-Ocapi')
    description('eDev_Ocapi applications')
}


multibranchPipelineJob('eDev-Ocapi/ocapi-processor') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/wap.ocapi-processor.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
    configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    }
    triggers {
        periodic(100)
    }  
}

multibranchPipelineJob('eDev-Ocapi/ocapi-public') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/wap.ocapi-public.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

    it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    }
    triggers {
        periodic(100)
    } 
}

multibranchPipelineJob('eDev-Ocapi/lib.ocapi-core') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/lib.ocapi-core.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    }  
}

multibranchPipelineJob('eDev-Ocapi/lib.ocapi-soamodel') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/lib.ocapi-soamodel.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    }
    triggers {
        periodic(100)
    }    
}

multibranchPipelineJob('eDev-Ocapi/ocapi-public-action') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/wap.ocapi-public-action.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    }
    triggers {
        periodic(100)
    }  
}

multibranchPipelineJob('eDev-Ocapi/ocapi-resource') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/wap.ocapi-resource.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    }
    triggers {
        periodic(100)
    }    
}

multibranchPipelineJob('eDev-Ocapi/lib.ocapi-validation') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/lib.ocapi-validation.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    }
    triggers {
        periodic(100)
    }    
}

multibranchPipelineJob('eDev-Ocapi/ocapi-documentstreamer') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/odr/eap.document-streamer.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    }  
    triggers {
        periodic(100)
    }  
}

multibranchPipelineJob('eDev-Ocapi/ocapi-provision') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/wap.ocapi-provision.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }   
}

multibranchPipelineJob('eDev-Ocapi/ocapi-public-action') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/wap.ocapi-public-action.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    } 
}

multibranchPipelineJob('eDev-Ocapi/ocapi-replication') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/odr/eap.odr.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    } 
}

multibranchPipelineJob('eDev-Ocapi/streaming-api') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/mer/wap.streaming-api.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    } 
}

multibranchPipelineJob('eDev-Ocapi/omapi-provision') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/mapi/wap.omapi-provision.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}

multibranchPipelineJob('eDev-Ocapi/omapi-public') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/mapi/wap.omapi.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}

multibranchPipelineJob('eDev-Ocapi/sofy') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/sofy/wap.sofy.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}
 
       it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}

multibranchPipelineJob('eDev_MSO') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/plot/wap.plot.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}
 
       it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}


folder('eDev_ODATA') {
    displayName('eDev_ODATA')
    description('eDev_ODATA applications')
}

multibranchPipelineJob('eDev_ODATA/ocapi replication parent pom') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/odr/eap.odr.pom.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}
 
       it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}

pipelineJob('eDev_ODATA/ocapi-admin-service') {
    parameters {
        stringParam('BRANCH', 'develop', 'Select the branch of the application to deployed')

    }
  
    throttleConcurrentBuilds {
        maxPerNode(1)
        maxTotal(1)
    }
  
    triggers {
        bitbucketPush()
    }

    definition {
        cps {
            script(readFileFromWorkspace('ocapi-admin-service.Jenkinsfile'))
            sandbox()
        }
    }
}

pipelineJob('eDev_ODATA/ocapi-billing-service') {
    parameters {
        stringParam('ENVIRONMENT', 'mre', 'Select the environment to which the application needs to be deployed')
        stringParam('BRANCH', 'develop', 'Select the branch of the application to deployed')
        booleanParam('TO_BE_DEPLOYED', false, 'This flag is used to prevent the deployment trigger for every push to GIT')
        booleanParam('TO_BE_RELEASED', false, 'This flag will be used to decide whether to release the artifact')

    }
  
    throttleConcurrentBuilds {
        maxPerNode(1)
        maxTotal(1)
    }
  
    triggers {
        bitbucketPush()
    }

    definition {
        cps {
            script(readFileFromWorkspace('ocapi-billing-service.Jenkinsfile'))
            sandbox()
        }
    }
}

pipelineJob('eDev_ODATA/ocapi-contact-service') {
    parameters {
        stringParam('ENVIRONMENT', 'mre', 'Select the environment to which the application needs to be deployed')
        stringParam('BRANCH', 'develop', 'Select the branch of the application to deployed')
        booleanParam('TO_BE_DEPLOYED', false, 'This flag is used to prevent the deployment trigger for every push to GIT')
        booleanParam('TO_BE_RELEASED', false, 'This flag will be used to decide whether to release the artifact')

    }

    throttleConcurrentBuilds {
        maxPerNode(1)
        maxTotal(1)
    }
  
    triggers {
        bitbucketPush()
    }
  
    definition {
        cps {
            script(readFileFromWorkspace('ocapi-contact-service.Jenkinsfile'))
            sandbox()
        }
    }
}

pipelineJob('eDev_ODATA/ocapi-customer-service') {
    parameters {
        stringParam('ENVIRONMENT', 'mre', 'Select the environment to which the application needs to be deployed')
        stringParam('BRANCH', 'develop', 'Select the branch of the application to deployed')
        booleanParam('TO_BE_DEPLOYED', false, 'This flag is used to prevent the deployment trigger for every push to GIT')
        booleanParam('TO_BE_RELEASED', false, 'This flag will be used to decide whether to release the artifact')

    }

    throttleConcurrentBuilds {
        maxPerNode(1)
        maxTotal(1)
    }
  
    triggers {
        bitbucketPush()
    }

    definition {
        cpsScm  {
            scm {
                git{
                    branch('*/develop')
                    remote {
                        credentials('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                        url('ssh://git@stash.rel.corp.telenet.be:7999/odr/eap.ocapi-customer-service.git')
                    }
                }
                scriptPath('Jenkinsfile')
            }
        }
    }
}

pipelineJob('eDev_ODATA/ocapi-mobile-service') {
    parameters {
        stringParam('ENVIRONMENT', 'mre', 'Select the environment to which the application needs to be deployed')
        stringParam('BRANCH', 'develop', 'Select the branch of the application to deployed')
        booleanParam('TO_BE_DEPLOYED', false, 'This flag is used to prevent the deployment trigger for every push to GIT')
        booleanParam('TO_BE_RELEASED', false, 'This flag will be used to decide whether to release the artifact')

    }

    throttleConcurrentBuilds {
        maxPerNode(1)
        maxTotal(1)
    }
  
    triggers {
        bitbucketPush()
    }

    definition {
        cpsScm  {
            scm {
                git{
                    branch('develop')
                    remote {
                        credentials('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                        url('ssh://git@stash.rel.corp.telenet.be:7999/odr/eap.ocapi-mobile-service.git')
                    }
                }
                scriptPath('Jenkinsfile')
            }
          
        }
    }
}

pipelineJob('eDev_ODATA/ocapi-product-catalog-service') {
    parameters {
        stringParam('ENVIRONMENT', 'mre', 'Select the environment to which the application needs to be deployed')
        stringParam('BRANCH', 'develop', 'Select the branch of the application to deployed')
        booleanParam('TO_BE_DEPLOYED', false, 'This flag is used to prevent the deployment trigger for every push to GIT')
        booleanParam('TO_BE_RELEASED', false, 'This flag will be used to decide whether to release the artifact')

    }

    throttleConcurrentBuilds {
        maxPerNode(1)
        maxTotal(1)
    }
  
    triggers {
        bitbucketPush()
    }

    environmentVariables {
        keepBuildVariables(true)
        keepSystemVariables(true)
    }

    definition {
        cpsScm  {
            scm {
                git{
                    branch('develop')
                    remote {
                        credentials('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                        url('ssh://git@stash.rel.corp.telenet.be:7999/odr/eap.ocapi-product-catalog-service.git')
                    }
                }
                scriptPath('Jenkinsfile')
            }
        }
    }
}

pipelineJob('eDev_ODATA/ocapi-product-service') {
    parameters {
        stringParam('ENVIRONMENT', 'mre', 'Select the environment to which the application needs to be deployed')
        stringParam('BRANCH', 'develop', 'Select the branch of the application to deployed')
        booleanParam('TO_BE_DEPLOYED', false, 'This flag is used to prevent the deployment trigger for every push to GIT')
        booleanParam('TO_BE_RELEASED', false, 'This flag will be used to decide whether to release the artifact')

    }

    throttleConcurrentBuilds {
        maxPerNode(1)
        maxTotal(1)
    }
  
    triggers {
        bitbucketPush()
    }

    environmentVariables {
        keepBuildVariables(true)
        keepSystemVariables(true)
    }

    definition {
        cpsScm  {
            scm {
                git{
                    branch('develop')
                    remote {
                        credentials('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                        url('ssh://git@stash.rel.corp.telenet.be:7999/odr/eap.ocapi-product-service.git')
                    }
                }
                scriptPath('Jenkinsfile')
            }
        }
    }
}

pipelineJob('eDev_ODATA/ocapi-sales-service') {
    parameters {
        stringParam('ENVIRONMENT', 'mre', 'Select the environment to which the application needs to be deployed')
        stringParam('BRANCH', 'develop', 'Select the branch of the application to deployed')
        booleanParam('TO_BE_DEPLOYED', false, 'This flag is used to prevent the deployment trigger for every push to GIT')
        booleanParam('TO_BE_RELEASED', false, 'This flag will be used to decide whether to release the artifact')

    }

    throttleConcurrentBuilds {
        maxPerNode(1)
        maxTotal(1)
    }
  
    triggers {
        bitbucketPush()
    }

    environmentVariables {
        keepBuildVariables(true)
        keepSystemVariables(true)
    }

    definition {
        cpsScm  {
            scm {
                git{
                    branch('develop')
                    remote {
                        credentials('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                        url('ssh://git@stash.rel.corp.telenet.be:7999/odr/eap.ocapi-sales-service.git')
                    }
                }
                scriptPath('Jenkinsfile')
            }
        }
    }
}

folder('eDev_OpenID') {
    displayName('eDev_OpenID')
    description('eDev_OpenID')
}

multibranchPipelineJob('eDev_OpenID/jwt-redirector') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/ciam/wap.jwt-redirector.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}

multibranchPipelineJob('eDev_OpenID/lib.ocapi-security') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/capi/lib.ocapi-security.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}
 
       it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    } 
}

multibranchPipelineJob('eDev_OpenID/oauth2-openid') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/ciam/wap.oauth2.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}

folder('eDev_Other') {
    displayName('eDev_Other')
    description('eDev_Other application')
}


multibranchPipelineJob('eDev_Other/maintenance-tool') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/cat/wap.cat.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}
 
       it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}

multibranchPipelineJob('eDev_Other/mijntelenet') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/mtln/wap.mijntelenet.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}

multibranchPipelineJob('eDev_Other/webmail') {
    branchSources {
        branchSource {
            source {
                git {
                    credentialsId('3d23e0fd-1108-4170-aaa0-6fad2cbac003')
                    remote('ssh://git@stash.rel.corp.telenet.be:7999/mail/wap.webmail.git')
                    traits {
                        cloneOptionTrait {
                            extension {
                                shallow (false)
                                noTags (false)
                                reference (null)
                                depth(0)
                                honorRefspec (false)
                                timeout (10)
                            }
                        }
                    }
                }
            }
        }
    }
configure {
      def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
      traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {}

      it / factory(class: "org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory") << {
        scriptPath("Jenkinsfile.docker")
        }
    } 
    triggers {
        periodic(100)
    }
}