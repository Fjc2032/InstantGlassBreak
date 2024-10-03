package me.Fjc.instantglassbreak;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

import me.Fjc.instantglassbreak.InstantGlassBreak;

public class InstantGlassBreakEnchantment extends Enchantment {
    private final NamespacedKey key;

    public InstantGlassBreakEnchantment(NamespacedKey key) {
        super();
        this.key = key;
    }

    @Override
    public String getName() {
        return "Glassbreaker";
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.TOOL;
    }

    @Override
        public boolean conflictsWith(Enchantment other) {
        return other == Enchantment.LOOT_BONUS_BLOCKS; //Enchantment will not be compatible with Fortune
    }


    @Override
    public boolean canEnchantItem(ItemStack item) {
        return item.getType().toString().endsWith("_PICKAXE");
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public NamespacedKey getKey() {
        return key;
    }

    @Override
    public String getTranslationKey() {
        return "enchantment.instantglassbreak.glassbreaker";
    }
}
