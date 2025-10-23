package androidx.leanback.app;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import w0.C1365t;
import w0.X;
/* loaded from: classes.dex */
public final class j extends X {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6231a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6232b;

    public /* synthetic */ j(int i7, Object obj) {
        this.f6231a = i7;
        this.f6232b = obj;
    }

    @Override // w0.X
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f6231a) {
            case 0:
                if (i7 == 0) {
                    ArrayList arrayList = recyclerView.f6962z0;
                    if (arrayList != null) {
                        arrayList.remove(this);
                    }
                    s sVar = (s) this.f6232b;
                    if (!sVar.f6281k1) {
                        sVar.q0();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // w0.X
    public void b(RecyclerView recyclerView, int i7, int i8) {
        boolean z7;
        boolean z8;
        switch (this.f6231a) {
            case 1:
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                C1365t c1365t = (C1365t) this.f6232b;
                int computeVerticalScrollRange = c1365t.f15674s.computeVerticalScrollRange();
                int i9 = c1365t.f15673r;
                int i10 = computeVerticalScrollRange - i9;
                int i11 = c1365t.f15659a;
                if (i10 > 0 && i9 >= i11) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                c1365t.f15675t = z7;
                int computeHorizontalScrollRange = c1365t.f15674s.computeHorizontalScrollRange();
                int i12 = c1365t.f15672q;
                if (computeHorizontalScrollRange - i12 > 0 && i12 >= i11) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                c1365t.f15676u = z8;
                boolean z9 = c1365t.f15675t;
                if (!z9 && !z8) {
                    if (c1365t.f15677v != 0) {
                        c1365t.g(0);
                        return;
                    }
                    return;
                }
                if (z9) {
                    float f = i9;
                    c1365t.f15668l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                    c1365t.f15667k = Math.min(i9, (i9 * i9) / computeVerticalScrollRange);
                }
                if (c1365t.f15676u) {
                    float f7 = computeHorizontalScrollOffset;
                    float f8 = i12;
                    c1365t.f15670o = (int) ((((f8 / 2.0f) + f7) * f8) / computeHorizontalScrollRange);
                    c1365t.n = Math.min(i12, (i12 * i12) / computeHorizontalScrollRange);
                }
                int i13 = c1365t.f15677v;
                if (i13 == 0 || i13 == 1) {
                    c1365t.g(1);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
