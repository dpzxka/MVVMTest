pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
       /* maven{url 'https://maven.aliyun.com/repository/gradle-plugin'}
        maven{url 'https://maven.aliyun.com/repository/central'}
        maven{url 'https://maven.aliyun.com/repository/google'}
        maven{url 'https://maven.aliyun.com/repository/public'}
        maven{url 'https://maven.aliyun.com/repository/jcenter'}*/
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        /*maven{url 'https://maven.aliyun.com/repository/gradle-plugin'}
        maven{url 'https://maven.aliyun.com/repository/central'}
        maven{url 'https://maven.aliyun.com/repository/google'}
        maven{url 'https://maven.aliyun.com/repository/public'}
        maven{url 'https://maven.aliyun.com/repository/jcenter'}*/
    }
}

rootProject.name = "MVVMTest"
include(":app")
 