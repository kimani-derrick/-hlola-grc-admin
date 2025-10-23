package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public abstract class l implements r, p, AdapterView.OnItemClickListener {

    /* renamed from: q  reason: collision with root package name */
    public Rect f11490q;

    public static int m(g gVar, Context context, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = gVar.getCount();
        int i8 = 0;
        int i9 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = gVar.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = gVar.getView(i10, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    public static boolean u(j jVar) {
        int size = jVar.f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = jVar.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // j.p
    public final boolean e(k kVar) {
        return false;
    }

    @Override // j.p
    public final boolean g(k kVar) {
        return false;
    }

    public abstract void l(j jVar);

    public abstract void n(View view);

    public abstract void o(boolean z7);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        g gVar;
        int i8;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            gVar = (g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            gVar = (g) listAdapter;
        }
        j jVar = gVar.f11441q;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i7);
        if (!(this instanceof f)) {
            i8 = 0;
        } else {
            i8 = 4;
        }
        jVar.p(menuItem, this, i8);
    }

    public abstract void p(int i7);

    public abstract void q(int i7);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z7);

    public abstract void t(int i7);

    @Override // j.p
    public final void a(Context context, j jVar) {
    }
}
