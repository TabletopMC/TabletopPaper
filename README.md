# Tabletop Paper

## What is this?

This is a [Paper](https://github.com/PaperMC/Paper) fork made by [Strokkur24](https://github.com/Strokkur424) with one single goal:
improve the developer experience for anyone developing Minecraft plugins! This project adds various improvements ontop of the
Paper API (and a few quality-of-life server improvements as well!) with the single goal of making stuff easier or more convenient.

A full list of improvements will be documented soon.

One feature unique to Tabletop is the [TabletopPatcher](https://github.com/TabletopMC/TabletopPatcher) Gradle plugin. This plugin
allows plugins compiled against the TabletopPaper API to be crosscompiled for regular Paper. This is achieved by rewriting and
including various utility methods from the Tabletop-API directly inside your Paper plugin, allowing you to enjoy the Tabletop
development experience, whilst keeping your plugin compatible with Paper! See [TabletopPatcher](https://github.com/TabletopMC/TabletopPatcher)
for more details.

## Using the API

To depend on the TabletopPaper API, add the dependency to your `build.gradle.kts` file.
If you are not using [TabletopPatcher](https://github.com/TabletopMC/TabletopPatcher), you will
additionally need to include the Eldonexus Maven repo, where our API artifacts are hosted.

```kts
repositories {
  // Not required with the tabletop-patcher Gradle plugin
  maven("https://eldonexus.de/repository/maven-public/")
}

dependencies { 
  compileOnly("net.tabletopmc.tabletop:tabletop-api:26.1.1-SNAPSHOT")
}
```

## Compiling

### Requirements

TabletopPaper requires an installation of **Java 25**. You can follow the [PaperMC Java Installation Docs](https://docs.papermc.io/misc/java-install/)
for a guide on how to obtain Java 25.

### Building

First, obtain a local copy of the project files. This can be done either by downloading the [code zip](https://github.com/TabletopMC/TabletopPaper/archive/refs/heads/main.zip)
or running the following git command:

```bash
git clone https://github.com/TabletopMC/TabletopPaper.git
cd TabletopPaper
```

If you haven't already, open a terminal inside the root directory of the project. Continue by running the following commands:

```bash
./gradlew applyAllPatches
./gradlew createPaperclipJar
```

This may take a few minutes depending on your internet connection and your PC's hardware.

After everything has finished, you can find the built paperclip JAR inside the `./tabletop-server/build/libs` directory.
