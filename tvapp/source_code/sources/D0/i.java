package D0;

import android.content.Context;
import z5.C1527i;
import z5.C1529k;
/* loaded from: classes.dex */
public final class i implements C0.a {

    /* renamed from: q  reason: collision with root package name */
    public final Context f470q;

    /* renamed from: r  reason: collision with root package name */
    public final String f471r;

    /* renamed from: s  reason: collision with root package name */
    public final C.d f472s;

    /* renamed from: t  reason: collision with root package name */
    public final C1527i f473t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f474u;

    public i(Context context, String str, C.d dVar) {
        M5.g.f(context, "context");
        M5.g.f(dVar, "callback");
        this.f470q = context;
        this.f471r = str;
        this.f472s = dVar;
        this.f473t = new C1527i(new h(0, this));
    }

    @Override // C0.a
    public final c K() {
        return ((g) this.f473t.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f473t.f16473r != C1529k.f16478a) {
            ((g) this.f473t.getValue()).close();
        }
    }

    @Override // C0.a
    public final void setWriteAheadLoggingEnabled(boolean z7) {
        if (this.f473t.f16473r != C1529k.f16478a) {
            g gVar = (g) this.f473t.getValue();
            M5.g.f(gVar, "sQLiteOpenHelper");
            gVar.setWriteAheadLoggingEnabled(z7);
        }
        this.f474u = z7;
    }
}
