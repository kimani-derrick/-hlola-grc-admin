package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: com.google.android.gms.internal.measurement.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419f implements InterfaceC0439j, InterfaceC0464o, Iterable {

    /* renamed from: q  reason: collision with root package name */
    public final TreeMap f8553q;

    /* renamed from: r  reason: collision with root package name */
    public final TreeMap f8554r;

    public C0419f() {
        this.f8553q = new TreeMap();
        this.f8554r = new TreeMap();
    }

    public final ArrayList A() {
        ArrayList arrayList = new ArrayList(u());
        for (int i7 = 0; i7 < u(); i7++) {
            arrayList.add(s(i7));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0439j
    public final InterfaceC0464o b(String str) {
        InterfaceC0464o interfaceC0464o;
        return "length".equals(str) ? new C0429h(Double.valueOf(u())) : (!f(str) || (interfaceC0464o = (InterfaceC0464o) this.f8554r.get(str)) == null) ? InterfaceC0464o.f8621e : interfaceC0464o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Boolean c() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0419f) {
            C0419f c0419f = (C0419f) obj;
            if (u() != c0419f.u()) {
                return false;
            }
            TreeMap treeMap = this.f8553q;
            if (treeMap.isEmpty()) {
                return c0419f.f8553q.isEmpty();
            }
            for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
                if (!s(intValue).equals(c0419f.s(intValue))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0439j
    public final boolean f(String str) {
        return "length".equals(str) || this.f8554r.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final String g() {
        return v(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Iterator h() {
        return new C0414e(this.f8553q.keySet().iterator(), this.f8554r.keySet().iterator());
    }

    public final int hashCode() {
        return this.f8553q.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0483s(2, this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o l() {
        Integer num;
        InterfaceC0464o l7;
        C0419f c0419f = new C0419f();
        for (Map.Entry entry : this.f8553q.entrySet()) {
            boolean z7 = entry.getValue() instanceof InterfaceC0439j;
            TreeMap treeMap = c0419f.f8553q;
            if (z7) {
                num = (Integer) entry.getKey();
                l7 = (InterfaceC0464o) entry.getValue();
            } else {
                num = (Integer) entry.getKey();
                l7 = ((InterfaceC0464o) entry.getValue()).l();
            }
            treeMap.put(num, l7);
        }
        return c0419f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0439j
    public final void n(String str, InterfaceC0464o interfaceC0464o) {
        TreeMap treeMap = this.f8554r;
        if (interfaceC0464o == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC0464o);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03a2, code lost:
        if (u() == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03e4, code lost:
        if (com.google.android.gms.internal.measurement.AbstractC0447k2.a(r26, r28, (com.google.android.gms.internal.measurement.C0469p) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).u() != u()) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0188  */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0464o o(java.lang.String r27, C4.b r28, java.util.ArrayList r29) {
        /*
            Method dump skipped, instructions count: 2416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0419f.o(java.lang.String, C4.b, java.util.ArrayList):com.google.android.gms.internal.measurement.o");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Double r() {
        TreeMap treeMap = this.f8553q;
        return treeMap.size() == 1 ? s(0).r() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final InterfaceC0464o s(int i7) {
        InterfaceC0464o interfaceC0464o;
        if (i7 < u()) {
            return (!y(i7) || (interfaceC0464o = (InterfaceC0464o) this.f8553q.get(Integer.valueOf(i7))) == null) ? InterfaceC0464o.f8621e : interfaceC0464o;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void t(InterfaceC0464o interfaceC0464o) {
        x(u(), interfaceC0464o);
    }

    public final String toString() {
        return v(",");
    }

    public final int u() {
        TreeMap treeMap = this.f8553q;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String v(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f8553q.isEmpty()) {
            for (int i7 = 0; i7 < u(); i7++) {
                InterfaceC0464o s6 = s(i7);
                sb.append(str);
                if (!(s6 instanceof C0493u) && !(s6 instanceof C0454m)) {
                    sb.append(s6.g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void w(int i7) {
        TreeMap treeMap = this.f8553q;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i7 > intValue || i7 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i7));
        if (i7 == intValue) {
            int i8 = i7 - 1;
            if (treeMap.containsKey(Integer.valueOf(i8)) || i8 < 0) {
                return;
            }
            treeMap.put(Integer.valueOf(i8), InterfaceC0464o.f8621e);
            return;
        }
        while (true) {
            i7++;
            if (i7 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            InterfaceC0464o interfaceC0464o = (InterfaceC0464o) treeMap.get(Integer.valueOf(i7));
            if (interfaceC0464o != null) {
                treeMap.put(Integer.valueOf(i7 - 1), interfaceC0464o);
                treeMap.remove(Integer.valueOf(i7));
            }
        }
    }

    public final void x(int i7, InterfaceC0464o interfaceC0464o) {
        if (i7 <= 32468) {
            if (i7 >= 0) {
                TreeMap treeMap = this.f8553q;
                Integer valueOf = Integer.valueOf(i7);
                if (interfaceC0464o == null) {
                    treeMap.remove(valueOf);
                    return;
                } else {
                    treeMap.put(valueOf, interfaceC0464o);
                    return;
                }
            }
            throw new IndexOutOfBoundsException(AbstractC0515y1.l("Out of bounds index: ", i7));
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean y(int i7) {
        if (i7 >= 0) {
            TreeMap treeMap = this.f8553q;
            if (i7 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i7));
            }
        }
        throw new IndexOutOfBoundsException(AbstractC0515y1.l("Out of bounds index: ", i7));
    }

    public final Iterator z() {
        return this.f8553q.keySet().iterator();
    }

    public C0419f(List list) {
        this();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                x(i7, (InterfaceC0464o) list.get(i7));
            }
        }
    }

    public C0419f(InterfaceC0464o... interfaceC0464oArr) {
        this(Arrays.asList(interfaceC0464oArr));
    }
}
