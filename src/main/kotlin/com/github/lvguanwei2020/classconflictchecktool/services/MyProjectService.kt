package com.github.lvguanwei2020.classconflictchecktool.services

import com.intellij.openapi.project.Project
import com.github.lvguanwei2020.classconflictchecktool.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
