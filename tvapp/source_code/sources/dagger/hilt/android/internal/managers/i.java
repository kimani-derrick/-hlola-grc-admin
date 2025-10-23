package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.InterfaceC0340s;
import androidx.lifecycle.InterfaceC0342u;
/* loaded from: classes.dex */
public final class i extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public LayoutInflater f9339a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f9340b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, ComponentCallbacksC0269x componentCallbacksC0269x) {
        super(context);
        context.getClass();
        InterfaceC0340s interfaceC0340s = new InterfaceC0340s() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            @Override // androidx.lifecycle.InterfaceC0340s
            public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
                if (enumC0336n == EnumC0336n.ON_DESTROY) {
                    i iVar = i.this;
                    iVar.getClass();
                    iVar.f9339a = null;
                    iVar.f9340b = null;
                }
            }
        };
        this.f9339a = null;
        componentCallbacksC0269x.getClass();
        componentCallbacksC0269x.f6126e0.g(interfaceC0340s);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f9340b == null) {
                if (this.f9339a == null) {
                    this.f9339a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f9340b = this.f9339a.cloneInContext(this);
            }
            return this.f9340b;
        }
        return getBaseContext().getSystemService(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.view.LayoutInflater r2, androidx.fragment.app.ComponentCallbacksC0269x r3) {
        /*
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.f9339a = r2
            r3.getClass()
            androidx.lifecycle.w r2 = r3.f6126e0
            r2.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.i.<init>(android.view.LayoutInflater, androidx.fragment.app.x):void");
    }
}
