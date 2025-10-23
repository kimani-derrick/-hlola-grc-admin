package androidx.emoji2.text;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f5863a;

    /* renamed from: b  reason: collision with root package name */
    public m f5864b;

    public q(int i7) {
        this.f5863a = new SparseArray(i7);
    }

    public final void a(m mVar, int i7, int i8) {
        q qVar;
        int a7 = mVar.a(i7);
        SparseArray sparseArray = this.f5863a;
        if (sparseArray == null) {
            qVar = null;
        } else {
            qVar = (q) sparseArray.get(a7);
        }
        if (qVar == null) {
            qVar = new q(1);
            sparseArray.put(mVar.a(i7), qVar);
        }
        if (i8 > i7) {
            qVar.a(mVar, i7 + 1, i8);
        } else {
            qVar.f5864b = mVar;
        }
    }
}
