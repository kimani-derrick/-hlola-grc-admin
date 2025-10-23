package coil.target;

import M5.g;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0328f;
import androidx.lifecycle.InterfaceC0342u;
/* loaded from: classes.dex */
public abstract class GenericViewTarget<T extends View> implements InterfaceC0328f {

    /* renamed from: q  reason: collision with root package name */
    public boolean f7281q;

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void a(InterfaceC0342u interfaceC0342u) {
        g.f(interfaceC0342u, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final /* synthetic */ void b(InterfaceC0342u interfaceC0342u) {
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void c(InterfaceC0342u interfaceC0342u) {
        g.f(interfaceC0342u, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final /* synthetic */ void f(InterfaceC0342u interfaceC0342u) {
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void h(InterfaceC0342u interfaceC0342u) {
        this.f7281q = false;
        m();
    }

    @Override // androidx.lifecycle.InterfaceC0328f
    public final void i(InterfaceC0342u interfaceC0342u) {
        this.f7281q = true;
        m();
    }

    public abstract Drawable j();

    public abstract ImageView k();

    public abstract void l(Drawable drawable);

    public final void m() {
        Drawable j7 = j();
        Animatable animatable = j7 instanceof Animatable ? (Animatable) j7 : null;
        if (animatable == null) {
            return;
        }
        if (this.f7281q) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void n(Drawable drawable) {
        Drawable j7 = j();
        Animatable animatable = j7 instanceof Animatable ? (Animatable) j7 : null;
        if (animatable != null) {
            animatable.stop();
        }
        l(drawable);
        m();
    }
}
