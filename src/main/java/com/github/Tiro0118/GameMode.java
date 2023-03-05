package com.github.Tiro0118;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class GameMode extends JavaPlugin {

    public static GameMode instance;

    public GameMode() {
        instance = this;
    }

    public static GameMode getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(" §3__");
        getLogger().info("§b|__) §3|     §aGameMode §9v1.0.0");
        getLogger().info("§b|    §3|___  §8Running on Bukkit");
        getLogger().info(" ");
        getLogger().info("Configを読み込み中...");
        getLogger().info("正常に処理が完了しました");

        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("プラグインを停止しています...");
        getLogger().info("正常に処理が完了しました");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("gm")) {
                if (args.length == 0) {
                    if (!player.hasPermission("gm.help"))
                        for (String line : GameMode.getInstance().getConfig().getStringList("Help.Help1")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    else {
                        for (String line : GameMode.getInstance().getConfig().getStringList("Help.Help2")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    }
                }
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("0")) {
                        if (!player.hasPermission("gm.survival"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Error")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            player.setGameMode(org.bukkit.GameMode.SURVIVAL);
                            for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.SURVIVAL")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        }
                    }
                    if (args[0].equalsIgnoreCase("survival")) {
                        if (!player.hasPermission("gm.survival"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Error")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            player.setGameMode(org.bukkit.GameMode.SURVIVAL);
                            for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.SURVIVAL")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        }
                    }
                    if (args[0].equalsIgnoreCase("1")) {
                        if (!player.hasPermission("gm.creative"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Error")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            player.setGameMode(org.bukkit.GameMode.CREATIVE);
                            for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.CREATIVE")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        }
                    }
                    if (args[0].equalsIgnoreCase("creative")) {
                        if (!player.hasPermission("gm.creative"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Error")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            player.setGameMode(org.bukkit.GameMode.CREATIVE);
                            for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.CREATIVE")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        }
                    }
                    if (args[0].equalsIgnoreCase("2")) {
                        if (!player.hasPermission("gm.adventure"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Error")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            player.setGameMode(org.bukkit.GameMode.ADVENTURE);
                            for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.ADVENTURE")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        }
                    }
                    if (args[0].equalsIgnoreCase("adventure")) {
                        if (!player.hasPermission("gm.adventure"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Error")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            player.setGameMode(org.bukkit.GameMode.ADVENTURE);
                            for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.ADVENTURE")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        }
                    }
                    if (args[0].equalsIgnoreCase("3")) {
                        if (!player.hasPermission("gm.spectator"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Error")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            player.setGameMode(org.bukkit.GameMode.SPECTATOR);
                            for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.SPECTATOR")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        }
                    }
                    if (args[0].equalsIgnoreCase("spectator")) {
                        if (!player.hasPermission("gm.spectator"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Error")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            player.setGameMode(org.bukkit.GameMode.SPECTATOR);
                            for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.SPECTATOR")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        }
                    }
                    if (args[0].equalsIgnoreCase("help")) {
                        if (!player.hasPermission("gm.help"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Help1")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Help2")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        }
                    }
                    if (args[0].equalsIgnoreCase("reload")) {
                        if (!player.hasPermission("gm.reload"))
                            for (String line : GameMode.getInstance().getConfig().getStringList("Help.Error")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                            }
                        else {
                            this.reloadConfig();
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&b&lG&3&lM&8] &eConfigを再読み込みしました"));
                        }
                    }
                }
            }
            if (cmd.getName().equalsIgnoreCase("survival")) {
                if (args.length == 0) {
                    if (!player.hasPermission("gm.survival"))
                        for (String line : GameMode.getInstance().getConfig().getStringList("Help.Help1")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    else {
                        player.setGameMode(org.bukkit.GameMode.SURVIVAL);
                        for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.SURVIVAL")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    }
                }
            }
            if (cmd.getName().equalsIgnoreCase("creative")) {
                if (args.length == 0) {
                    if (!player.hasPermission("gm.creative"))
                        for (String line : GameMode.getInstance().getConfig().getStringList("Help.Help1")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    else {
                        player.setGameMode(org.bukkit.GameMode.CREATIVE);
                        for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.CREATIVE")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    }
                }
            }
            if (cmd.getName().equalsIgnoreCase("adventure")) {
                if (args.length == 0) {
                    if (!player.hasPermission("gm.adventure"))
                        for (String line : GameMode.getInstance().getConfig().getStringList("Help.Help1")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    else {
                        player.setGameMode(org.bukkit.GameMode.ADVENTURE);
                        for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.ADVENTURE")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    }
                }
            }
            if (cmd.getName().equalsIgnoreCase("spectator")) {
                if (args.length == 0) {
                    if (!player.hasPermission("gm.spectator"))
                        for (String line : GameMode.getInstance().getConfig().getStringList("Help.Help1")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    else {
                        player.setGameMode(org.bukkit.GameMode.SPECTATOR);
                        for (String line : GameMode.getInstance().getConfig().getStringList("GameMode.SPECTATOR")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                        }
                    }
                }
            }
        }
        return true;
    }
}