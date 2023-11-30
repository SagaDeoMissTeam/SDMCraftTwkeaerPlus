# ItemLootPropertyInStructure

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyInStructure;
```


## Extending ItemLootPropertyBase

ItemLootPropertyInStructure extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyInStructure

## Constructors


```zenscript
new ItemLootPropertyInStructure(structure as ResourceLocation[]) as ItemLootPropertyInStructure
```
| Parameter |                             Type                             |
|-----------|--------------------------------------------------------------|
| structure | [ResourceLocation](/vanilla/api/resource/ResourceLocation)[] |



## Methods

:::group{name=getStructure}

Return Type: [ResourceLocation](/vanilla/api/resource/ResourceLocation)[]

```zenscript
// ItemLootPropertyInStructure.getStructure() as ResourceLocation[]

myItemLootPropertyInStructure.getStructure();
```

:::


## Properties

|   Name    |                             Type                             | Has Getter | Has Setter |
|-----------|--------------------------------------------------------------|------------|------------|
| structure | [ResourceLocation](/vanilla/api/resource/ResourceLocation)[] | true       | false      |

