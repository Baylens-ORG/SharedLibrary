import jenkins.model.*
import hudson.model.*
import init

init.initializeLibrary()
@Initializer(before = Jenkins.InitMilestone.PLUGINS_STARTED)
def initializeLibrary() {
   println "echo 'brother brother'".execute().text
    // Add any additional initialization logic here
}

throw new IllegalArgumentException("Input cannot be empty") // Throw an exception
