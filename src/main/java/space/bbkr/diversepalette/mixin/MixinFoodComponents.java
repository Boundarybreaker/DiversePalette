package space.bbkr.diversepalette.mixin;

import javax.annotation.Nullable;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

@Mixin(FoodComponents.class)
public class MixinFoodComponents {
	@Shadow
	@Final
	@Mutable
	public static final FoodComponent ROTTEN_FLESH = new FoodComponent.Builder()
			.hunger(1)
			.saturationModifier(0F)
			.alwaysEdible()
			.snack()
			.statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 9), 1.0F)
			.build();

	@Shadow
	@Final
	@Mutable
	public static final FoodComponent COOKIE = new FoodComponent.Builder()
			.hunger(2)
			.saturationModifier(0.1F)
			.alwaysEdible()
			.snack()
			.statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 150, 1), 1.0F)
			.build();

	@Shadow
	@Final
	@Mutable
	public static final FoodComponent COOKED_BEEF = new FoodComponent.Builder()
			.hunger(8)
			.saturationModifier(0.8F)
			.meat()
			.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200), 1.0F)
			.build();

	@Shadow
	@Final
	@Mutable
	public static final FoodComponent PUMPKIN_PIE = new FoodComponent.Builder()
			.hunger(8)
			.saturationModifier(0.3F)
			.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 200), 1.0F)
			.build();

	@Shadow
	@Final
	@Mutable
	public static final FoodComponent COOKED_RABBIT = new FoodComponent.Builder()
			.hunger(5)
			.saturationModifier(0.6F)
			.meat()
			.statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 1), 1.0F)
			.build();

	@Shadow
	@Final
	@Mutable
	public static final FoodComponent RABBIT_STEW = new FoodComponent.Builder()
			.hunger(10)
			.saturationModifier(0.6F)
			.statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 300, 1), 1.0F)
			.build();

	@Shadow
	@Final
	@Mutable
	public static final FoodComponent COOKED_COD = new FoodComponent.Builder()
			.hunger(5)
						.saturationModifier(0.6F)
						.statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 200, 1), 1.0F)
			.build();

	@Shadow
	@Final
	@Nullable
	public static final FoodComponent COOKED_SALMON = new FoodComponent.Builder()
			.hunger(6)
			.saturationModifier(0.8F)
			.statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 250, 1), 1.0F)
			.build();

	@Shadow
	@Final
	@Nullable
	public static final FoodComponent COOKED_CHICKEN = new FoodComponent.Builder()
			.hunger(6)
			.saturationModifier(0.6F)
			.meat()
			.statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 100, 1), 1.0F)
			.build();

	@Shadow
	@Final
	@Mutable
	public static final FoodComponent BAKED_POTATO = new FoodComponent.Builder()
			.hunger(5)
			.saturationModifier(0.6F)
			.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100), 1.0F)
			.build();
	@Shadow
	@Final
	@Mutable
	public static final FoodComponent SWEET_BERRIES = new FoodComponent.Builder()
			.hunger(2)
			.saturationModifier(0.1F)
			.snack()
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 30, 2), 1.0F)
			.build();
}
