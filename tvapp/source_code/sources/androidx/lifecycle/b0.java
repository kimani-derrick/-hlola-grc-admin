package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f6808a = new LinkedHashMap();

    public final void a() {
        for (V v5 : this.f6808a.values()) {
            v5.f6800c = true;
            HashMap hashMap = v5.f6798a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object obj : v5.f6798a.values()) {
                            V.a(obj);
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = v5.f6799b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : v5.f6799b) {
                            V.a(closeable);
                        }
                    } finally {
                    }
                }
            }
            v5.b();
        }
        this.f6808a.clear();
    }
}
