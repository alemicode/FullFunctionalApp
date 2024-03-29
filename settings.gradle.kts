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
    }
}

rootProject.name = "FullFunctionalApp"
include(":app")
include(":data")

include(":data:network")
include(":data:mylibrary")
include(":data:database")
include(":data:model")
include(":data:data")
include(":feature")
include(":feature:user")
include(":data:domain")
include(":ui-toolkit")
