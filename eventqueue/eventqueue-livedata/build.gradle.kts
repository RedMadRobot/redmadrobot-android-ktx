plugins {
    convention.library.android
}

version = "1.0.0-0"
description = "EventQueue with LiveData"

android {
    namespace = "com.redmadrobot.eventqueue.livedata"
}

dependencies {
    api(kotlin("stdlib"))
    api(projects.eventqueueCommon)
    api(androidx.lifecycle.common)
    api(androidx.lifecycle.livedata.core)
    api(androidx.activity)
    api(androidx.annotation)
    api(androidx.fragment)

    testImplementation(stack.kotlin.test.junit5)
    testImplementation(stack.junit.jupiter.api)
    testImplementation(libs.assertj.core)
    testImplementation(libs.androidx.arch.core.testing)
    testRuntimeOnly(stack.junit.jupiter.engine)
}