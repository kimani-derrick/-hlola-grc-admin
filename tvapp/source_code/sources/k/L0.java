package k;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class L0 implements InterfaceC0896k, j.h {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Toolbar f11911q;

    public /* synthetic */ L0(Toolbar toolbar) {
        this.f11911q = toolbar;
    }

    @Override // j.h
    public void e(j.j jVar) {
        C0884e c0884e;
        Toolbar toolbar = this.f11911q;
        C0890h c0890h = toolbar.f5552q.f5460I;
        if (c0890h == null || (c0884e = c0890h.f12013H) == null || !c0884e.f()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.f1018s).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.H) it.next()).f5895a.t();
            }
        }
    }

    @Override // j.h
    public boolean m(MenuItem menuItem) {
        this.f11911q.getClass();
        return false;
    }
}
