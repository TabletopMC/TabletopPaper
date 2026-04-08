package net.tabletopmc.testplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin implements Listener {
  @Override
  public void onEnable() {
    this.getServer().getPluginManager().registerEvents(this, this);
    this.registerCommand("test", (ctx, _) -> {
      ctx.getSender().sendRichMessage("<dark_purple>This is heaven.");
    });
  }
}
