package org.chtan.portfolio.myprofile.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

private val lightScheme = lightColorScheme(
    primary = org.chtan.portfolio.myprofile.presentation.theme.primaryLight,
    onPrimary = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryLight,
    primaryContainer = org.chtan.portfolio.myprofile.presentation.theme.primaryContainerLight,
    onPrimaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryContainerLight,
    secondary = org.chtan.portfolio.myprofile.presentation.theme.secondaryLight,
    onSecondary = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryLight,
    secondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.secondaryContainerLight,
    onSecondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryContainerLight,
    tertiary = org.chtan.portfolio.myprofile.presentation.theme.tertiaryLight,
    onTertiary = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryLight,
    tertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.tertiaryContainerLight,
    onTertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryContainerLight,
    error = org.chtan.portfolio.myprofile.presentation.theme.errorLight,
    onError = org.chtan.portfolio.myprofile.presentation.theme.onErrorLight,
    errorContainer = org.chtan.portfolio.myprofile.presentation.theme.errorContainerLight,
    onErrorContainer = org.chtan.portfolio.myprofile.presentation.theme.onErrorContainerLight,
    background = org.chtan.portfolio.myprofile.presentation.theme.backgroundLight,
    onBackground = org.chtan.portfolio.myprofile.presentation.theme.onBackgroundLight,
    surface = org.chtan.portfolio.myprofile.presentation.theme.surfaceLight,
    onSurface = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceLight,
    surfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.surfaceVariantLight,
    onSurfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceVariantLight,
    outline = org.chtan.portfolio.myprofile.presentation.theme.outlineLight,
    outlineVariant = org.chtan.portfolio.myprofile.presentation.theme.outlineVariantLight,
    scrim = org.chtan.portfolio.myprofile.presentation.theme.scrimLight,
    inverseSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseSurfaceLight,
    inverseOnSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseOnSurfaceLight,
    inversePrimary = org.chtan.portfolio.myprofile.presentation.theme.inversePrimaryLight,
    surfaceDim = org.chtan.portfolio.myprofile.presentation.theme.surfaceDimLight,
    surfaceBright = org.chtan.portfolio.myprofile.presentation.theme.surfaceBrightLight,
    surfaceContainerLowest = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLowestLight,
    surfaceContainerLow = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLowLight,
    surfaceContainer = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLight,
    surfaceContainerHigh = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerHighLight,
    surfaceContainerHighest = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = org.chtan.portfolio.myprofile.presentation.theme.primaryDark,
    onPrimary = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryDark,
    primaryContainer = org.chtan.portfolio.myprofile.presentation.theme.primaryContainerDark,
    onPrimaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryContainerDark,
    secondary = org.chtan.portfolio.myprofile.presentation.theme.secondaryDark,
    onSecondary = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryDark,
    secondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.secondaryContainerDark,
    onSecondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryContainerDark,
    tertiary = org.chtan.portfolio.myprofile.presentation.theme.tertiaryDark,
    onTertiary = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryDark,
    tertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.tertiaryContainerDark,
    onTertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryContainerDark,
    error = org.chtan.portfolio.myprofile.presentation.theme.errorDark,
    onError = org.chtan.portfolio.myprofile.presentation.theme.onErrorDark,
    errorContainer = org.chtan.portfolio.myprofile.presentation.theme.errorContainerDark,
    onErrorContainer = org.chtan.portfolio.myprofile.presentation.theme.onErrorContainerDark,
    background = org.chtan.portfolio.myprofile.presentation.theme.backgroundDark,
    onBackground = org.chtan.portfolio.myprofile.presentation.theme.onBackgroundDark,
    surface = org.chtan.portfolio.myprofile.presentation.theme.surfaceDark,
    onSurface = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceDark,
    surfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.surfaceVariantDark,
    onSurfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceVariantDark,
    outline = org.chtan.portfolio.myprofile.presentation.theme.outlineDark,
    outlineVariant = org.chtan.portfolio.myprofile.presentation.theme.outlineVariantDark,
    scrim = org.chtan.portfolio.myprofile.presentation.theme.scrimDark,
    inverseSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseSurfaceDark,
    inverseOnSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseOnSurfaceDark,
    inversePrimary = org.chtan.portfolio.myprofile.presentation.theme.inversePrimaryDark,
    surfaceDim = org.chtan.portfolio.myprofile.presentation.theme.surfaceDimDark,
    surfaceBright = org.chtan.portfolio.myprofile.presentation.theme.surfaceBrightDark,
    surfaceContainerLowest = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLowestDark,
    surfaceContainerLow = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLowDark,
    surfaceContainer = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerDark,
    surfaceContainerHigh = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerHighDark,
    surfaceContainerHighest = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = org.chtan.portfolio.myprofile.presentation.theme.primaryLightMediumContrast,
    onPrimary = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryLightMediumContrast,
    primaryContainer = org.chtan.portfolio.myprofile.presentation.theme.primaryContainerLightMediumContrast,
    onPrimaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryContainerLightMediumContrast,
    secondary = org.chtan.portfolio.myprofile.presentation.theme.secondaryLightMediumContrast,
    onSecondary = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryLightMediumContrast,
    secondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.secondaryContainerLightMediumContrast,
    onSecondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryContainerLightMediumContrast,
    tertiary = org.chtan.portfolio.myprofile.presentation.theme.tertiaryLightMediumContrast,
    onTertiary = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryLightMediumContrast,
    tertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.tertiaryContainerLightMediumContrast,
    onTertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryContainerLightMediumContrast,
    error = org.chtan.portfolio.myprofile.presentation.theme.errorLightMediumContrast,
    onError = org.chtan.portfolio.myprofile.presentation.theme.onErrorLightMediumContrast,
    errorContainer = org.chtan.portfolio.myprofile.presentation.theme.errorContainerLightMediumContrast,
    onErrorContainer = org.chtan.portfolio.myprofile.presentation.theme.onErrorContainerLightMediumContrast,
    background = org.chtan.portfolio.myprofile.presentation.theme.backgroundLightMediumContrast,
    onBackground = org.chtan.portfolio.myprofile.presentation.theme.onBackgroundLightMediumContrast,
    surface = org.chtan.portfolio.myprofile.presentation.theme.surfaceLightMediumContrast,
    onSurface = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceLightMediumContrast,
    surfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.surfaceVariantLightMediumContrast,
    onSurfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceVariantLightMediumContrast,
    outline = org.chtan.portfolio.myprofile.presentation.theme.outlineLightMediumContrast,
    outlineVariant = org.chtan.portfolio.myprofile.presentation.theme.outlineVariantLightMediumContrast,
    scrim = org.chtan.portfolio.myprofile.presentation.theme.scrimLightMediumContrast,
    inverseSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseSurfaceLightMediumContrast,
    inverseOnSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseOnSurfaceLightMediumContrast,
    inversePrimary = org.chtan.portfolio.myprofile.presentation.theme.inversePrimaryLightMediumContrast,
    surfaceDim = org.chtan.portfolio.myprofile.presentation.theme.surfaceDimLightMediumContrast,
    surfaceBright = org.chtan.portfolio.myprofile.presentation.theme.surfaceBrightLightMediumContrast,
    surfaceContainerLowest = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLowLightMediumContrast,
    surfaceContainer = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLightMediumContrast,
    surfaceContainerHigh = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = org.chtan.portfolio.myprofile.presentation.theme.primaryLightHighContrast,
    onPrimary = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryLightHighContrast,
    primaryContainer = org.chtan.portfolio.myprofile.presentation.theme.primaryContainerLightHighContrast,
    onPrimaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryContainerLightHighContrast,
    secondary = org.chtan.portfolio.myprofile.presentation.theme.secondaryLightHighContrast,
    onSecondary = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryLightHighContrast,
    secondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.secondaryContainerLightHighContrast,
    onSecondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryContainerLightHighContrast,
    tertiary = org.chtan.portfolio.myprofile.presentation.theme.tertiaryLightHighContrast,
    onTertiary = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryLightHighContrast,
    tertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.tertiaryContainerLightHighContrast,
    onTertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryContainerLightHighContrast,
    error = org.chtan.portfolio.myprofile.presentation.theme.errorLightHighContrast,
    onError = org.chtan.portfolio.myprofile.presentation.theme.onErrorLightHighContrast,
    errorContainer = org.chtan.portfolio.myprofile.presentation.theme.errorContainerLightHighContrast,
    onErrorContainer = org.chtan.portfolio.myprofile.presentation.theme.onErrorContainerLightHighContrast,
    background = org.chtan.portfolio.myprofile.presentation.theme.backgroundLightHighContrast,
    onBackground = org.chtan.portfolio.myprofile.presentation.theme.onBackgroundLightHighContrast,
    surface = org.chtan.portfolio.myprofile.presentation.theme.surfaceLightHighContrast,
    onSurface = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceLightHighContrast,
    surfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.surfaceVariantLightHighContrast,
    onSurfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceVariantLightHighContrast,
    outline = org.chtan.portfolio.myprofile.presentation.theme.outlineLightHighContrast,
    outlineVariant = org.chtan.portfolio.myprofile.presentation.theme.outlineVariantLightHighContrast,
    scrim = org.chtan.portfolio.myprofile.presentation.theme.scrimLightHighContrast,
    inverseSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseSurfaceLightHighContrast,
    inverseOnSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseOnSurfaceLightHighContrast,
    inversePrimary = org.chtan.portfolio.myprofile.presentation.theme.inversePrimaryLightHighContrast,
    surfaceDim = org.chtan.portfolio.myprofile.presentation.theme.surfaceDimLightHighContrast,
    surfaceBright = org.chtan.portfolio.myprofile.presentation.theme.surfaceBrightLightHighContrast,
    surfaceContainerLowest = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLowLightHighContrast,
    surfaceContainer = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerLightHighContrast,
    surfaceContainerHigh = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = org.chtan.portfolio.myprofile.presentation.theme.surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = org.chtan.portfolio.myprofile.presentation.theme.primaryDarkMediumContrast,
    onPrimary = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryDarkMediumContrast,
    primaryContainer = org.chtan.portfolio.myprofile.presentation.theme.primaryContainerDarkMediumContrast,
    onPrimaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onPrimaryContainerDarkMediumContrast,
    secondary = org.chtan.portfolio.myprofile.presentation.theme.secondaryDarkMediumContrast,
    onSecondary = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryDarkMediumContrast,
    secondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.secondaryContainerDarkMediumContrast,
    onSecondaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onSecondaryContainerDarkMediumContrast,
    tertiary = org.chtan.portfolio.myprofile.presentation.theme.tertiaryDarkMediumContrast,
    onTertiary = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryDarkMediumContrast,
    tertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = org.chtan.portfolio.myprofile.presentation.theme.onTertiaryContainerDarkMediumContrast,
    error = org.chtan.portfolio.myprofile.presentation.theme.errorDarkMediumContrast,
    onError = org.chtan.portfolio.myprofile.presentation.theme.onErrorDarkMediumContrast,
    errorContainer = org.chtan.portfolio.myprofile.presentation.theme.errorContainerDarkMediumContrast,
    onErrorContainer = org.chtan.portfolio.myprofile.presentation.theme.onErrorContainerDarkMediumContrast,
    background = org.chtan.portfolio.myprofile.presentation.theme.backgroundDarkMediumContrast,
    onBackground = org.chtan.portfolio.myprofile.presentation.theme.onBackgroundDarkMediumContrast,
    surface = org.chtan.portfolio.myprofile.presentation.theme.surfaceDarkMediumContrast,
    onSurface = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceDarkMediumContrast,
    surfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.surfaceVariantDarkMediumContrast,
    onSurfaceVariant = org.chtan.portfolio.myprofile.presentation.theme.onSurfaceVariantDarkMediumContrast,
    outline = org.chtan.portfolio.myprofile.presentation.theme.outlineDarkMediumContrast,
    outlineVariant = org.chtan.portfolio.myprofile.presentation.theme.outlineVariantDarkMediumContrast,
    scrim = org.chtan.portfolio.myprofile.presentation.theme.scrimDarkMediumContrast,
    inverseSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseSurfaceDarkMediumContrast,
    inverseOnSurface = org.chtan.portfolio.myprofile.presentation.theme.inverseOnSurfaceDarkMediumContrast,
    inversePrimary = org.chtan.portfolio.myprofile.presentation.theme.inversePrimaryDarkMediumContrast,
    surfaceDim = org.chtan.portfolio.myprofile.presentation.theme.surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun PortfolioTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
  val colorScheme = when {

      
      darkTheme -> darkScheme
      else -> lightScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography(),
    content = content
  )
}

