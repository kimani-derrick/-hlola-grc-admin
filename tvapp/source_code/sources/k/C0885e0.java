package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
/* renamed from: k.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885e0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12003q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f12004r;

    public /* synthetic */ C0885e0(int i7, Object obj) {
        this.f12003q = i7;
        this.f12004r = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
        C0907p0 c0907p0;
        switch (this.f12003q) {
            case 0:
                if (i7 != -1 && (c0907p0 = ((AbstractC0897k0) this.f12004r).f12052s) != null) {
                    c0907p0.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f12004r).n(i7);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.f12003q;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
