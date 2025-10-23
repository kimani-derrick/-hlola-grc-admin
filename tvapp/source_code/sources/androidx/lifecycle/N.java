package androidx.lifecycle;

import a.AbstractC0189a;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import z5.C1524f;
/* loaded from: classes.dex */
public final class N {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f6768a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f6769b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f6770c;
    public final LinkedHashMap d;

    /* renamed from: e  reason: collision with root package name */
    public final A0.d f6771e;

    public N() {
        this.f6768a = new LinkedHashMap();
        this.f6769b = new LinkedHashMap();
        this.f6770c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f6771e = new androidx.activity.e(3, this);
    }

    public static Bundle a(N n) {
        A a7;
        M5.g.f(n, "this$0");
        Iterator it = A5.w.N(n.f6769b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = n.f6768a;
            if (hasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Bundle a8 = ((A0.d) entry.getValue()).a();
                M5.g.f(str, "key");
                if (a8 != null) {
                    Class[] clsArr = f;
                    for (int i7 = 0; i7 < 29; i7++) {
                        Class cls = clsArr[i7];
                        M5.g.c(cls);
                        if (!cls.isInstance(a8)) {
                        }
                    }
                    throw new IllegalArgumentException("Can't put value with type " + a8.getClass() + " into saved state");
                }
                Object obj = n.f6770c.get(str);
                if (obj instanceof A) {
                    a7 = (A) obj;
                } else {
                    a7 = null;
                }
                if (a7 != null) {
                    a7.e(a8);
                } else {
                    linkedHashMap.put(str, a8);
                }
                Z5.m mVar = (Z5.m) n.d.get(str);
                if (mVar != null) {
                    ((Z5.w) mVar).f(a8);
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str2 : keySet) {
                    arrayList.add(str2);
                    arrayList2.add(linkedHashMap.get(str2));
                }
                return AbstractC0189a.h(new C1524f("keys", arrayList), new C1524f("values", arrayList2));
            }
        }
    }

    public N(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6768a = linkedHashMap;
        this.f6769b = new LinkedHashMap();
        this.f6770c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f6771e = new androidx.activity.e(3, this);
        linkedHashMap.putAll(hashMap);
    }
}
