package androidx.activity;

import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5342a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f5343b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public L5.a f5344c;

    public n(boolean z7) {
        this.f5342a = z7;
    }

    public void a() {
    }

    public abstract void b();

    public void c(b bVar) {
        M5.g.f(bVar, "backEvent");
    }

    public void d(b bVar) {
        M5.g.f(bVar, "backEvent");
    }

    public final void e(boolean z7) {
        this.f5342a = z7;
        L5.a aVar = this.f5344c;
        if (aVar != null) {
            aVar.b();
        }
    }
}
