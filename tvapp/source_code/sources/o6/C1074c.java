package o6;

import u4.C1288l;
import v6.C1344i;
/* renamed from: o6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074c {
    public static final C1344i d;

    /* renamed from: e  reason: collision with root package name */
    public static final C1344i f12993e;
    public static final C1344i f;

    /* renamed from: g  reason: collision with root package name */
    public static final C1344i f12994g;

    /* renamed from: h  reason: collision with root package name */
    public static final C1344i f12995h;

    /* renamed from: i  reason: collision with root package name */
    public static final C1344i f12996i;

    /* renamed from: a  reason: collision with root package name */
    public final C1344i f12997a;

    /* renamed from: b  reason: collision with root package name */
    public final C1344i f12998b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12999c;

    static {
        C1344i c1344i = C1344i.f15389t;
        d = C1288l.e(":");
        f12993e = C1288l.e(":status");
        f = C1288l.e(":method");
        f12994g = C1288l.e(":path");
        f12995h = C1288l.e(":scheme");
        f12996i = C1288l.e(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1074c(String str, String str2) {
        this(C1288l.e(str), C1288l.e(str2));
        M5.g.f(str, "name");
        M5.g.f(str2, "value");
        C1344i c1344i = C1344i.f15389t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074c)) {
            return false;
        }
        C1074c c1074c = (C1074c) obj;
        if (M5.g.a(this.f12997a, c1074c.f12997a) && M5.g.a(this.f12998b, c1074c.f12998b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12998b.hashCode() + (this.f12997a.hashCode() * 31);
    }

    public final String toString() {
        return this.f12997a.q() + ": " + this.f12998b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1074c(C1344i c1344i, String str) {
        this(c1344i, C1288l.e(str));
        M5.g.f(c1344i, "name");
        M5.g.f(str, "value");
        C1344i c1344i2 = C1344i.f15389t;
    }

    public C1074c(C1344i c1344i, C1344i c1344i2) {
        M5.g.f(c1344i, "name");
        M5.g.f(c1344i2, "value");
        this.f12997a = c1344i;
        this.f12998b = c1344i2;
        this.f12999c = c1344i2.d() + c1344i.d() + 32;
    }
}
