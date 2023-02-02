package com.iamageo.jet_twitter.ui.components.multifab

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable


@Immutable
interface FabIcon {
    @Stable
    val iconRes: Int

    @Stable
    val iconRotate: Float?
}

private class FabIconImpl(
    override val iconRes: Int,
    override val iconRotate: Float?
) : FabIcon

fun FabIcon(@DrawableRes iconRes: Int, iconRotate: Float? = null): FabIcon =
    FabIconImpl(iconRes = iconRes, iconRotate = iconRotate)