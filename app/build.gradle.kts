plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.jjrodcast.patterns"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"

    }

    buildFeatures {
        compose = true
        viewBinding = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }


}

dependencies {
    implementation(Deps.Kotlin.kotlin)
    implementation(Deps.Android.coreKtx)
    implementation(Deps.Android.appCompat)
    implementation(Deps.Android.material)
    implementation(Deps.Android.constraintLayout)
    testImplementation(Deps.Testing.jUnit)
    androidTestImplementation(Deps.Testing.jUnitExt)
    androidTestImplementation(Deps.Testing.espresso)

    // Compose
    implementation(Deps.Android.Compose.composeUI)
    implementation(Deps.Android.Compose.composeTooling)
    implementation(Deps.Android.Compose.viewModel)
    implementation(Deps.Android.Compose.compiler)
    implementation(Deps.Android.Compose.runtime)
    implementation(Deps.Android.Compose.material)
    implementation(Deps.Android.Compose.animation)
    implementation(Deps.Android.Compose.foundation)

    // Navigation
    //implementation(Deps.Android.Compose.navigation)

    // ViewModel
    //implementation(Deps.Android.viewModel)
    //implementation(Deps.Android.viewModelProcessor)
}