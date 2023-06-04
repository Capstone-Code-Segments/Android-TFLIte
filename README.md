# Android-TFLite

Link untuk mengunduh aplikasi: https://drive.google.com/file/d/1LZUFoqEh_f30L58hi32QLznBcQl9XfD4/view?usp=sharing

Ada 2 jenis opsi kamera yang digunakan: OpenCV atau CameraX. 

Project ini memiliki folder "assets" yang terdapat 2 file dengan format .txt, dan 2 file dengan format .tflite.
File *labelmap.txt* dan *ssd_mobilenet.tflite* digunakan untuk kamera OpenCV dengan deteksi OpenCV, sedangkan file *coco_ssd_mobilenet_v1_1.0_labels.txt* dan *coco_ssd_mobilenet_v1_1.0_quant.tflite* digunakan untuk kamera CameraX dengan deteksi TensorFlow Lite.

Project saat ini masih berbasis real time detection. Kalian dapat memodifikasi di project kalian, sesuai dengan kebutuhan kalian.

Hati-hati, untuk kamera dan deteksi OpenCV agak lemot.
