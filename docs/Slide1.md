# Introduction

## IntelliJ Platform
- IntelliJ Platform is an Open Source *platform* by JetBrains 
  - IntelliJ IDEA, Android Studio, PhpStorm, ...
- Built on Java
- cross-platform
- component-driven (everything is a plugin)

Products built on the IntelliJ Platform are extensible applications
A lot of the existing functionality in the IntelliJ Platform is written as plugins that can be included or excluded
depending on the needs of the end product

### The most common types of plugins

#### Custom Language Support
Custom language support provides basic functionality for working with a particular programming language

- Syntax highlighting
- Formatting
- Code completion
- Inspections and quick-fixes

More: [Custom Language Support Tutorial](http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support_tutorial.html)

#### Framework Integration
Framework integration consists of improved code insight 
features which are typical for a given framework

#### Tool Integration
Tool integration makes it possible to manipulate 
third-party tools and components 
directly from the IDE without switching contexts

- Implementation of additional actions or UI components
- Access to external resources (eg Jira)

Example: [gerrit-plugin](https://plugins.jetbrains.com/plugin/7272-gerrit)

#### Other

##### Editor enhancement
Improvements of the editor itself

Example: [VimPlugin](https://plugins.jetbrains.com/plugin/164-ideavim)

##### User Interface Add-Ons
Plugins in this category apply various changes to the 
standard user interface of the IDE.

Example: [Intellij-IDEA-Plugin-Background-Image](https://github.com/kimptoc/Intellij-IDEA-Plugin-Background-Image)

0 | | 2   
--- | --- | ---
[<=](README.md) |  | [=>](Slide2.md)