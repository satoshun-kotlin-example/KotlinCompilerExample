package com.github.satoshun.example.kotlincompiler

import com.google.auto.service.AutoService
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.compile.AbstractCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

class SamplePlugin : Plugin<Project> {
  override fun apply(target: Project) {
    target.extensions.create(
      "sample",
      SampleExtension::class.java
    )
  }
}

open class SampleExtension

@AutoService(KotlinGradleSubplugin::class)
class SampleKotlinGradleSubplugin : KotlinGradleSubplugin<AbstractCompile> {
  override fun apply(
    project: Project,
    kotlinCompile: AbstractCompile,
    javaCompile: AbstractCompile?,
    variantData: Any?,
    androidProjectHandler: Any?,
    kotlinCompilation: KotlinCompilation?
  ): List<SubpluginOption> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun getCompilerPluginId(): String = "kotlincompiler"

  override fun getPluginArtifact(): SubpluginArtifact = SubpluginArtifact(
    groupId = "com.github.satoshun.exammple.kotlincompiler",
    artifactId = "kotlin-plugin",
    version = "0.0.1"
  )

  override fun isApplicable(project: Project, task: AbstractCompile): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}
