package Q;

import android.database.DataSetObserver;
import k.AbstractC0897k0;
/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2819a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2820b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f2819a = i7;
        this.f2820b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f2819a) {
            case 0:
                c cVar = (c) this.f2820b;
                cVar.f2821q = true;
                cVar.notifyDataSetChanged();
                return;
            default:
                AbstractC0897k0 abstractC0897k0 = (AbstractC0897k0) this.f2820b;
                if (abstractC0897k0.f12049L.isShowing()) {
                    abstractC0897k0.c();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f2819a) {
            case 0:
                c cVar = (c) this.f2820b;
                cVar.f2821q = false;
                cVar.notifyDataSetInvalidated();
                return;
            default:
                ((AbstractC0897k0) this.f2820b).dismiss();
                return;
        }
    }
}
