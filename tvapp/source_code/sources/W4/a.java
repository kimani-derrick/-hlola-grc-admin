package W4;

import Y4.d;
import r4.b;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3938q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ b f3939r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ d f3940s;

    public /* synthetic */ a(b bVar, d dVar, int i7) {
        this.f3938q = i7;
        this.f3939r = bVar;
        this.f3940s = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3938q) {
            case 0:
                this.f3939r.a(this.f3940s);
                return;
            default:
                this.f3939r.a(this.f3940s);
                return;
        }
    }
}
