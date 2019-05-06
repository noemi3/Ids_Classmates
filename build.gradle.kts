buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Config.Libs.androidGradlePlugin)
        classpath(Config.Libs.kotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(Config.Repositoryes.spek)
    }
}
/*
task clean(type: Delete) {
    delete rootProject.buildDir
}*/
