# ItemLootPropertyKillCurrentEnchantment

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyKillCurrentEnchantment;
```


## Extending ItemLootPropertyBase

ItemLootPropertyKillCurrentEnchantment extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyKillCurrentEnchantment

## Constructors


```zenscript
new ItemLootPropertyKillCurrentEnchantment(enchantmentInstances as Enchantment[]) as ItemLootPropertyKillCurrentEnchantment
```
|      Parameter       |                            Type                            |
|----------------------|------------------------------------------------------------|
| enchantmentInstances | [Enchantment](/vanilla/api/item/enchantment/Enchantment)[] |



## Methods

:::group{name=getEnchantment}

Return Type: [Enchantment](/vanilla/api/item/enchantment/Enchantment)[]

```zenscript
// ItemLootPropertyKillCurrentEnchantment.getEnchantment() as Enchantment[]

myItemLootPropertyKillCurrentEnchantment.getEnchantment();
```

:::


## Properties

|    Name     |                            Type                            | Has Getter | Has Setter |
|-------------|------------------------------------------------------------|------------|------------|
| enchantment | [Enchantment](/vanilla/api/item/enchantment/Enchantment)[] | true       | false      |

