import com.redmadrobot.build.dependencies.androidx
import com.redmadrobot.build.dependencies.jetbrains

plugins {
    id("com.redmadrobot.android-library")
    id("com.redmadrobot.publish")
}

version = "1.6.0-2"
description = "Kotlin extensions in addition to androidx core-ktx"

dependencies {
    api(jetbrains.kotlin.stdlib)
    api(androidx.core.ktx)
}
