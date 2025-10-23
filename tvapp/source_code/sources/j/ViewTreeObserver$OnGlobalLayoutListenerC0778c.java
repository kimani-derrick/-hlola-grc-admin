package j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: j.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC0778c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f11406q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ l f11407r;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC0778c(l lVar, int i7) {
        this.f11406q = i7;
        this.f11407r = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f11406q) {
            case 0:
                f fVar = (f) this.f11407r;
                if (fVar.h()) {
                    ArrayList arrayList = fVar.f11439y;
                    if (arrayList.size() > 0 && !((e) arrayList.get(0)).f11413a.f12048K) {
                        View view = fVar.F;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).f11413a.c();
                            }
                            return;
                        }
                        fVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                s sVar = (s) this.f11407r;
                if (sVar.h() && !sVar.f11509y.f12048K) {
                    View view2 = sVar.f11495D;
                    if (view2 != null && view2.isShown()) {
                        sVar.f11509y.c();
                        return;
                    } else {
                        sVar.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
