package com.nightmare;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public final class IO {

    public static final HashMap<String, String> HashMapOfMessages = new HashMap<String, String>();
    public static final HashMap<String, String> HashMapOfSettings = new HashMap<String, String>();

    public static final void GenerateDataFolder(Plugin plugin) throws IOException {
        
        if (!plugin.getDataFolder().exists())
            plugin.getDataFolder().mkdir();

    }

    public static final void GenerateMessages(Plugin plugin) throws IOException {

        if (!plugin.getDataFolder().exists())
            throw new IOException("No existing data folder.");

        File messages = new File(plugin.getDataFolder(), "messages.yml");
        
        messages.createNewFile();

        if (!messages.exists())
            throw new IOException("messages.yml does not exist.");

        Path messagesPath = Paths.get(messages.getAbsolutePath());

        String dataMessages= """

        # messages.yml

        #This is the Nightmare core messaging configuration file.
        #If you want to configure something you must do it with its corresponding values.

        perm: "&cYou not have permission to do that."
        """;

        Files.writeString(messagesPath, dataMessages);

    }   

    public static final void GenerateSettings(Plugin plugin) throws IOException {
        
        if (!plugin.getDataFolder().exists())
            throw new IOException("No existing data folder.");

        File settings = new File(plugin.getDataFolder(), "settings.yml");    

        settings.createNewFile();

        if (!settings.exists())
            throw new IOException("settings.yml does not exist.");

        Path settingsPath = Paths.get(settings.getAbsolutePath());

        String dataSettings= """                                        
        
        # settings.yml

        #This is the main configuration file for the nightmare core.
        #If you want to configure something, you must do so with its corresponding values.

        #If you want to use gradients you can find them at https://www.birdflop.com/resources/rgb/

        #Hex Color 1: #FB0202
        #Hex Color 2: #FDBA0F

        prefix: "&x&f&b&0&2&0&2&lN&x&f&b&0&b&0&b&li&x&f&b&1&3&1&3&lg&x&f&b&1&c&1&c&lh&x&f&c&2&4&2&4&lt&x&f&c&2&d&2&d&lm&x&f&c&3&5&3&5&la&x&f&c&3&e&3&e&lr&x&f&c&4&6&4&6&le &x&f&c&4&f&4&f&lC&x&f&d&5&7&5&7&lo&x&f&d&6&0&6&0&lr&x&f&d&6&8&6&8&le &x&f&d&7&1&7&1&l☠ &r"

        # Scoreboard

        #Placeholders of the scoreboard:

            # %player% -> player name 
            # %online% -> online players
            # %location% -> player location

            #You can use any PlaceHolderAPI expansion.

        scoreboard:

            enable: true

            name: " &4☠ &x&f&b&0&a&0&a&lN&x&f&b&1&2&1&2&li&x&f&b&1&a&1&a&lg&x&f&c&2&2&2&2&lh&x&f&c&2&a&2&a&lt&x&f&c&3&2&3&2&lm&x&f&c&3&a&3&a&la&x&f&c&4&1&4&1&lr&x&f&c&4&9&4&9&le &x&f&c&5&1&5&1&lC&x&f&d&5&9&5&9&lo&x&f&d&6&1&6&1&lr&x&f&d&6&9&6&9&le &4☠ "

            lines:

                - ""
                - " &c&l⛏ &cPlayer: &f%player%"
                - " &c&l⚡ &cOnline: &f%online%"
                - " &c&l⭐ &cLocation: &f%location%"
                - ""

        # Join / Leave Messages

            #You can use any PlaceHolderAPI expansion.

        join_and_leave:
        
            enable: true

            join: "Welcome &c%player_name% &fto the &4Nightmare World&r."
            leave: "&c%player_name% &fleft the &4Nightmare World&r."    

        # Tablist

        tablist:

            enable: true

            header: "&x&f&b&0&2&0&2&lN&x&f&b&1&0&0&3&li&x&f&b&1&e&0&4&lg&x&f&b&2&c&0&5&lh&x&f&c&3&b&0&6&lt&x&f&c&4&9&0&7&lm&x&f&c&5&7&0&8&la&x&f&c&6&5&0&9&lr&x&f&c&7&3&0&a&le &x&f&c&8&1&0&b&lC&x&f&d&9&0&0&c&lo&x&f&d&9&e&0&d&lr&x&f&d&a&c&0&e&le &x&f&d&b&a&0&f&l☠&r"
            footer: "Welcome &c%player_name% &fto the &4Nightmare World ☠&r."

        # Motd
        
        motd:

            enable: true

            lines: 

                - "&4☠ &x&f&b&0&a&0&a&lN&x&f&b&1&2&1&2&li&x&f&b&1&a&1&a&lg&x&f&c&2&2&2&2&lh&x&f&c&2&a&2&a&lt&x&f&c&3&2&3&2&lm&x&f&c&3&a&3&a&la&x&f&c&4&1&4&1&lr&x&f&c&4&9&4&9&le &x&f&c&5&1&5&1&lC&x&f&d&5&9&5&9&lo&x&f&d&6&1&6&1&lr&x&f&d&6&9&6&9&le &4☠&r"
                - "&c&lWelcome to the eternal &4&lnightmare ☠&r."

        # Join Message

        message_join:

            enable: true

            title: "&4☠ &x&f&b&0&a&0&a&lN&x&f&b&1&2&1&2&li&x&f&b&1&a&1&a&lg&x&f&c&2&2&2&2&lh&x&f&c&2&a&2&a&lt&x&f&c&3&2&3&2&lm&x&f&c&3&a&3&a&la&x&f&c&4&1&4&1&lr&x&f&c&4&9&4&9&le &x&f&c&5&1&5&1&lC&x&f&d&5&9&5&9&lo&x&f&d&6&1&6&1&lr&x&f&d&6&9&6&9&le &4☠"

            lines:

                - ""
                - "&fHey, &c%player_name% &fwelcome to the &4Nightmare World&r."
                - "&fVisit our development &cDiscord: &4https://discord.com/invite/DWfuQRsxwb&r."
                - ""

        config:
        
            player:

                display_health: true

            mobs:

                # name_c -> Name of the tier c mob.
                # name_b -> Name of the tier b mob.
                # name_a -> Name of the tier a mob.

                zombie: 

                    name_c: "&c&lNightmare Zombie &4☠&4 Tier C"
                    name_b: "&c&lNightmare Zombie &4☠&e Tier B"
                    name_a: "&c&lNightmare Zombie &4☠&a Tier A"

                creeper:
                
                    name_c: "&c&lNightmare Creeper &4☠&4 Tier C"
                    name_b: "&c&lNightmare Creeper &4☠&e Tier B"
                    name_a: "&c&lNightmare Creeper &4☠&a Tier A"

                spider:
                
                    name_c: "&c&lNightmare Spider &4☠&4 Tier C"
                    name_b: "&c&lNightmare Spider &4☠&e Tier B"
                    name_a: "&c&lNightmare Spider &4☠&a Tier A"

                skeleton:
                
                    name_c: "&c&lNightmare Skeleton &4☠&4 Tier C"
                    name_b: "&c&lNightmare Skeleton &4☠&e Tier B"
                    name_a: "&c&lNightmare Skeleton &4☠&a Tier A"

                enderman:
                
                    name_c: "&c&lNightmare Enderman &4☠&4 Tier C"
                    name_b: "&c&lNightmare Enderman &4☠&e Tier B"
                    name_a: "&c&lNightmare Enderman &4☠&a Tier A"

        """;

        Files.writeString(settingsPath, dataSettings);

    }

    public static final void SubmitMessages(Plugin plugin) throws IOException {

        File messages = new File(plugin.getDataFolder(), "messages.yml");

        if (!messages.exists())
            throw new IOException("messages.yml does not exist.");

        YamlConfiguration config = YamlConfiguration.loadConfiguration(messages);    

        if (config.getString("perm") == null)
            throw new IOException("perm not found in messages.yml.");

        HashMapOfMessages.put("perm", config.getString("perm").toString());    

    }

    public static final void SubmitSettings(Plugin plugin) throws IOException {

        File settings = new File(plugin.getDataFolder(), "settings.yml");

        if (!settings.exists())
            throw new IOException("settings.yml does not exist.");

        YamlConfiguration config = YamlConfiguration.loadConfiguration(settings);    

        if (config.getString("prefix") == null)
            throw new IOException("prefix not found in settings.yml.");

        HashMapOfSettings.put("prefix", config.getString("prefix").toString());    

    }

    public static final void reloadSettings(Plugin plugin) throws IOException {
        
        File settings = new File(plugin.getDataFolder(), "settings.yml");

        if (!settings.exists())
            throw new IOException("settings.yml does not exist.");

        YamlConfiguration config = YamlConfiguration.loadConfiguration(settings); 

        HashMapOfSettings.clear();  

        if (config.getString("prefix") == null)
            throw new IOException("prefix not found in settings.yml.");

        HashMapOfSettings.put("prefix", config.getString("prefix").toString());


    }

    public static final void reloadMessages(Plugin plugin) throws IOException {
        
        File messages = new File(plugin.getDataFolder(), "messages.yml");

        if (!messages.exists())
            throw new IOException("messages.yml does not exist.");
        
        YamlConfiguration config = YamlConfiguration.loadConfiguration(messages);   
        
        HashMapOfMessages.clear();

        if (config.getString("perm") == null)
            throw new IOException("perm not found in messages.yml.");

        HashMapOfMessages.put("perm", config.getString("perm").toString());   

    }
    
}
