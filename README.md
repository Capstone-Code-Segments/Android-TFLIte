# Android-TFLite
***Anda dapat menggunakan project ini sebagai referensi. Anda dapat melakukan eksplorasi juga.***

Link untuk mengunduh aplikasi: https://drive.google.com/file/d/1LZUFoqEh_f30L58hi32QLznBcQl9XfD4/view?usp=sharing

Ada 2 jenis opsi kamera yang digunakan: OpenCV atau CameraX. 

Project ini memiliki folder "assets" yang terdapat 2 file dengan format .txt, dan 2 file dengan format .tflite.
File *labelmap.txt* dan *ssd_mobilenet.tflite* digunakan untuk kamera OpenCV dengan deteksi OpenCV, sedangkan file *coco_ssd_mobilenet_v1_1.0_labels.txt* dan *coco_ssd_mobilenet_v1_1.0_quant.tflite* digunakan untuk kamera CameraX dengan deteksi TensorFlow Lite.

Project saat ini masih berbasis real time detection. Kalian dapat memodifikasi di project kalian, sesuai dengan kebutuhan kalian.

Hati-hati, untuk kamera dan deteksi OpenCV agak lemot.

# Versi Gradle dan Kotlin (build.gradle (project)) pada Aplikasi ini
```
plugins {
    id 'com.android.application' version '7.4.0' apply false
    id 'com.android.library' version '7.4.0' apply false
    id 'org.jetbrains.kotlin.android' version '1.7.21' apply false
}
```

Pada project structure:
Android Gradle Plugin Version: 7.4.0
Gradle Version: 7.5

Android Studio Version yang digunakan: Electric Eel

# Versi untuk Library OpenCV
***Abaikan ini apabila kalian tidak memakai OpenCV.***

Saran saya, copy dan paste library "openCVLibrary3413" dan folder "jniLibs" ke project kalian. Untuk masing-masing path-nya, kalian perlu memperhatikannya pada project ini.

# Versi pada dependencies (build.gradle (Module :app)
1. CameraX dan CameraX View
```
    // CameraX
    def camerax_version = "1.0.0-beta02"
    implementation "androidx.camera:camera-core:${camerax_version}"
    implementation "androidx.camera:camera-camera2:${camerax_version}"
    implementation "androidx.camera:camera-lifecycle:${camerax_version}"
    
    // CameraX View class    
    implementation "androidx.camera:camera-view:1.0.0-alpha09"
```
2. TensorFlow Lite
```    
    implementation 'org.tensorflow:tensorflow-lite-metadata:0.1.0-rc1' 
    implementation 'org.tensorflow:tensorflow-lite-gpu:2.2.0'
    implementation 'org.tensorflow:tensorflow-lite-support:0.1.0'
    implementation 'org.tensorflow:tensorflow-lite-task-vision:0.1.0'
    implementation 'org.tensorflow:tensorflow-lite-task-text:0.1.0'
```
