package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class V1 {
    protected int zza;

    public static void b(Iterable iterable, InterfaceC0481r2 interfaceC0481r2) {
        Charset charset = AbstractC0467o2.f8631a;
        iterable.getClass();
        if (iterable instanceof InterfaceC0511x2) {
            List m0a = ((InterfaceC0511x2) iterable).m0a();
            AbstractC0515y1.v(interfaceC0481r2);
            interfaceC0481r2.size();
            Iterator it = m0a.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (!(next instanceof C0407c2)) {
                    if (next instanceof byte[]) {
                        byte[] bArr = (byte[]) next;
                        C0407c2.f(bArr, 0, bArr.length);
                        throw null;
                    }
                    String str = (String) next;
                    throw null;
                }
                C0407c2 c0407c2 = (C0407c2) next;
                throw null;
            }
        } else if (iterable instanceof G2) {
            interfaceC0481r2.addAll((Collection) iterable);
        } else {
            if ((interfaceC0481r2 instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) interfaceC0481r2).ensureCapacity(((Collection) iterable).size() + interfaceC0481r2.size());
            }
            int size = interfaceC0481r2.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String n = AbstractC1111a.n(interfaceC0481r2.size() - size, "Element at index ", " is null.");
                    for (int size2 = interfaceC0481r2.size() - 1; size2 >= size; size2--) {
                        interfaceC0481r2.remove(size2);
                    }
                    throw new NullPointerException(n);
                }
                interfaceC0481r2.add(obj);
            }
        }
    }

    public abstract int a(L2 l22);

    public final byte[] c() {
        try {
            int a7 = ((AbstractC0457m2) this).a(null);
            byte[] bArr = new byte[a7];
            C0412d2 c0412d2 = new C0412d2(a7, bArr);
            ((AbstractC0457m2) this).i(c0412d2);
            if (c0412d2.o() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e3) {
            throw new RuntimeException(AbstractC1111a.r("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e3);
        }
    }
}
