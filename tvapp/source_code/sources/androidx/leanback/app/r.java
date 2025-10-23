package androidx.leanback.app;

import androidx.fragment.app.C0247a;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.S;
import androidx.leanback.widget.VerticalGridView;
import com.boxhdo.android.tv.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public int f6250q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f6251r = -1;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6252s = false;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ s f6253t;

    public r(s sVar) {
        this.f6253t = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        int i7 = this.f6250q;
        boolean z8 = this.f6252s;
        s sVar = this.f6253t;
        if (i7 == -1) {
            sVar.getClass();
        } else {
            sVar.f6278h1 = i7;
            y yVar = sVar.f6263Q0;
            if (yVar != null && sVar.f6261O0 != null) {
                if (yVar.f6200r0 != i7) {
                    yVar.f6200r0 = i7;
                    VerticalGridView verticalGridView = yVar.f6197o0;
                    if (verticalGridView != null && !yVar.f6202t0.f6194a) {
                        if (z8) {
                            verticalGridView.setSelectedPositionSmooth(i7);
                        } else {
                            verticalGridView.setSelectedPosition(i7);
                        }
                    }
                }
                if (sVar.r0(sVar.f6266T0, i7)) {
                    if (!sVar.f6281k1) {
                        VerticalGridView verticalGridView2 = sVar.f6263Q0.f6197o0;
                        if (sVar.f6272a1 && verticalGridView2 != null && verticalGridView2.getScrollState() != 0) {
                            S n = sVar.n();
                            n.getClass();
                            C0247a c0247a = new C0247a(n);
                            c0247a.h(R.id.scale_frame, new ComponentCallbacksC0269x());
                            c0247a.e(false);
                            ArrayList arrayList = verticalGridView2.f6962z0;
                            j jVar = sVar.f6291v1;
                            if (arrayList != null) {
                                arrayList.remove(jVar);
                            }
                            verticalGridView2.i(jVar);
                        } else {
                            sVar.q0();
                        }
                    }
                    if (sVar.f6273b1 && sVar.f6272a1) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    sVar.s0(z7);
                }
                q qVar = sVar.f6264R0;
                if (qVar != null) {
                    F f = (F) ((ComponentCallbacksC0269x) qVar.f6249a);
                    if (f.f6200r0 != i7) {
                        f.f6200r0 = i7;
                        VerticalGridView verticalGridView3 = f.f6197o0;
                        if (verticalGridView3 != null && !f.f6202t0.f6194a) {
                            if (z8) {
                                verticalGridView3.setSelectedPositionSmooth(i7);
                            } else {
                                verticalGridView3.setSelectedPosition(i7);
                            }
                        }
                    }
                }
                sVar.G0();
            }
        }
        this.f6250q = -1;
        this.f6251r = -1;
        this.f6252s = false;
    }
}
