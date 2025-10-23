package androidx.leanback.widget;

import android.view.View;
/* renamed from: androidx.leanback.widget.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnFocusChangeListenerC0301k0 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchBar f6606b;

    public /* synthetic */ View$OnFocusChangeListenerC0301k0(SearchBar searchBar, int i7) {
        this.f6605a = i7;
        this.f6606b = searchBar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z7) {
        switch (this.f6605a) {
            case 0:
                SearchBar searchBar = this.f6606b;
                if (z7) {
                    searchBar.f6510x.post(new RunnableC0303l0(searchBar, 1));
                } else {
                    searchBar.f6511y.hideSoftInputFromWindow(searchBar.f6503q.getWindowToken(), 0);
                }
                searchBar.d(z7);
                return;
            default:
                SearchBar searchBar2 = this.f6606b;
                if (z7) {
                    searchBar2.f6511y.hideSoftInputFromWindow(searchBar2.f6503q.getWindowToken(), 0);
                    if (searchBar2.f6512z) {
                        searchBar2.a();
                        searchBar2.f6512z = false;
                    }
                } else {
                    searchBar2.b();
                }
                searchBar2.d(z7);
                return;
        }
    }
}
