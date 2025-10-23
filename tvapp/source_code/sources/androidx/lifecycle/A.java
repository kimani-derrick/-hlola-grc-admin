package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import java.util.Map;
import l.C0962b;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public class A {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f6722j = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f6723a;

    /* renamed from: b  reason: collision with root package name */
    public final m.f f6724b = new m.f();

    /* renamed from: c  reason: collision with root package name */
    public int f6725c = 0;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f6726e;
    public volatile Object f;

    /* renamed from: g  reason: collision with root package name */
    public int f6727g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6728h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6729i;

    public A() {
        Object obj = f6722j;
        this.f = obj;
        this.f6726e = obj;
        this.f6727g = -1;
    }

    public static void a(String str) {
        C0962b.K().f12229c.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(AbstractC1111a.r("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(AbstractC0347z abstractC0347z) {
        if (!abstractC0347z.f6839r) {
            return;
        }
        if (!abstractC0347z.l()) {
            abstractC0347z.j(false);
            return;
        }
        int i7 = abstractC0347z.f6840s;
        int i8 = this.f6727g;
        if (i7 >= i8) {
            return;
        }
        abstractC0347z.f6840s = i8;
        Z5.n nVar = abstractC0347z.f6838q;
        Object obj = this.f6726e;
        nVar.getClass();
        if (((InterfaceC0342u) obj) != null) {
            DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q = (DialogInterface$OnCancelListenerC0263q) nVar.f4918q;
            if (dialogInterface$OnCancelListenerC0263q.f6076u0) {
                View b02 = dialogInterface$OnCancelListenerC0263q.b0();
                if (b02.getParent() == null) {
                    if (dialogInterface$OnCancelListenerC0263q.y0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + nVar + " setting the content view on " + dialogInterface$OnCancelListenerC0263q.y0);
                        }
                        dialogInterface$OnCancelListenerC0263q.y0.setContentView(b02);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    public final void c(AbstractC0347z abstractC0347z) {
        if (this.f6728h) {
            this.f6729i = true;
            return;
        }
        this.f6728h = true;
        do {
            this.f6729i = false;
            if (abstractC0347z != null) {
                b(abstractC0347z);
                abstractC0347z = null;
            } else {
                m.f fVar = this.f6724b;
                fVar.getClass();
                m.d dVar = new m.d(fVar);
                fVar.f12378s.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((AbstractC0347z) ((Map.Entry) dVar.next()).getValue());
                    if (this.f6729i) {
                        break;
                    }
                }
            }
        } while (this.f6729i);
        this.f6728h = false;
    }

    public final void d(Z5.n nVar) {
        Object obj;
        a("observeForever");
        AbstractC0347z abstractC0347z = new AbstractC0347z(this, nVar);
        m.f fVar = this.f6724b;
        m.c b7 = fVar.b(nVar);
        if (b7 != null) {
            obj = b7.f12370r;
        } else {
            m.c cVar = new m.c(nVar, abstractC0347z);
            fVar.f12379t++;
            m.c cVar2 = fVar.f12377r;
            if (cVar2 == null) {
                fVar.f12376q = cVar;
            } else {
                cVar2.f12371s = cVar;
                cVar.f12372t = cVar2;
            }
            fVar.f12377r = cVar;
            obj = null;
        }
        AbstractC0347z abstractC0347z2 = (AbstractC0347z) obj;
        if (!(abstractC0347z2 instanceof LiveData$LifecycleBoundObserver)) {
            if (abstractC0347z2 != null) {
                return;
            }
            abstractC0347z.j(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public final void e(Object obj) {
        a("setValue");
        this.f6727g++;
        this.f6726e = obj;
        c(null);
    }
}
