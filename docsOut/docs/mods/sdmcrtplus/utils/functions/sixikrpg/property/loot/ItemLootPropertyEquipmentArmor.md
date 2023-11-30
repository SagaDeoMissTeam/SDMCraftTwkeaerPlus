# ItemLootPropertyEquipmentArmor

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyEquipmentArmor;
```


## Extending ItemLootPropertyBase

ItemLootPropertyEquipmentArmor extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyEquipmentArmor

## Constructors


```zenscript
new ItemLootPropertyEquipmentArmor(helmet as IItemStack, chestPlate as IItemStack, leggings as IItemStack, boots as IItemStack) as ItemLootPropertyEquipmentArmor
```
| Parameter  |                    Type                    |
|------------|--------------------------------------------|
| helmet     | [IItemStack](/vanilla/api/item/IItemStack) |
| chestPlate | [IItemStack](/vanilla/api/item/IItemStack) |
| leggings   | [IItemStack](/vanilla/api/item/IItemStack) |
| boots      | [IItemStack](/vanilla/api/item/IItemStack) |



## Methods

:::group{name=getBoots}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)

```zenscript
// ItemLootPropertyEquipmentArmor.getBoots() as IItemStack

myItemLootPropertyEquipmentArmor.getBoots();
```

:::

:::group{name=getChestPlate}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)

```zenscript
// ItemLootPropertyEquipmentArmor.getChestPlate() as IItemStack

myItemLootPropertyEquipmentArmor.getChestPlate();
```

:::

:::group{name=getHelmet}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)

```zenscript
// ItemLootPropertyEquipmentArmor.getHelmet() as IItemStack

myItemLootPropertyEquipmentArmor.getHelmet();
```

:::

:::group{name=getLeggings}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)

```zenscript
// ItemLootPropertyEquipmentArmor.getLeggings() as IItemStack

myItemLootPropertyEquipmentArmor.getLeggings();
```

:::


## Properties

|    Name    |                    Type                    | Has Getter | Has Setter |
|------------|--------------------------------------------|------------|------------|
| boots      | [IItemStack](/vanilla/api/item/IItemStack) | true       | false      |
| chestplate | [IItemStack](/vanilla/api/item/IItemStack) | true       | false      |
| helmet     | [IItemStack](/vanilla/api/item/IItemStack) | true       | false      |
| leggings   | [IItemStack](/vanilla/api/item/IItemStack) | true       | false      |

