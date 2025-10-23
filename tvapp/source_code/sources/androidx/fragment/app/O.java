package androidx.fragment.app;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class O implements N {

    /* renamed from: a  reason: collision with root package name */
    public final String f5902a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5903b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5904c = 1;
    public final /* synthetic */ S d;

    public O(S s6, String str, int i7) {
        this.d = s6;
        this.f5902a = str;
        this.f5903b = i7;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.d.f5944y;
        if (componentCallbacksC0269x == null || this.f5903b >= 0 || this.f5902a != null || !componentCallbacksC0269x.n().U()) {
            return this.d.W(arrayList, arrayList2, this.f5902a, this.f5903b, this.f5904c);
        }
        return false;
    }
}
