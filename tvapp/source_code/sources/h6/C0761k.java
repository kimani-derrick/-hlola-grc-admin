package h6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: h6.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11167a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11168b;

    /* renamed from: c  reason: collision with root package name */
    public Object f11169c;
    public Serializable d;

    public l a() {
        return new l(this.f11167a, this.f11168b, (String[]) this.f11169c, (String[]) this.d);
    }

    public void b(C0760j... c0760jArr) {
        M5.g.f(c0760jArr, "cipherSuites");
        if (this.f11167a) {
            ArrayList arrayList = new ArrayList(c0760jArr.length);
            for (C0760j c0760j : c0760jArr) {
                arrayList.add(c0760j.f11166a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                c((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void c(String... strArr) {
        boolean z7;
        M5.g.f(strArr, "cipherSuites");
        if (this.f11167a) {
            if (strArr.length == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                this.f11169c = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void d() {
        if (this.f11167a) {
            this.f11168b = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public void e(K... kArr) {
        if (this.f11167a) {
            ArrayList arrayList = new ArrayList(kArr.length);
            for (K k5 : kArr) {
                arrayList.add(k5.f11118q);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                f((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String[], java.io.Serializable] */
    public void f(String... strArr) {
        boolean z7;
        M5.g.f(strArr, "tlsVersions");
        if (this.f11167a) {
            if (strArr.length == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                this.d = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }
}
