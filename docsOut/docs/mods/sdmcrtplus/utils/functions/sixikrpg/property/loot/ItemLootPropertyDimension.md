# ItemLootPropertyDimension

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyDimension;
```


## Extending ItemLootPropertyBase

ItemLootPropertyDimension extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyDimension

## Constructors


```zenscript
new ItemLootPropertyDimension(dimension as ResourceLocation) as ItemLootPropertyDimension
```
| Parameter |                            Type                            |
|-----------|------------------------------------------------------------|
| dimension | [ResourceLocation](/vanilla/api/resource/ResourceLocation) |



## Methods

:::group{name=getDimension}

Return Type: [ResourceLocation](/vanilla/api/resource/ResourceLocation)

```zenscript
// ItemLootPropertyDimension.getDimension() as ResourceLocation

myItemLootPropertyDimension.getDimension();
```

:::


