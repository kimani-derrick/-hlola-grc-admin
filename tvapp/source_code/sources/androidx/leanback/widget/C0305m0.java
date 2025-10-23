package androidx.leanback.widget;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
/* renamed from: androidx.leanback.widget.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305m0 implements TextWatcher {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Runnable f6609q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ SearchBar f6610r;

    public C0305m0(SearchBar searchBar, RunnableC0303l0 runnableC0303l0) {
        this.f6610r = searchBar;
        this.f6609q = runnableC0303l0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        SearchBar searchBar = this.f6610r;
        if (searchBar.f6501L) {
            return;
        }
        Handler handler = searchBar.f6510x;
        Runnable runnable = this.f6609q;
        handler.removeCallbacks(runnable);
        searchBar.f6510x.post(runnable);
    }
}
