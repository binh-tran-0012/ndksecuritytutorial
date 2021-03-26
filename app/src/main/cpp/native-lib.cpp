//
// Created by BinhDRM on 3/26/21.
//
#include <jni.h>
#include <string>

extern "C" {

    JNIEXPORT jstring JNICALL
    Java_com_binhdrm_ndksecuritytutorial_MainActivity_invokeNativeFunction(JNIEnv *env, jobject object) {
        std::string api_key = "22310678d9a751d811f41c6c33a78db368";
        return env->NewStringUTF(api_key.c_str());
    }
}