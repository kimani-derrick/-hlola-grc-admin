package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class P implements N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S f5905a;

    public P(S s6) {
        this.f5905a = s6;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        S s6 = this.f5905a;
        ArrayList arrayList3 = s6.d;
        C0247a c0247a = (C0247a) arrayList3.get(arrayList3.size() - 1);
        s6.f5928h = c0247a;
        Iterator it = c0247a.f5980a.iterator();
        while (it.hasNext()) {
            ComponentCallbacksC0269x componentCallbacksC0269x = ((a0) it.next()).f5998b;
            if (componentCallbacksC0269x != null) {
                componentCallbacksC0269x.f6100C = true;
            }
        }
        boolean W = s6.W(arrayList, arrayList2, null, -1, 0);
        if (!s6.f5933m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet<ComponentCallbacksC0269x> linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(S.H((C0247a) it2.next()));
            }
            Iterator it3 = s6.f5933m.iterator();
            while (it3.hasNext()) {
                M m7 = (M) it3.next();
                for (ComponentCallbacksC0269x componentCallbacksC0269x2 : linkedHashSet) {
                    m7.getClass();
                }
            }
        }
        return W;
    }
}
