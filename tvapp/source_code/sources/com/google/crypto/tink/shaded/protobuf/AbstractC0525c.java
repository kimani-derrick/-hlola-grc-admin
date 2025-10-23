package com.google.crypto.tink.shaded.protobuf;
/* renamed from: com.google.crypto.tink.shaded.protobuf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0525c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f9104a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f9105b;

    static {
        Class<?> cls;
        boolean z7;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f9104a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        f9105b = z7;
    }

    public static boolean a() {
        return (f9104a == null || f9105b) ? false : true;
    }
}
