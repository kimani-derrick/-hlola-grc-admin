package k;

import java.lang.reflect.Field;
/* renamed from: k.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0891h0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12028q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ AbstractC0897k0 f12029r;

    public /* synthetic */ RunnableC0891h0(AbstractC0897k0 abstractC0897k0, int i7) {
        this.f12028q = i7;
        this.f12029r = abstractC0897k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0897k0 abstractC0897k0 = this.f12029r;
        switch (this.f12028q) {
            case 0:
                C0907p0 c0907p0 = abstractC0897k0.f12052s;
                if (c0907p0 != null) {
                    c0907p0.setListSelectionHidden(true);
                    c0907p0.requestLayout();
                    return;
                }
                return;
            default:
                C0907p0 c0907p02 = abstractC0897k0.f12052s;
                if (c0907p02 != null) {
                    Field field = K.O.f1447a;
                    if (c0907p02.isAttachedToWindow() && abstractC0897k0.f12052s.getCount() > abstractC0897k0.f12052s.getChildCount() && abstractC0897k0.f12052s.getChildCount() <= Integer.MAX_VALUE) {
                        abstractC0897k0.f12049L.setInputMethodMode(2);
                        abstractC0897k0.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
