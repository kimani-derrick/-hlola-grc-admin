package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
/* loaded from: classes.dex */
public final class z0 implements AdapterView.OnItemClickListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ SearchView f12116q;

    public z0(SearchView searchView) {
        this.f12116q = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        this.f12116q.m(i7);
    }
}
