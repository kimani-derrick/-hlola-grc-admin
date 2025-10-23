package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0342u;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f5381a;

    /* renamed from: b  reason: collision with root package name */
    public final A5.i f5382b = new A5.i();

    /* renamed from: c  reason: collision with root package name */
    public n f5383c;
    public final OnBackInvokedCallback d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f5384e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5385g;

    public w(Runnable runnable) {
        OnBackInvokedCallback a7;
        this.f5381a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            if (i7 >= 34) {
                a7 = t.f5377a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1));
            } else {
                a7 = r.f5351a.a(new p(this, 2));
            }
            this.d = a7;
        }
    }

    public final void a(InterfaceC0342u interfaceC0342u, n nVar) {
        M5.g.f(nVar, "onBackPressedCallback");
        P1.c q5 = interfaceC0342u.q();
        if (q5.l() == EnumC0337o.f6817q) {
            return;
        }
        nVar.f5343b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, q5, nVar));
        e();
        nVar.f5344c = new v(0, this, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final u b(n nVar) {
        M5.g.f(nVar, "onBackPressedCallback");
        this.f5382b.g(nVar);
        u uVar = new u(this, nVar);
        nVar.f5343b.add(uVar);
        e();
        nVar.f5344c = new v(0, this, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        return uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        ?? r22;
        n nVar = this.f5383c;
        if (nVar == null) {
            A5.i iVar = this.f5382b;
            ListIterator listIterator = iVar.listIterator(iVar.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    r22 = listIterator.previous();
                    if (((n) r22).f5342a) {
                        break;
                    }
                } else {
                    r22 = 0;
                    break;
                }
            }
            nVar = r22;
        }
        this.f5383c = null;
        if (nVar != null) {
            nVar.b();
            return;
        }
        Runnable runnable = this.f5381a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z7) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f5384e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f5351a;
        if (z7 && !this.f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else if (z7 || !this.f) {
        } else {
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void e() {
        boolean z7 = this.f5385g;
        A5.i iVar = this.f5382b;
        boolean z8 = false;
        if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
            Iterator it = iVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((n) it.next()).f5342a) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f5385g = z8;
        if (z8 != z7 && Build.VERSION.SDK_INT >= 33) {
            d(z8);
        }
    }
}
