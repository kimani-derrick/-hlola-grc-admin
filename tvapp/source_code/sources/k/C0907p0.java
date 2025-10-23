package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
/* renamed from: k.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907p0 extends AbstractC0875Z {

    /* renamed from: C  reason: collision with root package name */
    public final int f12075C;

    /* renamed from: D  reason: collision with root package name */
    public final int f12076D;

    /* renamed from: E  reason: collision with root package name */
    public InterfaceC0899l0 f12077E;
    public j.k F;

    public C0907p0(Context context, boolean z7) {
        super(context, z7);
        if (1 == AbstractC0905o0.a(context.getResources().getConfiguration())) {
            this.f12075C = 21;
            this.f12076D = 22;
            return;
        }
        this.f12075C = 22;
        this.f12076D = 21;
    }

    @Override // k.AbstractC0875Z, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.g gVar;
        int i7;
        j.k kVar;
        int pointToPosition;
        int i8;
        if (this.f12077E != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i7 = headerViewListAdapter.getHeadersCount();
                gVar = (j.g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (j.g) adapter;
                i7 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i8 = pointToPosition - i7) >= 0 && i8 < gVar.getCount()) {
                kVar = gVar.getItem(i8);
            } else {
                kVar = null;
            }
            j.k kVar2 = this.F;
            if (kVar2 != kVar) {
                j.j jVar = gVar.f11441q;
                if (kVar2 != null) {
                    this.f12077E.g(jVar, kVar2);
                }
                this.F = kVar;
                if (kVar != null) {
                    this.f12077E.a(jVar, kVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.f12075C) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i7 == this.f12076D) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j.g) adapter).f11441q.c(false);
            return true;
        } else {
            return super.onKeyDown(i7, keyEvent);
        }
    }

    public void setHoverListener(InterfaceC0899l0 interfaceC0899l0) {
        this.f12077E = interfaceC0899l0;
    }

    @Override // k.AbstractC0875Z, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
