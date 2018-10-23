package com.github.satoshun.example.kotlincompiler

import org.gradle.api.Plugin
import org.gradle.api.Project

class SamplePlugin : Plugin<Project> {
  override fun apply(target: Project) {
    target.extensions.create(
      "sample",
      SampleExtension::class.java
    )
  }
}

open class SampleExtension
