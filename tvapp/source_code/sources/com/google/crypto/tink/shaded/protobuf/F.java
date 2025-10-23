package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class F extends H {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f9065c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i7, long j7, Object obj) {
        List j8;
        D d;
        List list = (List) n0.f9149c.i(j7, obj);
        if (list.isEmpty()) {
            if (list instanceof E) {
                j8 = new D(i7);
            } else if ((list instanceof X) && (list instanceof InterfaceC0546y)) {
                j8 = ((InterfaceC0546y) list).j(i7);
            } else {
                j8 = new ArrayList(i7);
            }
        } else {
            if (f9065c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i7);
                arrayList.addAll(list);
                d = arrayList;
            } else if (list instanceof i0) {
                D d7 = new D(list.size() + i7);
                d7.addAll((i0) list);
                d = d7;
            } else if ((list instanceof X) && (list instanceof InterfaceC0546y)) {
                InterfaceC0546y interfaceC0546y = (InterfaceC0546y) list;
                if (!((AbstractC0524b) interfaceC0546y).f9103q) {
                    j8 = interfaceC0546y.j(list.size() + i7);
                } else {
                    return list;
                }
            } else {
                return list;
            }
            n0.v(j7, obj, d);
            return d;
        }
        n0.v(j7, obj, j8);
        return j8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final void a(long j7, Object obj) {
        Object unmodifiableList;
        List list = (List) n0.f9149c.i(j7, obj);
        if (list instanceof E) {
            unmodifiableList = ((E) list).e();
        } else {
            if (f9065c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof X) && (list instanceof InterfaceC0546y)) {
                AbstractC0524b abstractC0524b = (AbstractC0524b) ((InterfaceC0546y) list);
                if (abstractC0524b.f9103q) {
                    abstractC0524b.f9103q = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        n0.v(j7, obj, unmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final void b(long j7, Object obj, Object obj2) {
        List list = (List) n0.f9149c.i(j7, obj2);
        List d = d(list.size(), j7, obj);
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        n0.v(j7, obj, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final List c(long j7, Object obj) {
        return d(10, j7, obj);
    }
}
