object Deps {

    object BuildTools {
        const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    }

    object Kotlin {
        const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    }

    object Android {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}"
        const val viewModelProcessor =
            "androidx.lifecycle:lifecycle-common-java8:${Versions.viewModel}"

        object Compose {
            const val composeUI = "androidx.compose.ui:ui:${Versions.compose}"
            const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
            const val compiler = "androidx.compose.compiler:compiler:${Versions.compose}"
            const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
            const val material = "androidx.compose.material:material:${Versions.compose}"
            const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
            const val animation = "androidx.compose.animation:animation:${Versions.compose}"
            const val viewModel =
                "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.viewModel}"
            const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
        }
    }

    object Testing {
        const val jUnit = "junit:junit:${Versions.jUnit}"
        const val jUnitExt = "androidx.test.ext:junit:${Versions.jUnitExt}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }
}
