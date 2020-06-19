package me.thepronoobkq.tutorial.util;

import me.thepronoobkq.tutorial.TutorialMod;
import net.minecraft.item.Item;

public class RegistryUtil {
	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(TutorialMod.MODID, name);
		return item;
	}
}
