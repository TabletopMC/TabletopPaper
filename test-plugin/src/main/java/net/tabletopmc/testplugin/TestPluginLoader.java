package net.tabletopmc.testplugin;

import io.papermc.paper.plugin.loader.PluginClasspathBuilder;
import io.papermc.paper.plugin.loader.PluginLoader;
import io.papermc.paper.plugin.loader.library.impl.MavenLibraryResolver;

class TestPluginLoader implements PluginLoader {
  @Override
  public void classloader(PluginClasspathBuilder builder) {
    final MavenLibraryResolver maven = new MavenLibraryResolver();
    maven.addRepositoryUrl("https://maven.miles.sh/snapshots");
    maven.addDependencyCoords("sh.miles.menukit:menukit-core:1.0.0-SNAPSHOT");
    maven.addDependencyCoords("sh.miles.menukit:menukit-strings:1.3.0-SNAPSHOT");
    builder.addLibrary(maven);
  }
}
