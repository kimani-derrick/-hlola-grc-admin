package androidx.leanback.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
/* renamed from: androidx.leanback.widget.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0303l0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f6607q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ SearchBar f6608r;

    public /* synthetic */ RunnableC0303l0(SearchBar searchBar, int i7) {
        this.f6607q = i7;
        this.f6608r = searchBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6607q) {
            case 0:
                SearchBar searchBar = this.f6608r;
                searchBar.setSearchQueryInternal(searchBar.f6503q.getText().toString());
                return;
            default:
                SearchBar searchBar2 = this.f6608r;
                searchBar2.f6503q.requestFocusFromTouch();
                searchBar2.f6503q.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, searchBar2.f6503q.getWidth(), searchBar2.f6503q.getHeight(), 0));
                searchBar2.f6503q.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, searchBar2.f6503q.getWidth(), searchBar2.f6503q.getHeight(), 0));
                return;
        }
    }
}
