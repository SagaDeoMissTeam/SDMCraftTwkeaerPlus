# Registry&LT;T : Object&GT;

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.resource.Registry;
```


## Implemented Interfaces
Registry implements the following interfaces. That means all methods defined in these interfaces are also available in Registry

- [IdMap](/mods/sdmcrtplus/utils/core/IdMap)&lt;T&gt;

## Methods

:::group{name=asHolderIdMap}

Return Type: [IdMap](/mods/sdmcrtplus/utils/core/IdMap)&lt;[Holder](/mods/sdmcrtplus/utils/core/Holder)&lt;T&gt;&gt;

```zenscript
Registry.asHolderIdMap<T : Object>() as IdMap<Holder<T>>
```

| Parameter |  Type  |
|-----------|--------|
| T         | Object |


:::

:::group{name=containsKey}

Return Type: boolean

```zenscript
Registry.containsKey<T : Object>(resourceKey as ResourceKey<T>) as boolean
```

|  Parameter  |                             Type                              |
|-------------|---------------------------------------------------------------|
| resourceKey | [ResourceKey](/mods/sdmcrtplus/resource/ResourceKey)&lt;T&gt; |
| T           | Object                                                        |


:::

:::group{name=containsKey}

Return Type: boolean

```zenscript
Registry.containsKey<T : Object>(resourceLocation as ResourceLocation) as boolean
```

|    Parameter     |                            Type                            |
|------------------|------------------------------------------------------------|
| resourceLocation | [ResourceLocation](/vanilla/api/resource/ResourceLocation) |
| T                | Object                                                     |


:::

:::group{name=getKey}

Return Type: [ResourceLocation](/vanilla/api/resource/ResourceLocation)

```zenscript
Registry.getKey<T : Object>(key as T) as ResourceLocation
```

| Parameter |  Type  |
|-----------|--------|
| key       | T      |
| T         | Object |


:::

:::group{name=getRegistry}

Return Type: [Registry](/mods/sdmcrtplus/resource/ResourceKey)

```zenscript
// Registry.getRegistry() as Registry

myRegistry.getRegistry();
```

:::

:::group{name=getRegistry}

Return Type: T

```zenscript
Registry.getRegistry<T : Object>(resourceKey as ResourceKey<T>) as T
```

|  Parameter  |                             Type                              |
|-------------|---------------------------------------------------------------|
| resourceKey | [ResourceKey](/mods/sdmcrtplus/resource/ResourceKey)&lt;T&gt; |
| T           | Object                                                        |


:::

:::group{name=getRegistry}

Return Type: T

```zenscript
Registry.getRegistry<T : Object>(resourceLocation as ResourceLocation) as T
```

|    Parameter     |                            Type                            |
|------------------|------------------------------------------------------------|
| resourceLocation | [ResourceLocation](/vanilla/api/resource/ResourceLocation) |
| T                | Object                                                     |


:::


