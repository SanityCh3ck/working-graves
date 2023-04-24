package net.stone_labs.workinggraves.compat;

import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;

public abstract class InventoryExtension {

    public abstract List<ItemStack> getItems(ServerPlayerEntity player);
}
