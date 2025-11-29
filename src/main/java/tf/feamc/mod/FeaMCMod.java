package tf.feamc.mod;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class FeaMCMod
{
	public static final Identifier IDENTIFIER = Identifier.of("feastmc", "compatible_chests");
	public static final TagKey<BlockEntityType<?>> COMPATIBLE_CHEST_BLOCK_ENTITIES = TagKey.of(RegistryKeys.BLOCK_ENTITY_TYPE, IDENTIFIER);
	public static final TagKey<Block> COMPATIBLE_CHEST_BLOCKS = TagKey.of(RegistryKeys.BLOCK, IDENTIFIER);
}
