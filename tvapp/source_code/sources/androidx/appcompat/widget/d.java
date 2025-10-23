package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f5568q;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f5568q = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f5568q;
        if (searchAutoComplete.f5520w) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f5520w = false;
        }
    }
}
