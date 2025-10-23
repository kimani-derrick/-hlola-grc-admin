package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class F extends H {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f5700c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i7, long j7, Object obj) {
        List j8;
        D d;
        List list = (List) s0.d.i(j7, obj);
        if (list.isEmpty()) {
            if (list instanceof E) {
                j8 = new D(i7);
            } else if ((list instanceof X) && (list instanceof InterfaceC0245y)) {
                j8 = ((InterfaceC0245y) list).j(i7);
            } else {
                j8 = new ArrayList(i7);
            }
        } else {
            if (f5700c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i7);
                arrayList.addAll(list);
                d = arrayList;
            } else if (list instanceof n0) {
                D d7 = new D(list.size() + i7);
                d7.addAll((n0) list);
                d = d7;
            } else if ((list instanceof X) && (list instanceof InterfaceC0245y)) {
                InterfaceC0245y interfaceC0245y = (InterfaceC0245y) list;
                if (!((AbstractC0222b) interfaceC0245y).f5742q) {
                    j8 = interfaceC0245y.j(list.size() + i7);
                } else {
                    return list;
                }
            } else {
                return list;
            }
            s0.r(j7, obj, d);
            return d;
        }
        s0.r(j7, obj, j8);
        return j8;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final void a(long j7, Object obj) {
        Object unmodifiableList;
        List list = (List) s0.d.i(j7, obj);
        if (list instanceof E) {
            unmodifiableList = ((E) list).e();
        } else {
            if (f5700c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof X) && (list instanceof InterfaceC0245y)) {
                AbstractC0222b abstractC0222b = (AbstractC0222b) ((InterfaceC0245y) list);
                if (abstractC0222b.f5742q) {
                    abstractC0222b.f5742q = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        s0.r(j7, obj, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final void b(long j7, Object obj, Object obj2) {
        List list = (List) s0.d.i(j7, obj2);
        List d = d(list.size(), j7, obj);
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        s0.r(j7, obj, list);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final List c(long j7, Object obj) {
        return d(10, j7, obj);
    }
}
