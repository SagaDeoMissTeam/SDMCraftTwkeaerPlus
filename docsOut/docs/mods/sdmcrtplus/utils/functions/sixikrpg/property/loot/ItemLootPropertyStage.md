# ItemLootPropertyStage

It only works when the GameStages mod is installed

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyStage;
```


## Extending ItemLootPropertyBase

ItemLootPropertyStage extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyStage

## Constructors


```zenscript
new ItemLootPropertyStage(stage as string) as ItemLootPropertyStage
```
| Parameter |  Type  |
|-----------|--------|
| stage     | string |



## Methods

:::group{name=getStage}

Return Type: string

```zenscript
// ItemLootPropertyStage.getStage() as string

myItemLootPropertyStage.getStage();
```

:::


## Properties

| Name  |  Type  | Has Getter | Has Setter |
|-------|--------|------------|------------|
| stage | string | true       | false      |

