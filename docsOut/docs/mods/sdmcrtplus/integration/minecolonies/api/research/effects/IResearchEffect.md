# IResearchEffect&LT;T : Object&GT;

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.integration.api.research.effects.IResearchEffect;
```


## Methods

:::group{name=getDesc}

Return Type: [TranslatableContents](/vanilla/api/text/content/type/TranslatableContents)

```zenscript
// IResearchEffect.getDesc() as TranslatableContents

myIResearchEffect.getDesc();
```

:::

:::group{name=getEffect}

Return Type: Object

```zenscript
// IResearchEffect.getEffect() as Object

myIResearchEffect.getEffect();
```

:::

:::group{name=getId}

Return Type: [ResourceLocation](/vanilla/api/resource/ResourceLocation)

```zenscript
// IResearchEffect.getId() as ResourceLocation

myIResearchEffect.getId();
```

:::

:::group{name=getRegistryEntry}

Return Type: **invalid**

```zenscript
// IResearchEffect.getRegistryEntry() as invalid

myIResearchEffect.getRegistryEntry();
```

:::

:::group{name=getSubtitle}

Return Type: [TranslatableContents](/vanilla/api/text/content/type/TranslatableContents)

```zenscript
// IResearchEffect.getSubtitle() as TranslatableContents

myIResearchEffect.getSubtitle();
```

:::

:::group{name=overrides}

Return Type: boolean

```zenscript
IResearchEffect.overrides(var1 as IResearchEffect) as boolean
```

| Parameter |                                               Type                                                |
|-----------|---------------------------------------------------------------------------------------------------|
| var1      | [IResearchEffect](/mods/sdmcrtplus/integration/minecolonies/api/research/effects/IResearchEffect) |


:::

:::group{name=setEffect}

```zenscript
IResearchEffect.setEffect(var1 as Object)
```

| Parameter |  Type  |
|-----------|--------|
| var1      | Object |


:::


