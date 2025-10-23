package androidx.leanback.app;

import K.O;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.widget.InterfaceC0294h;
import androidx.leanback.widget.InterfaceC0296i;
import androidx.leanback.widget.P;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class i implements InterfaceC0296i, InterfaceC0294h {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ s f6230q;

    public /* synthetic */ i(s sVar) {
        this.f6230q = sVar;
    }

    @Override // androidx.leanback.widget.InterfaceC0296i
    public View k(View view, int i7) {
        int i8;
        View view2;
        P p3;
        s sVar = this.f6230q;
        if (sVar.f6273b1 && sVar.f6285p1 != null) {
            return view;
        }
        View view3 = sVar.f6226p0;
        if (view3 != null && view != view3 && i7 == 33) {
            return view3;
        }
        if (view3 != null && view3.hasFocus() && i7 == 130) {
            if (sVar.f6273b1 && sVar.f6272a1) {
                return sVar.f6263Q0.f6197o0;
            }
            return sVar.f6262P0.W;
        }
        Field field = O.f1447a;
        boolean z7 = true;
        if (view.getLayoutDirection() != 1) {
            z7 = false;
        }
        int i9 = 17;
        if (z7) {
            i8 = 66;
        } else {
            i8 = 17;
        }
        if (!z7) {
            i9 = 66;
        }
        if (sVar.f6273b1 && i7 == i8) {
            if (sVar.f6263Q0.f6197o0.getScrollState() == 0 && !sVar.f6261O0.b() && !sVar.f6272a1 && (p3 = sVar.f6266T0) != null && p3.d() != 0) {
                return sVar.f6263Q0.f6197o0;
            }
            return view;
        } else if (i7 == i9) {
            if (sVar.f6263Q0.f6197o0.getScrollState() != 0 || sVar.f6261O0.b()) {
                return view;
            }
            ComponentCallbacksC0269x componentCallbacksC0269x = sVar.f6262P0;
            if (componentCallbacksC0269x != null && (view2 = componentCallbacksC0269x.W) != null) {
                return view2;
            }
            return view;
        } else if (i7 == 130 && sVar.f6272a1) {
            return view;
        } else {
            return null;
        }
    }
}
