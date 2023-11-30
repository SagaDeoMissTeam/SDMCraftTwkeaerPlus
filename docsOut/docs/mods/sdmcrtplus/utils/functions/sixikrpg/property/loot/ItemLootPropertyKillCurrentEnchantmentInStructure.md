# ItemLootPropertyKillCurrentEnchantmentInStructure

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyKillCurrentEnchantmentInStructure;
```


## Extending ItemLootPropertyKillCurrentEnchantment

ItemLootPropertyKillCurrentEnchantmentInStructure extends [ItemLootPropertyKillCurrentEnchantment](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyKillCurrentEnchantment). That means all methods available in [ItemLootPropertyKillCurrentEnchantment](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyKillCurrentEnchantment) are also available in ItemLootPropertyKillCurrentEnchantmentInStructure

## Constructors


```zenscript
new ItemLootPropertyKillCurrentEnchantmentInStructure(enchantmentInstances as Enchantment[], structure as ResourceLocation[]) as ItemLootPropertyKillCurrentEnchantmentInStructure
```
|      Parameter       |                             Type                             |
|----------------------|--------------------------------------------------------------|
| enchantmentInstances | [Enchantment](/vanilla/api/item/enchantment/Enchantment)[]   |
| structure            | [ResourceLocation](/vanilla/api/resource/ResourceLocation)[] |



## Methods

:::group{name=getEnchantment}

Return Type: [Enchantment](/vanilla/api/item/enchantment/Enchantment)[]

```zenscript
// ItemLootPropertyKillCurrentEnchantmentInStructure.getEnchantment() as Enchantment[]

myItemLootPropertyKillCurrentEnchantmentInStructure.getEnchantment();
```

:::

:::group{name=getStructure}

Return Type: [ResourceLocation](/vanilla/api/resource/ResourceLocation)[]

```zenscript
// ItemLootPropertyKillCurrentEnchantmentInStructure.getStructure() as ResourceLocation[]

myItemLootPropertyKillCurrentEnchantmentInStructure.getStructure();
```

:::


## Properties

|    Name     |                             Type                             | Has Getter | Has Setter |
|-------------|--------------------------------------------------------------|------------|------------|
| enchantment | [Enchantment](/vanilla/api/item/enchantment/Enchantment)[]   | true       | false      |
| structure   | [ResourceLocation](/vanilla/api/resource/ResourceLocation)[] | true       | false      |

