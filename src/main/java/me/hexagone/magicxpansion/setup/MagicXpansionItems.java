package me.hexagone.magicxpansion.setup;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public final class MagicXpansionItems {

    private MagicXpansionItems() {}

    public static final SlimefunItemStack MagicLump4Item = new SlimefunItemStack("MX_MAGIC_LUMP_4", Material.GOLD_NUGGET, "&6Magical Lump &7- &eIV", "", "&c&oTier: IV");
    public static final SlimefunItemStack MagicLump5Item = new SlimefunItemStack("MX_MAGIC_LUMP_5", Material.GOLD_NUGGET, "&6Magical Lump &7- &eV", "", "&c&oTier: V");
    public static final SlimefunItemStack EnderLump4Item = new SlimefunItemStack("MX_ENDER_LUMP_4", Material.GOLD_NUGGET, "&5Ender Lump &7- &eIV", "", "&c&oTier: IV");
    public static final SlimefunItemStack EnderLump5Item = new SlimefunItemStack("MX_ENDER_LUMP_5", Material.GOLD_NUGGET, "&5Ender Lump &7- &eV", "", "&c&oTier: V");

    public static final SlimefunItemStack ArcaniumOreItem = new SlimefunItemStack("ARCANIUM_ORE",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E2ZGNmMjc1Y2Y1OGM2NGNhN2I0ZDFmYzRlYTAwOWEyYjU2OTk1ZjUxYjU0OTg3NGJhNzg5ODZjZGVhYjdkMyJ9fX0=",
            "&cArcanium Ore", "&7You can smelt this into an Ingot in a Smeltery");
    public static final SlimefunItemStack ArcaniumIngotItem = new SlimefunItemStack("ARCANIUM_INGOT", Material.NETHER_BRICK, "&c&lArcanium Ingot");

    public static final SlimefunItemStack ReinforcedShulkerShellItem = new SlimefunItemStack("REINFORCED_SHULKER_SHELL", Material.SHULKER_SHELL, "&6Reinforced Shulker Shell", "", "&aForged from the strongest of material,", "&athis Shulker Shell is almost unbreakable.");
    public static final SlimefunItemStack ReinforcedShulkerBoxItem = new SlimefunItemStack("REINFORCED_SHULKER_BOX", Material.SHULKER_BOX, "&5&lReinforced Shulker Box", "", "&a6-row storage", "&aBlast-resistant");

    public static final SlimefunItemStack ShulkerAlloyItem = new SlimefunItemStack("SHULKER_ALLOY", Material.IRON_INGOT, "&dShulkerium Alloy Ingot",
            "", "&aThis highly radioactive ingot is almost as durable as netherite.", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);

    static {
        ShulkerAlloyItem.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ShulkerAlloyItem.addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public static final SlimefunItemStack RefinedShulkerAlloyItem = new SlimefunItemStack("REFINED_SHULKER_ALLOY",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTQwZGUxZmIxNDdkM2U1YjU3YzVkMjcxMTRkMzRjNjZkMDM4MDQzOWEzZjE4ZTA4OGJjZjQ3YzViMjM3YTcwZCJ9fX0=",
            "&d&lEnriched Shulkerium Alloy", "", "&aForged by the Ancient Spirits of the &bOverworld&a, &cUnderworld&a, and &dEnd &adimensions,",
            "&athis chunk of alloy is &l5 times &r&astronger than netherite.", "", LoreBuilder.radioactive(Radioactivity.VERY_DEADLY), LoreBuilder.HAZMAT_SUIT_REQUIRED);

    static {
        RefinedShulkerAlloyItem.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        RefinedShulkerAlloyItem.addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public static final SlimefunItemStack KnowledgeVessel = new SlimefunItemStack("VESSEL_OF_KNOWLEDGE",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRhMTUxYTQ2OWQzMjA2ZWUwNmFkZTczMWFmZDNjZDE1N2I1ZmI0Nzg5OTdiY2Y5MGMyNDBiMGJkNmMyNjliYyJ9fX0=",
            "&c&lVessel of Knowledge", "", "&fAllows you to store some of", "&fyour Experience in a Bottle", "&7Cost: &a16 Levels", "&aReusable.");

    public static final SlimefunItemStack FilledKnowledgeVessel = new SlimefunItemStack("FILLED_VESSEL_OF_KNOWLEDGE",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzA1NGMyOWM3ODA5MDQ3MWMxZWEwNThiZDY0MTg5NzM5MWM5ZTQ2OTRhYTlkMTQwYWZiYmE4ZDBjYzQzNjM3In19fQ==",
            "&a&lVessel of Knowledge");

    static {
        FilledKnowledgeVessel.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        FilledKnowledgeVessel.addFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public static final SlimefunItemStack InfinityCrossbowItem = new SlimefunItemStack("INFINITY_CROSSBOW", Material.CROSSBOW, "&6Crossbow of Infinity", "", "&aNever runs out of arrows.");

    static {
        InfinityCrossbowItem.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
    }

    public static final SlimefunItemStack RapidCrossbowItem = new SlimefunItemStack("RAPID_CROSSBOW", Material.CROSSBOW, "&6Crossbow of Rapidity", "", "&aShoots at unparallelled speeds.");

    static {
        RapidCrossbowItem.addUnsafeEnchantment(Enchantment.QUICK_CHARGE, 4);
        RapidCrossbowItem.addUnsafeEnchantment(Enchantment.PIERCING, 5);
    }
}
