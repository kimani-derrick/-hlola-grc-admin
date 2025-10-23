package androidx.leanback.app;

import androidx.leanback.widget.AbstractC0281a0;
import androidx.leanback.widget.AbstractC0283b0;
import androidx.leanback.widget.AbstractC0287d0;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class l extends AbstractC0283b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6235a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6236b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6237c;

    public l() {
        this.f6235a = 1;
        this.f6236b = new ArrayList();
        this.f6237c = new HashMap();
    }

    @Override // androidx.leanback.widget.AbstractC0283b0
    public final AbstractC0281a0 a(Object obj) {
        Object obj2;
        AbstractC0281a0 a7;
        switch (this.f6235a) {
            case 0:
                ((AbstractC0287d0) obj).getClass();
                return ((AbstractC0283b0) this.f6236b).a(obj);
            default:
                Class<?> cls = obj.getClass();
                do {
                    obj2 = ((HashMap) this.f6237c).get(cls);
                    if (!(obj2 instanceof AbstractC0283b0) || (a7 = ((AbstractC0283b0) obj2).a(obj)) == null) {
                        cls = cls.getSuperclass();
                        if (obj2 == null) {
                        }
                        return (AbstractC0281a0) obj2;
                    }
                    return a7;
                } while (cls != null);
                return (AbstractC0281a0) obj2;
        }
    }

    @Override // androidx.leanback.widget.AbstractC0283b0
    public final AbstractC0281a0[] b() {
        switch (this.f6235a) {
            case 0:
                return (AbstractC0281a0[]) this.f6237c;
            default:
                ArrayList arrayList = (ArrayList) this.f6236b;
                return (AbstractC0281a0[]) arrayList.toArray(new AbstractC0281a0[arrayList.size()]);
        }
    }

    public void c(Class cls, AbstractC0281a0 abstractC0281a0) {
        ((HashMap) this.f6237c).put(cls, abstractC0281a0);
        ArrayList arrayList = (ArrayList) this.f6236b;
        if (!arrayList.contains(abstractC0281a0)) {
            arrayList.add(abstractC0281a0);
        }
    }

    public l(AbstractC0283b0 abstractC0283b0, androidx.leanback.widget.C c5, AbstractC0281a0[] abstractC0281a0Arr) {
        this.f6235a = 0;
        this.f6236b = abstractC0283b0;
        this.f6237c = abstractC0281a0Arr;
    }
}
