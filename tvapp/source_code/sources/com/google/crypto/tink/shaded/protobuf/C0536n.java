package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
/* renamed from: com.google.crypto.tink.shaded.protobuf.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536n {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0536n f9145a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0536n f9146b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.n, java.lang.Object] */
    static {
        ?? obj = new Object();
        Collections.emptyMap();
        f9146b = obj;
    }

    public static C0536n a() {
        C0536n c0536n = f9145a;
        if (c0536n == null) {
            synchronized (C0536n.class) {
                try {
                    c0536n = f9145a;
                    if (c0536n == null) {
                        Class cls = AbstractC0535m.f9143a;
                        C0536n c0536n2 = null;
                        if (cls != null) {
                            try {
                                c0536n2 = (C0536n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0536n2 == null) {
                            c0536n2 = f9146b;
                        }
                        f9145a = c0536n2;
                        c0536n = c0536n2;
                    }
                } finally {
                }
            }
        }
        return c0536n;
    }
}
