package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class B2 extends LinkedHashMap {

    /* renamed from: r  reason: collision with root package name */
    public static final B2 f8232r;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8233q = true;

    static {
        B2 b22 = new B2();
        f8232r = b22;
        b22.f8233q = false;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = AbstractC0467o2.f8631a;
            int length = bArr.length;
            for (byte b7 : bArr) {
                length = (length * 31) + b7;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        }
        return obj.hashCode();
    }

    public final void c() {
        if (!this.f8233q) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() != map.size()) {
                    return false;
                }
                for (Map.Entry entry : entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        return false;
                    }
                    Object value = entry.getValue();
                    Object obj2 = map.get(entry.getKey());
                    if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                        equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                        continue;
                    } else {
                        equals = value.equals(obj2);
                        continue;
                    }
                    if (!equals) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i7 = 0;
        for (Map.Entry entry : entrySet()) {
            i7 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i7;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        Charset charset = AbstractC0467o2.f8631a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0467o2.f8631a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }
}
