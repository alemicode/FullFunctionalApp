
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.kapt)

}

android {
    namespace = "com.alemicode.network"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.ui.test.junit4)

    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.gson.convertor)
    implementation(libs.gson)
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(libs.kotlinx.serialization.json)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
}