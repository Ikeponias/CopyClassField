package com.github.ikeponias.copyclassfield.services

import com.intellij.openapi.project.Project
import com.github.ikeponias.copyclassfield.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
