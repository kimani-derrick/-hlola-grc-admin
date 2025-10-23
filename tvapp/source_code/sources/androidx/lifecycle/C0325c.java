package androidx.lifecycle;

import java.lang.reflect.Method;
/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325c {

    /* renamed from: a  reason: collision with root package name */
    public final int f6809a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f6810b;

    public C0325c(int i7, Method method) {
        this.f6809a = i7;
        this.f6810b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0325c) {
            C0325c c0325c = (C0325c) obj;
            return this.f6809a == c0325c.f6809a && this.f6810b.getName().equals(c0325c.f6810b.getName());
        }
        return false;
    }

    public final int hashCode() {
        return this.f6810b.getName().hashCode() + (this.f6809a * 31);
    }
}
