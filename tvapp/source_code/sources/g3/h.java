package g3;

import android.app.PendingIntent;
import android.os.Bundle;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public Object f10804a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10805b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0733b f10806c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f10807e;
    public final /* synthetic */ AbstractC0733b f;

    public h(AbstractC0733b abstractC0733b, int i7, Bundle bundle) {
        this.f = abstractC0733b;
        Boolean bool = Boolean.TRUE;
        this.f10806c = abstractC0733b;
        this.f10804a = bool;
        this.f10805b = false;
        this.d = i7;
        this.f10807e = bundle;
    }

    public final /* bridge */ void a() {
        d3.b bVar;
        AbstractC0733b abstractC0733b = this.f;
        PendingIntent pendingIntent = null;
        int i7 = this.d;
        if (i7 == 0) {
            if (!c()) {
                abstractC0733b.g(1, null);
                bVar = new d3.b(8, null);
            } else {
                return;
            }
        } else {
            abstractC0733b.g(1, null);
            Bundle bundle = this.f10807e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            bVar = new d3.b(i7, pendingIntent);
        }
        b(bVar);
    }

    public abstract void b(d3.b bVar);

    public abstract boolean c();

    public final void d() {
        synchronized (this) {
            this.f10804a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f10806c.f10767k) {
            this.f10806c.f10767k.remove(this);
        }
    }
}
