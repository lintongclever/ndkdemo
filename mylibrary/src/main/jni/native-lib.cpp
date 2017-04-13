//
// Created by Administrator on 2017/4/11.
//


#include <jni.h>
#include <string>
#include "Max.h"

extern "C"{
JNIEXPORT jstring JNICALL
 Java_servicea_mpc_fh_com_ndkdemo_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {

    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}


JNIEXPORT jint JNICALL
Java_servicea_mpc_fh_com_ndkdemo_MainActivity_maxFromJNI(
        JNIEnv* env,
        jobject object,
        jint a,
        jint b)
{
    return max(a,b);
}
}