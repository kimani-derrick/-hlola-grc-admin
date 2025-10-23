package androidx.leanback.widget;

import android.os.Parcelable;
import android.util.SparseArray;
import m4.C0997b;
/* renamed from: androidx.leanback.widget.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282b implements w0.b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC0292g f6574a;

    public C0282b(AbstractC0292g abstractC0292g) {
        this.f6574a = abstractC0292g;
    }

    @Override // w0.b0
    public final void a(w0.k0 k0Var) {
        int i7;
        AbstractC0292g abstractC0292g = this.f6574a;
        C0321y c0321y = abstractC0292g.d1;
        c0321y.getClass();
        int e3 = k0Var.e();
        if (e3 != -1) {
            O2.e eVar = c0321y.f6698d0;
            int i8 = eVar.f2559a;
            if (i8 != 1) {
                if ((i8 == 2 || i8 == 3) && ((o.i) eVar.f2561c) != null) {
                    String num = Integer.toString(e3);
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    k0Var.f15576a.saveHierarchyState(sparseArray);
                    ((o.i) eVar.f2561c).m(num, sparseArray);
                }
            } else {
                o.i iVar = (o.i) eVar.f2561c;
                if (iVar != null) {
                    synchronized (((C0997b) iVar.f12806g)) {
                        i7 = iVar.f12804c;
                    }
                    if (i7 != 0) {
                        ((o.i) eVar.f2561c).n(Integer.toString(e3));
                    }
                }
            }
        }
        w0.b0 b0Var = abstractC0292g.f6585h1;
        if (b0Var != null) {
            b0Var.a(k0Var);
        }
    }
}
