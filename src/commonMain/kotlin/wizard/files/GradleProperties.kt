package wizard.files

import wizard.ProjectFile

class GradleProperties : ProjectFile {
    override val path = "gradle.properties"
    override val content = """
#Gradle
org.gradle.jvmargs=-Xmx2048M -Dkotlin.daemon.jvm.options\="-Xmx2048M"

#Kotlin
kotlin.code.style=official

#MPP
kotlin.mpp.enableCInteropCommonization=true
kotlin.mpp.androidSourceSetLayoutVersion=2

#Compose
org.jetbrains.compose.experimental.uikit.enabled=true
org.jetbrains.compose.experimental.jscanvas.enabled=true
kotlin.native.cacheKind=none

#Android
android.useAndroidX=true
"""
}