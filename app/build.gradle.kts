plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.holyn1k.holymessenger"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.holyn1k.holymessenger"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "2.0"
    }

    buildFeatures { compose = true }
}

dependencies {
    implementation("com.google.firebase:firebase-auth-ktx:22.3.0")
    implementation("com.google.firebase:firebase-firestore-ktx:24.10.0")
    implementation("com.google.firebase:firebase-messaging-ktx:23.4.0")
    implementation("org.webrtc:google-webrtc:1.0.32006")
}