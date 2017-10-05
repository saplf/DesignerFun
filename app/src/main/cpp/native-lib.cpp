#include <limits.h>//
// Created by Limo Saplf on 2017/9/17.
//

#include <jni.h>
#include <stdlib.h>
#include <string>
#include "local.h"

extern "C"

char *jstringToChar(JNIEnv *env, jstring jstr) {
  char *rtn = NULL;
  jclass clsstring = env->FindClass("java/lang/String");
  jstring strencode = env->NewStringUTF("GB2312");
  jmethodID mid = env->GetMethodID(clsstring, "getBytes", "(Ljava/lang/String;)[B");
  jbyteArray barr = (jbyteArray) env->CallObjectMethod(jstr, mid, strencode);
  jsize alen = env->GetArrayLength(barr);
  jbyte *ba = env->GetByteArrayElements(barr, JNI_FALSE);
  if (alen > 0) {
    rtn = (char *) malloc((size_t) (alen + 1));
    memcpy(rtn, ba, (size_t) alen);
    rtn[alen] = 0;
  }
  env->ReleaseByteArrayElements(barr, ba, 0);
  return rtn;
}

JNIEXPORT jstring appId(JNIEnv *, jobject);

JNIEXPORT jstring appSecret(JNIEnv *, jobject);

const char *registerClass = "top/saplf/designerfun/native/NativeMethods";
JNINativeMethod nativeMethods[] = {
  {"appId",     "()Ljava/lang/String;", (void *) appId},
  {"appSecret", "()Ljava/lang/String;", (void *) appSecret}
};

JNIEXPORT jint JNICALL  __unused JNI_OnLoad(JavaVM *jvm, void *) {
  JNIEnv *env;
  if (jvm->GetEnv((void **) &env, JNI_VERSION_1_4) != JNI_OK) {
    return -1;
  }

  jclass clz = env->FindClass(registerClass);
  env->RegisterNatives(clz, nativeMethods, sizeof(nativeMethods) / sizeof(nativeMethods[0]));

  return JNI_VERSION_1_4;
}

JNIEXPORT jstring appId(JNIEnv *env, jobject obj) {
//    jclass clz = env->GetObjectClass(obj);
//    jmethodID method = env->GetMethodID(clz, "getSignature", "()Ljava/lang/String;");
//    jstring result = (jstring) env->CallObjectMethod(obj, method);
//    __android_log_print(ANDROID_LOG_DEBUG, "tag:--->", "%s", jstringToChar(env, result));
  const char id[] = dealWithAppId;
  return env->NewStringUTF(id);
}

JNIEXPORT jstring appSecret(JNIEnv *env, jobject) {
  const char secret[] = dealWithAppSecret;
  return env->NewStringUTF(secret);
}
