package androidx.fragment.app;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6031a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6032b;

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(ViewGroup viewGroup);

    public void c(androidx.activity.b bVar, ViewGroup viewGroup) {
        M5.g.f(bVar, "backEvent");
        M5.g.f(viewGroup, "container");
    }

    public void d(ViewGroup viewGroup) {
    }
}
