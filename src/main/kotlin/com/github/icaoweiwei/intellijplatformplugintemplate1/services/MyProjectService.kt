package com.github.icaoweiwei.intellijplatformplugintemplate1.services

import com.github.icaoweiwei.intellijplatformplugintemplate1.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
