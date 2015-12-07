OctoDroid
=========
This application provides access to [GitHub](https://github.com/) and lets you stay connected with your network

![Octodroid](https://raw.githubusercontent.com/slapperwan/gh4a/master/res/drawable-xxhdpi/octodroid.png)

[![Build Status](https://drone.io/github.com/slapperwan/gh4a/status.png)](https://drone.io/github.com/slapperwan/gh4a/latest)

Download
--------
[![Download OctoDroid from Google Play](http://www.android.com/images/brand/android_app_on_play_large.png)](https://play.google.com/store/apps/details?id=com.gh4a) [![Download OctoDroid from F-Droid.org](https://raw.githubusercontent.com/kageiit/images-host/master/badges/fdroid-badge.png)](http://f-droid.org/repository/browse/?fdfilter=octodroid&fdid=com.gh4a) [![Download latest debug from drone.io](https://raw.githubusercontent.com/kageiit/images-host/master/badges/drone-io-badge.png)](https://drone.io/github.com/slapperwan/gh4a/files/build/outputs/apk/gh4a-debug.apk)


Main features
-------------

###Repository###
* List repositories
* Watch/unwatch repository
* View branches/tags
* View pull requests
* View contributors
* View watchers/networks
* View issues

###User###
* View basic information
* Activity feeds
* Follow/unfollow user
* View public/watched repositories
* View followers/following
* View organizations (if type is user)
* View members (if type is organization)

###Issue###
* List issues
* Filter by label, assignee or milestone
* Create/edit/close/reopen issue
* Comment on issue
* Manage labels
* Manage milestones

###Commit###
* View commit (shows files changed/added/deleted)
* Diff viewer with colorized HTML
* View commit history on each file

###Tree/File browser###
* Browse source code
* View code with syntax hightlighting

###Gist###
* List public gists
* View gist content

###Explore Github###
* Public timeline
* Trending repos (today, week, month, forever)
* GitHub blog

*..and many more*

How to Build Octodroid
----------------------
- Ensure Android SDK platform version 19 and build-tools version 19.1.0 are installed
- Build using Gradle

```bash
./gradlew assembleDebug
```

- To get a full list of available tasks

```bash
./gradlew tasks
```

Open Source Libraries
---------------------
* [GitHub Java API](https://github.com/maniac103/egit-github/tree/master/org.eclipse.egit.github.core)
* [HoloColorPicker](https://github.com/LarsWerkman/HoloColorPicker)
* [ProgressFragment](https://github.com/johnkil/Android-ProgressFragment)
* [PreferenceFragment](https://github.com/kolavar/android-support-v4-preferencefragment)
* [SmoothProgressBar](https://github.com/castorflex/SmoothProgressBar)
* [FloatingActionButton](https://github.com/shamanland/floating-action-button)

Contributions
-------------
* [kageiit](https://github.com/kageiit) - Improvements and bug fixes
* [maniac103](https://github.com/maniac103) - Improvements, bug fixes and new features
* [ARoiD](https://github.com/ARoiD) - Testing
* [extremis (Steven Mautone)](https://github.com/extremis) - OctoDroid name and the new icon
* [zquestz](https://github.com/zquestz) - Thanks for the application icon
* [cketti](https://github.com/cketti)


This Fork
-------------

### Videocapture

https://youtu.be/T3gaSyV83ZY

### To submit

https://classroom.github.com/assignment-invitations/08c98ff0aefcbf7c987f71b661595838 

### Clone

```shell
$ git clone https://github.com/DeLaSalleUniversity-Manila/gh4a
Cloning into 'gh4a'...
remote: Counting objects: 15556, done.
remote: Total 15556 (delta 0), reused 0 (delta 0), pack-reused 15556
Receiving objects: 100% (15556/15556), 13.36 MiB | 117 KiB/s, done.
Resolving deltas: 100% (9528/9528), done.
```

### Tasks
```shell
$ ./gradlew tasks
Download https://maven.fabric.io/public/io/fabric/tools/gradle/1.21.0/gradle-1.21.0.pom
Download https://maven.fabric.io/public/io/fabric/tools/gradle/1.21.0/gradle-1.21.0.jar
signing.properties not found or incomplete
Download https://repo1.maven.org/maven2/com/larswerkman/HoloColorPicker/1.4/HoloColorPicker-1.4.pom
Download https://repo1.maven.org/maven2/com/github/johnkil/android-progressfragment/progressfragment/1.4.0/progressfragment-1.4.0.pom
Download https://github.com/kolavar/android-support-v4-preferencefragment/raw/master/maven-repository/com/android/support/support-v4-preferencefragment/1.0.0/support-v4-preferencefragment-1.0.0.pom
Download https://repo1.maven.org/maven2/org/apmem/tools/layouts/1.9/layouts-1.9.pom
Download https://repo1.maven.org/maven2/com/squareup/okhttp/okhttp/1.5.4/okhttp-1.5.4.pom
Download https://repo1.maven.org/maven2/com/squareup/okhttp/parent/1.5.4/parent-1.5.4.pom
Download https://repo1.maven.org/maven2/org/ocpsoft/prettytime/prettytime/3.2.4.Final/prettytime-3.2.4.Final.pom
Download https://repo1.maven.org/maven2/org/ocpsoft/prettytime/prettytime-parent/3.2.4.Final/prettytime-parent-3.2.4.Final.pom
Download https://repo1.maven.org/maven2/org/ocpsoft/ocpsoft-parent/9/ocpsoft-parent-9.pom
Download https://repo1.maven.org/maven2/com/shamanland/fab/0.0.6/fab-0.0.6.pom
Download https://repo1.maven.org/maven2/com/github/castorflex/smoothprogressbar/library/1.0.0/library-1.0.0.pom
Download https://repo1.maven.org/maven2/com/nineoldandroids/library/2.4.0/library-2.4.0.pom
Download https://repo1.maven.org/maven2/com/nineoldandroids/parent/2.4.0/parent-2.4.0.pom
Download https://maven.fabric.io/public/com/crashlytics/sdk/android/crashlytics/2.4.0/crashlytics-2.4.0.pom
Download https://maven.fabric.io/public/io/fabric/sdk/android/fabric/1.3.4/fabric-1.3.4.pom
Download https://maven.fabric.io/public/com/crashlytics/sdk/android/crashlytics-core/2.3.3/crashlytics-core-2.3.3.pom
Download https://maven.fabric.io/public/com/crashlytics/sdk/android/beta/1.1.3/beta-1.1.3.pom
Download https://maven.fabric.io/public/com/crashlytics/sdk/android/answers/1.2.2/answers-1.2.2.pom
Download https://repo1.maven.org/maven2/com/larswerkman/HoloColorPicker/1.4/HoloColorPicker-1.4.aar
Download https://repo1.maven.org/maven2/com/github/johnkil/android-progressfragment/progressfragment/1.4.0/progressfragment-1.4.0.aar
Download https://github.com/kolavar/android-support-v4-preferencefragment/raw/master/maven-repository/com/android/support/support-v4-preferencefragment/1.0.0/support-v4-preferencefragment-1.0.0.aar
Download https://repo1.maven.org/maven2/org/apmem/tools/layouts/1.9/layouts-1.9.aar
Download https://repo1.maven.org/maven2/com/squareup/okhttp/okhttp/1.5.4/okhttp-1.5.4.jar
Download https://repo1.maven.org/maven2/org/ocpsoft/prettytime/prettytime/3.2.4.Final/prettytime-3.2.4.Final.jar
Download https://repo1.maven.org/maven2/com/shamanland/fab/0.0.6/fab-0.0.6.aar
Download https://repo1.maven.org/maven2/com/github/castorflex/smoothprogressbar/library/1.0.0/library-1.0.0.aar
Download https://repo1.maven.org/maven2/com/nineoldandroids/library/2.4.0/library-2.4.0.jar
Download https://maven.fabric.io/public/io/fabric/sdk/android/fabric/1.3.4/fabric-1.3.4.aar
Download https://maven.fabric.io/public/com/crashlytics/sdk/android/answers/1.2.2/answers-1.2.2.aar
Download https://maven.fabric.io/public/com/crashlytics/sdk/android/crashlytics-core/2.3.3/crashlytics-core-2.3.3.aar
Download https://maven.fabric.io/public/com/crashlytics/sdk/android/beta/1.1.3/beta-1.1.3.aar
Download https://maven.fabric.io/public/com/crashlytics/sdk/android/crashlytics/2.4.0/crashlytics-2.4.0.aar
:tasks

------------------------------------------------------------
All tasks runnable from root project - Injects the build id used by the Fabric SDK.
------------------------------------------------------------

Android tasks
-------------
androidDependencies - Displays the Android dependencies of the project
signingReport - Displays the signing info for each variant

Build tasks
-----------
assemble - Assembles all variants of all applications and secondary packages.
assembleDebug - Assembles all Debug builds
assembleDebugTest - Assembles the Test build for the Debug build
assembleRelease - Assembles all Release builds
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
clean - Deletes the build directory.

Build Setup tasks
-----------------
init - Initializes a new Gradle build. [incubating]
wrapper - Generates Gradle wrapper files. [incubating]

Help tasks
----------
components - Displays the components produced by root project 'gh4a'. [incubating]
dependencies - Displays all dependencies declared in root project 'gh4a'.
dependencyInsight - Displays the insight into a specific dependency in root project 'gh4a'.
help - Displays a help message.
projects - Displays the sub-projects of root project 'gh4a'.
properties - Displays the properties of root project 'gh4a'.
tasks - Displays the tasks runnable from root project 'gh4a'.

Install tasks
-------------
installDebug - Installs the Debug build
installDebugTest - Installs the Test build for the Debug build
uninstallAll - Uninstall all applications.
uninstallDebug - Uninstalls the Debug build
uninstallDebugTest - Uninstalls the Test build for the Debug build
uninstallRelease - Uninstalls the Release build

Verification tasks
------------------
check - Runs all checks.
connectedAndroidTest - Installs and runs the tests for Build 'debug' on connected devices.
connectedCheck - Runs all device checks on currently connected devices.
deviceCheck - Runs all device checks using Device Providers and Test Servers.
lint - Runs lint on all variants.
lintDebug - Runs lint on the Debug build
lintRelease - Runs lint on the Release build

Other tasks
-----------
compileDebugSources
compileDebugTestSources
compileReleaseSources
crashlyticsUploadDistributionDebug - Uploads an APK to Crashlytics for distribution.
crashlyticsUploadDistributionRelease - Uploads an APK to Crashlytics for distribution.

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.

To see all tasks and more detail, run with --all.

BUILD SUCCESSFUL

Total time: 6 mins 48.188 secs
```


### Build

```shell
$ ./gradlew assembleDebug
signing.properties not found or incomplete
:preBuild
:compileDebugNdk
:preDebugBuild
:checkDebugManifest
:preReleaseBuild
:prepareComAndroidSupportAppcompatV72211Library
:prepareComAndroidSupportCardviewV72211Library
:prepareComAndroidSupportSupportV42211Library
:prepareComAndroidSupportSupportV4Preferencefragment100Library
:prepareComCrashlyticsSdkAndroidAnswers122Library
:prepareComCrashlyticsSdkAndroidBeta113Library
:prepareComCrashlyticsSdkAndroidCrashlytics240Library
:prepareComCrashlyticsSdkAndroidCrashlyticsCore233Library
:prepareComGithubCastorflexSmoothprogressbarLibrary100Library
:prepareComGithubJohnkilAndroidProgressfragmentProgressfragment140Library
:prepareComLarswerkmanHoloColorPicker14Library
:prepareComShamanlandFab006Library
:prepareIoFabricSdkAndroidFabric134Library
:prepareOrgApmemToolsLayouts19Library
:prepareDebugDependencies
:compileDebugAidl
:compileDebugRenderscript
:generateDebugBuildConfig
:generateDebugAssets UP-TO-DATE
:mergeDebugAssets
:generateDebugResValues
:generateDebugResources
:mergeDebugResources
/home/cobalt/AndroidStudioProjects/gh4a/res/drawable-xxhdpi/octodroid.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/gh4a/res/drawable-xhdpi/octodroid.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
:processDebugManifest
:fabricGenerateResourcesDebug
:processDebugResources
:generateDebugSources
:compileDebugJava
Note: /home/cobalt/AndroidStudioProjects/gh4a/src/com/gh4a/activities/WebViewerActivity.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: Some input files use unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
:preDexDebug
:dexDebug
:processDebugJavaRes UP-TO-DATE
:validateDebugSigning
:packageDebug
:zipalignDebug
:assembleDebug

BUILD SUCCESSFUL

Total time: 5 mins 6.819 secs
```

### Install
```shell
$ ./gradlew installDebug
signing.properties not found or incomplete
:preBuild
:compileDebugNdk UP-TO-DATE
:preDebugBuild
:checkDebugManifest
:preReleaseBuild
:prepareComAndroidSupportAppcompatV72211Library UP-TO-DATE
:prepareComAndroidSupportCardviewV72211Library UP-TO-DATE
:prepareComAndroidSupportSupportV42211Library UP-TO-DATE
:prepareComAndroidSupportSupportV4Preferencefragment100Library UP-TO-DATE
:prepareComCrashlyticsSdkAndroidAnswers122Library UP-TO-DATE
:prepareComCrashlyticsSdkAndroidBeta113Library UP-TO-DATE
:prepareComCrashlyticsSdkAndroidCrashlytics240Library UP-TO-DATE
:prepareComCrashlyticsSdkAndroidCrashlyticsCore233Library UP-TO-DATE
:prepareComGithubCastorflexSmoothprogressbarLibrary100Library UP-TO-DATE
:prepareComGithubJohnkilAndroidProgressfragmentProgressfragment140Library UP-TO-DATE
:prepareComLarswerkmanHoloColorPicker14Library UP-TO-DATE
:prepareComShamanlandFab006Library UP-TO-DATE
:prepareIoFabricSdkAndroidFabric134Library UP-TO-DATE
:prepareOrgApmemToolsLayouts19Library UP-TO-DATE
:prepareDebugDependencies
:compileDebugAidl UP-TO-DATE
:compileDebugRenderscript UP-TO-DATE
:generateDebugBuildConfig UP-TO-DATE
:generateDebugAssets UP-TO-DATE
:mergeDebugAssets UP-TO-DATE
:generateDebugResValues UP-TO-DATE
:generateDebugResources UP-TO-DATE
:mergeDebugResources UP-TO-DATE
:processDebugManifest UP-TO-DATE
:fabricGenerateResourcesDebug
:processDebugResources
:generateDebugSources
:compileDebugJava UP-TO-DATE
:preDexDebug UP-TO-DATE
:dexDebug UP-TO-DATE
:processDebugJavaRes UP-TO-DATE
:validateDebugSigning
:packageDebug
:zipalignDebug
:assembleDebug
:installDebug
Installing APK 'gh4a-debug.apk' on 'X330 - 4.4.4'
Installed on 1 device.

BUILD SUCCESSFUL

Total time: 50.72 secs
```
