package l5;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import w0.X;
/* renamed from: l5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978b extends X {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12271a;

    /* renamed from: b  reason: collision with root package name */
    public int f12272b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0980d f12273c;

    public C0978b(C0980d c0980d) {
        this.f12273c = c0980d;
    }

    @Override // w0.X
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z7;
        M5.g.f(recyclerView, "recyclerView");
        C0980d c0980d = this.f12273c;
        c0980d.f12276b.getClass();
        boolean z8 = this.f12271a;
        if (i7 != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f12271a = z7;
        if (z8 == z7) {
            return;
        }
        if (z7) {
            this.f12272b = c0980d.f12278e.f10168b;
        } else if (this.f12272b != -1) {
            c0980d.f12278e.b();
            this.f12272b = -1;
        }
        if (!this.f12271a) {
            C4.b bVar = c0980d.f12284l;
            if (bVar.G()) {
                ((LinkedList) bVar.f424u).clear();
            }
        }
    }
}
