# LibraryUtils

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.integration.ftblibrary.utils.LibraryUtils;
```


## Static Methods

:::group{name=addBrightness}

Return Type: [Color4I](/mods/sdmcrtplus/integration/ftblibrary/icon/Color4I)

```zenscript
LibraryUtils.addBrightness(string as string) as Color4I
```

| Parameter |  Type  |
|-----------|--------|
| string    | string |


:::

:::group{name=get256}

Return Type: [Color4I](/mods/sdmcrtplus/integration/ftblibrary/icon/Color4I)

```zenscript
LibraryUtils.get256(id as int) as Color4I
```

| Parameter | Type |
|-----------|------|
| id        | int  |


:::

:::group{name=hsb}

Return Type: [Color4I](/mods/sdmcrtplus/integration/ftblibrary/icon/Color4I)

```zenscript
LibraryUtils.hsb(h as float, s as float, b as float) as Color4I
```

| Parameter | Type  |
|-----------|-------|
| h         | float |
| s         | float |
| b         | float |


:::

:::group{name=rgb}

Return Type: [Color4I](/mods/sdmcrtplus/integration/ftblibrary/icon/Color4I)

```zenscript
LibraryUtils.rgb(col as int) as Color4I
```

| Parameter | Type |
|-----------|------|
| col       | int  |


:::

:::group{name=rgb}

Return Type: [Color4I](/mods/sdmcrtplus/integration/ftblibrary/icon/Color4I)

```zenscript
LibraryUtils.rgb(color as Vec3) as Color4I
```

| Parameter |                Type                 |
|-----------|-------------------------------------|
| color     | [Vec3](/vanilla/api/util/math/Vec3) |


:::

:::group{name=rgb}

Return Type: [Color4I](/mods/sdmcrtplus/integration/ftblibrary/icon/Color4I)

```zenscript
LibraryUtils.rgb(r as int, g as int, b as int) as Color4I
```

| Parameter | Type |
|-----------|------|
| r         | int  |
| g         | int  |
| b         | int  |


:::

:::group{name=rgba}

Return Type: [Color4I](/mods/sdmcrtplus/integration/ftblibrary/icon/Color4I)

```zenscript
LibraryUtils.rgba(col as int) as Color4I
```

| Parameter | Type |
|-----------|------|
| col       | int  |


:::

:::group{name=rgba}

Return Type: [Color4I](/mods/sdmcrtplus/integration/ftblibrary/icon/Color4I)

```zenscript
LibraryUtils.rgba(r as int, g as int, b as int, a as int) as Color4I
```

| Parameter | Type |
|-----------|------|
| r         | int  |
| g         | int  |
| b         | int  |
| a         | int  |


:::

