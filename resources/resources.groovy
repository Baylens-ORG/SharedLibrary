import jenkins.model.*
import hudson.model.*

@Initializer(before = Jenkins.InitMilestone.PLUGINS_STARTED)
def initializeLibrary() {
   println "echo 'brother brother'".execute().text
    // Add any additional initialization logic here
}