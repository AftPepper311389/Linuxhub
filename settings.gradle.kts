pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io") // 保留这个，有些开源库需要
    }
}

rootProject.name = "My Application"
include(":app")
include(":terminal-emulator")
include(":terminal-view")
include(":x11-lorie")
include(":x11-stub")
project(":terminal-emulator").projectDir = file("termux_ubuntu_rebuild/integrated_app/terminal-emulator")
project(":terminal-view").projectDir = file("termux_ubuntu_rebuild/integrated_app/terminal-view")
project(":x11-lorie").projectDir = file("termux_ubuntu_rebuild/termux_x11_source/lorie")
project(":x11-stub").projectDir = file("termux_ubuntu_rebuild/termux_x11_source/shell-loader/stub")
