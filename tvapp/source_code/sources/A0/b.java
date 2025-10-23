package A0;

import A5.k;
import Z5.u;
import android.util.Log;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.InterfaceC0340s;
import androidx.lifecycle.InterfaceC0342u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import n0.C0999A;
import n0.C1019j;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0340s {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f6r;

    public /* synthetic */ b(int i7, Object obj) {
        this.f5q = i7;
        this.f6r = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0340s
    public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        boolean z7;
        Object obj;
        switch (this.f5q) {
            case 0:
                e eVar = (e) this.f6r;
                M5.g.f(eVar, "this$0");
                if (enumC0336n == EnumC0336n.ON_START) {
                    z7 = true;
                } else if (enumC0336n == EnumC0336n.ON_STOP) {
                    z7 = false;
                } else {
                    return;
                }
                eVar.f9c = z7;
                return;
            case 1:
                C0999A c0999a = (C0999A) this.f6r;
                M5.g.f(c0999a, "this$0");
                c0999a.f12470q = enumC0336n.a();
                if (c0999a.f12459c != null) {
                    Iterator<E> it = c0999a.f12461g.iterator();
                    while (it.hasNext()) {
                        C1019j c1019j = (C1019j) it.next();
                        c1019j.getClass();
                        c1019j.f12545t = enumC0336n.a();
                        c1019j.c();
                    }
                    return;
                }
                return;
            default:
                p0.c cVar = (p0.c) this.f6r;
                M5.g.f(cVar, "this$0");
                if (enumC0336n == EnumC0336n.ON_CREATE) {
                    DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q = (DialogInterface$OnCancelListenerC0263q) interfaceC0342u;
                    Iterable<C1019j> iterable = (Iterable) ((u) cVar.b().f12559e.f3382r).getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        for (C1019j c1019j2 : iterable) {
                            if (M5.g.a(c1019j2.f12547v, dialogInterface$OnCancelListenerC0263q.f6112P)) {
                                return;
                            }
                        }
                    }
                    dialogInterface$OnCancelListenerC0263q.f0(false, false);
                    return;
                } else if (enumC0336n == EnumC0336n.ON_STOP) {
                    DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q2 = (DialogInterface$OnCancelListenerC0263q) interfaceC0342u;
                    if (!dialogInterface$OnCancelListenerC0263q2.h0().isShowing()) {
                        List list = (List) ((u) cVar.b().f12559e.f3382r).getValue();
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                obj = listIterator.previous();
                                if (M5.g.a(((C1019j) obj).f12547v, dialogInterface$OnCancelListenerC0263q2.f6112P)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        if (obj != null) {
                            C1019j c1019j3 = (C1019j) obj;
                            if (!M5.g.a(k.c0(list), c1019j3)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + dialogInterface$OnCancelListenerC0263q2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            cVar.i(c1019j3, false);
                            return;
                        }
                        throw new IllegalStateException(("Dialog " + dialogInterface$OnCancelListenerC0263q2 + " has already been popped off of the Navigation back stack").toString());
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
