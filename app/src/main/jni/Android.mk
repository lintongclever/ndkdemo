LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := native-app
LOCAL_SRC_FILES := \
 native-lib.cpp \
 Max.cpp
LOCAL_LDFLAGS := -L$(LOCAL_PATH)/app/libs/$(TARGET_ARCH_ABI)
LOCAL_LDLIBS := \
   -lz \
   -lm \


include $(BUILD_SHARED_LIBRARY)