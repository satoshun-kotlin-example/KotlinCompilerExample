package com.github.satoshun.example.kotlincompiler.plugin

import com.google.auto.service.AutoService
import org.jetbrains.kotlin.com.intellij.mock.MockProject
import org.jetbrains.kotlin.compiler.plugin.CliOption
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor
import org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar
import org.jetbrains.kotlin.config.CompilerConfiguration

@AutoService(CommandLineProcessor::class)
class SampleCommandLineProcessor : CommandLineProcessor {
  override val pluginId: String = "kotlincompiler"
  override val pluginOptions: Collection<CliOption> = listOf()

  override fun processOption(option: CliOption, value: String, configuration: CompilerConfiguration) {
  }
}

@AutoService(ComponentRegistrar::class)
class SampleLogComponentRegistrar : ComponentRegistrar {
  override fun registerProjectComponents(project: MockProject, configuration: CompilerConfiguration) {
    TODO("not implemented")
  }
}
