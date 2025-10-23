package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0340s {

    /* renamed from: q  reason: collision with root package name */
    public final Object f6779q;

    /* renamed from: r  reason: collision with root package name */
    public final C0324b f6780r;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f6779q = obj;
        C0326d c0326d = C0326d.f6811c;
        Class<?> cls = obj.getClass();
        C0324b c0324b = (C0324b) c0326d.f6812a.get(cls);
        this.f6780r = c0324b == null ? c0326d.a(cls, null) : c0324b;
    }

    @Override // androidx.lifecycle.InterfaceC0340s
    public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        HashMap hashMap = this.f6780r.f6806a;
        Object obj = this.f6779q;
        C0324b.a((List) hashMap.get(enumC0336n), interfaceC0342u, enumC0336n, obj);
        C0324b.a((List) hashMap.get(EnumC0336n.ON_ANY), interfaceC0342u, enumC0336n, obj);
    }
}
