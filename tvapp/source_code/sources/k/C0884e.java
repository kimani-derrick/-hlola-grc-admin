package k;

import android.content.Context;
import android.view.View;
import com.boxhdo.android.tv.R;
import e5.C0658c;
/* renamed from: k.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884e extends C0658c {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f12002m = 1;
    public final /* synthetic */ C0890h n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0884e(C0890h c0890h, Context context, j.j jVar, C0888g c0888g) {
        super(R.attr.actionOverflowMenuStyle, 0, context, c0888g, jVar, true);
        this.n = c0890h;
        this.f10170e = 8388613;
        Z5.n nVar = c0890h.f12017L;
        this.f10173i = nVar;
        j.l lVar = (j.l) this.f10174j;
        if (lVar != null) {
            lVar.j(nVar);
        }
    }

    @Override // e5.C0658c
    public final void h() {
        switch (this.f12002m) {
            case 0:
                this.n.f12014I = null;
                super.h();
                return;
            default:
                C0890h c0890h = this.n;
                j.j jVar = c0890h.f12020s;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0890h.f12013H = null;
                super.h();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0884e(C0890h c0890h, Context context, j.t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, tVar, false);
        this.n = c0890h;
        if (!tVar.f11512w.d()) {
            View view2 = c0890h.f12025x;
            this.d = view2 == null ? c0890h.f12024w : view2;
        }
        Z5.n nVar = c0890h.f12017L;
        this.f10173i = nVar;
        j.l lVar = (j.l) this.f10174j;
        if (lVar != null) {
            lVar.j(nVar);
        }
    }
}
