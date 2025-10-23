package androidx.leanback.app;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.widget.VerticalGridView;
/* renamed from: androidx.leanback.app.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277f extends p6.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0278g f6209b;

    public /* synthetic */ C0277f(AbstractC0278g abstractC0278g, int i7) {
        this.f6208a = i7;
        this.f6209b = abstractC0278g;
    }

    @Override // p6.d
    public final void x() {
        VerticalGridView verticalGridView;
        ComponentCallbacksC0269x componentCallbacksC0269x;
        View view;
        switch (this.f6208a) {
            case 0:
                AbstractC0278g abstractC0278g = this.f6209b;
                abstractC0278g.f6216H0 = null;
                abstractC0278g.G0.w(abstractC0278g.f6214E0);
                return;
            default:
                s sVar = (s) this.f6209b;
                sVar.f6285p1 = null;
                A0.f fVar = sVar.f6261O0;
                if (fVar != null) {
                    fVar.c();
                    if (!sVar.f6272a1 && (componentCallbacksC0269x = sVar.f6262P0) != null && (view = componentCallbacksC0269x.W) != null && !view.hasFocus()) {
                        view.requestFocus();
                    }
                }
                y yVar = sVar.f6263Q0;
                if (yVar != null) {
                    yVar.i0();
                    if (sVar.f6272a1 && (verticalGridView = sVar.f6263Q0.f6197o0) != null && !verticalGridView.hasFocus()) {
                        verticalGridView.requestFocus();
                    }
                }
                sVar.G0();
                return;
        }
    }
}
