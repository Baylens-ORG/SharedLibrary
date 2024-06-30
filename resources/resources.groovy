import jenkins.model.*
import hudson.model.*

@Initializer(before = Jenkins.InitMilestone.PLUGINS_STARTED)
def initializeLibrary() {
    println("Shared library initialized!")
    // Add any additional initialization logic here
}