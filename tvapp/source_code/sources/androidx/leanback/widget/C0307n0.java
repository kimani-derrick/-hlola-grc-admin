package androidx.leanback.widget;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
/* renamed from: androidx.leanback.widget.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307n0 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6613a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6614b;

    public /* synthetic */ C0307n0(ViewGroup viewGroup, int i7) {
        this.f6613a = i7;
        this.f6614b = viewGroup;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f6613a) {
            case 0:
                SearchBar searchBar = (SearchBar) this.f6614b;
                if (3 == i7 || i7 == 0) {
                    searchBar.getClass();
                }
                if (1 == i7) {
                    searchBar.getClass();
                }
                if (2 != i7) {
                    return false;
                }
                searchBar.f6511y.hideSoftInputFromWindow(searchBar.f6503q.getWindowToken(), 0);
                searchBar.f6510x.postDelayed(new P.b(10, this), 500L);
                return true;
            default:
                ((SearchView) this.f6614b).p();
                return true;
        }
    }
}
